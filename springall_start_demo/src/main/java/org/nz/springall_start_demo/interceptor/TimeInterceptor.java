package org.nz.springall_start_demo.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

public class TimeInterceptor implements HandlerInterceptor {
    private static Logger logger = LoggerFactory.getLogger(TimeInterceptor.class);
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logger.info("拦截之前");
        request.setAttribute("startTime",new Date().getTime());
        logger.info(((HandlerMethod)handler).getBean().getClass().getName());
        logger.info(((HandlerMethod)handler).getMethod().getName());
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        logger.info("开始处理拦截");
        Long start = (Long) request.getAttribute("startTime");
        logger.info("【拦截器】耗时"+(new Date().getTime()-start));

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        logger.info("处理拦截之后");
        Long start = (Long) request.getAttribute("startTime");
        logger.info("【拦截器】耗时"+(new Date().getTime()-start));
        logger.info("异常信息"+ex);
    }
}
