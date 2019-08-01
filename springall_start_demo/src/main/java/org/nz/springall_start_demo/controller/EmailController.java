package org.nz.springall_start_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import javax.mail.internet.MimeMessage;
import java.io.File;

@RestController
@RequestMapping("mail")
public class EmailController {
    @Autowired
    private JavaMailSender javaMailSender;

    @Autowired
    private TemplateEngine templateEngine;

    @Value("${spring.mail.username}")
    private String from;

    @RequestMapping("easyEmail")
    public String sendEasyEmail(){
        try{
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom(from);
            message.setTo("15225985337@163.com");
            message.setSubject("Easy Email for you!");
            message.setText("Every cloud has a silver lining.\n" +
                    "每朵乌云背后都有一道阳光。");
            javaMailSender.send(message);
            return "发送成功";
        }catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }
    }

    @RequestMapping("htmlEmail")
    public String sendHtmlEmail() {
        MimeMessage message = null;
        try {
            message = javaMailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setFrom(from);
            helper.setTo("15225985337@163.com"); // 接收地址
            helper.setSubject("一封HTML格式的邮件"); // 标题
            // 带HTML格式的内容
            StringBuffer sb = new StringBuffer("<p style='color:#42b983'>使用Spring Boot发送HTML格式邮件。</p>");
            helper.setText(sb.toString(), true);
            javaMailSender.send(message);
            return "发送成功";
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }

    @RequestMapping("sendAttachmentsMail")
    public String sendAttachmentsMail() {
        MimeMessage message = null;
        try {
            message = javaMailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setFrom(from);
            helper.setTo("15225985337@163.com"); // 接收地址
            helper.setSubject("一封带附件的邮件"); // 标题
            helper.setText("详情参见附件内容！"); // 内容
            // 传入附件
            FileSystemResource file = new FileSystemResource(new File("E:\\springall\\springall_start_demo\\src\\main\\resources\\static\\file\\项目文档.docx"));
            helper.addAttachment("项目文档.docx", file);
            javaMailSender.send(message);
            return "发送成功";
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }

    @RequestMapping("sendInlineMail")
    public String sendInlineMail() {
        MimeMessage message = null;
        try {
            message = javaMailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setFrom(from);
            helper.setTo("15225985337@163.com"); // 接收地址
            helper.setSubject("一封带静态资源的邮件"); // 标题
            helper.setText("<html><body>博客图：<img src='cid:img'/></body></html>", true); // 内容
            // 传入附件
            FileSystemResource file = new FileSystemResource(new File("E:\\springall\\springall_start_demo\\src\\main\\resources\\static\\img\\sunshine.png"));
            helper.addInline("img", file);
            javaMailSender.send(message);
            return "发送成功";
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
    @RequestMapping("sendTemplateEmail")
    public String sendTemplateEmail(String code) {
        MimeMessage message = null;
        try {
            message = javaMailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setFrom(from);
            helper.setTo("15225985337@163.com"); // 接收地址
            helper.setSubject("邮件摸板测试"); // 标题
            // 处理邮件模板
            Context context = new Context();
            context.setVariable("code", code);
            String template = templateEngine.process("emailTemplate", context);
            helper.setText(template, true);
            javaMailSender.send(message);
            return "发送成功";
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }

}
