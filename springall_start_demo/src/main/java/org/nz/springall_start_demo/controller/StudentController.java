package org.nz.springall_start_demo.controller;

import com.google.gson.Gson;
import org.nz.springall_start_demo.pojo.Student;
import org.nz.springall_start_demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.GsonJsonParser;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private Gson gson;
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<Student> listStudent(String sno){
        List<Student> students = studentService.queryStudents();

        return students;
    }
}
