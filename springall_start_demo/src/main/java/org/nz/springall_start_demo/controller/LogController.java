package org.nz.springall_start_demo.controller;

import org.nz.springall_start_demo.annotation.Log;
import org.nz.springall_start_demo.service.SyslogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class LogController {
    @Autowired
    private SyslogService syslogService;

    @Log("执行方法一")
    @GetMapping("/1")
    @ResponseBody
    public void methodOne(String name){}
    @Log("执行方法二")
    @GetMapping("/2")
    @ResponseBody
    public void methodTwo() throws InterruptedException {
        Thread.sleep(2000);
    }
    @Log("执行方法三")
    @GetMapping("/3")
    @ResponseBody
    public void methodThree(String name, String age) { }

    @RequestMapping("/list/logs")
    public String allLogs(Model model){
        List logs = syslogService.queryAllLogs();
        model.addAttribute("logs",logs);
        return "list";
    }
}
