package org.nz.springall_start_demo.service.impl;

import org.nz.springall_start_demo.mapper.StudentMapper;
import org.nz.springall_start_demo.pojo.Student;
import org.nz.springall_start_demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public int add(Student student) {
        return this.studentMapper.insert(student);
    }

    @Override
    public int update(Student student) {
        return this.studentMapper.update(student);
    }

    @Override
    public int deleteBysno(String sno) {
        return this.studentMapper.deleteByIds(sno);
    }

    @Override
    public Student queryStudentBySno(String sno) {
        return this.studentMapper.queryStudentById(sno);
    }

    @Override
    public List<Student> queryStudents() {
        return this.studentMapper.queryStudents();
    }
}
