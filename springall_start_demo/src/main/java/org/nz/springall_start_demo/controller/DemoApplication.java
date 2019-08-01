package org.nz.springall_start_demo.controller;

import org.nz.springall_start_demo.pojo.BlogProperties;
import org.nz.springall_start_demo.pojo.ConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties({ConfigBean.class})
public class DemoApplication {
    @Autowired
    private BlogProperties blogProperties;

    @Autowired
    private ConfigBean configBean;

    @RequestMapping("/hello")
    public String hello(){

        return blogProperties.getName()+"————"+blogProperties.getTitle();
    }
    @RequestMapping("/index")
    public String index(){

        return configBean.getName()+"————"+configBean.getTitle();
    }
}
