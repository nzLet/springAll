package org.nz.springall_start_demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.nz.springall_start_demo.pojo.Student;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface StudentMapper {
    int insert(Student student);
    int update(Student student);
    int deleteByIds(String sno);
    Student queryStudentById(String id);
    List<Student> queryStudents();
}
