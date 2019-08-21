package org.nz.springall_start_demo.test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import javafx.application.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.nz.springall_start_demo.SpringallStartDemoApplication;
import org.nz.springall_start_demo.SpringallStartDemoApplicationTests;
import org.nz.springall_start_demo.pojo.Apply;
import org.nz.springall_start_demo.service.ApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringallStartDemoApplication.class)
public class GenratorTest {
    @Autowired
    private ApplyService applyService;

    @Test
    public void test() throws Exception{
        List<Apply> applys = applyService.selectAll();
        new ObjectMapper().writeValueAsString(applys);
        System.out.println(new Gson().toJson(applys));
    }
}
