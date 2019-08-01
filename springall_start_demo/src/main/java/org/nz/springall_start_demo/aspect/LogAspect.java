package org.nz.springall_start_demo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.nz.springall_start_demo.annotation.Log;
import org.nz.springall_start_demo.pojo.Syslog;
import org.nz.springall_start_demo.service.SyslogService;
import org.nz.springall_start_demo.utils.IPUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.LocalVariableTableParameterNameDiscoverer;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.UUID;

@Aspect
@Component
public class LogAspect {
    @Autowired
    private SyslogService syslogService;
    @Pointcut("@annotation(org.nz.springall_start_demo.annotation.Log)")
    public void pointcut(){}
    @Around("pointcut()")
    public Object around(ProceedingJoinPoint point){
        Object result = null;
        long beginTime = System.currentTimeMillis();
        try{
            //执行方法
            result = point.proceed();
        }catch (Throwable e){
            e.printStackTrace();
        }
        //执行时间
        long time = System.currentTimeMillis() - beginTime;
        saveLog(point,time);
        return result;
    }

    private void saveLog(ProceedingJoinPoint joinPoint,long time){
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        Method method = signature.getMethod();
        Syslog syslog = new Syslog();
        Log logAnnotation = method.getAnnotation(Log.class);
        if (logAnnotation !=null){
            //注解上的描述
            syslog.setOperation(logAnnotation.value());
        }
        //请求的方法名
        String className = joinPoint.getTarget().getClass().getName();
        String methodName = signature.getName();
        syslog.setMethod(className+"."+methodName+"()");
        //请求方法的参数值
        Object[] args = joinPoint.getArgs();
        //请求方法的参数名称
        LocalVariableTableParameterNameDiscoverer discoverer = new LocalVariableTableParameterNameDiscoverer();
        String[] paramNames = discoverer.getParameterNames(method);
        if (args !=null && paramNames!=null){
            String params = "";
            for (int i = 0; i < args.length; i++) {
                params += "  " + paramNames[i] + ": " + args[i];
            }
            syslog.setParams(params);
        }
        //获取request
        HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
        //设置IP
        syslog.setIp(IPUtil.getIpAddr(request));
        //设置用户名，ID
        syslog.setId(UUID.randomUUID().toString().replaceAll("-",""));
        syslog.setCreateTime(new Date());
        syslog.setUsername("NZ");
        syslog.setTime((int)time);
        //保存日志
        System.out.println("=============================="+syslog);
        syslogService.saveSysLog(syslog);
    }
}
