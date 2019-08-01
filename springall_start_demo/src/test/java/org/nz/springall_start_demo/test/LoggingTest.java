package org.nz.springall_start_demo.test;

import com.sun.glass.ui.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.nz.springall_start_demo.pojo.Student;
import org.nz.springall_start_demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class LoggingTest {
    @Autowired
    private StudentService studentService;

    @Test
    public void test() throws Exception{
        Student student1 = this.studentService.queryStudentBySno("001");
        System.out.println("学号"+student1.getSno()+"姓名"+student1.getSname());

        student1.setSname("kangkang");
        this.studentService.update(student1);

        Student student2 = this.studentService.queryStudentBySno("001");
        System.out.println("学号"+student2.getSno()+"姓名"+student2.getSname());
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");




        Student student4 = this.studentService.queryStudentBySno("002");
        System.out.println("学号"+student4.getSno()+"姓名"+student4.getSname());
        student4.setSname("zhangsan");
        this.studentService.update(student4);

        Student student3 = this.studentService.queryStudentBySno("002");
        System.out.println("学号"+student3.getSno()+"姓名"+student3.getSname());

    }
}
