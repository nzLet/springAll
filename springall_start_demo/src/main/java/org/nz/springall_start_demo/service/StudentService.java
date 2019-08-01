package org.nz.springall_start_demo.service;

import org.nz.springall_start_demo.pojo.Student;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import java.util.List;
@CacheConfig(cacheNames = "student")
@Repository
public interface StudentService {
    @CacheEvict(key = "0",beforeInvocation = true)
    int add(Student student);
    @CacheEvict(key = "#p0.sno",beforeInvocation = true)
    int update(Student student);
    @CacheEvict(key = "#p0",allEntries = true)
    int deleteBysno(String sno);
    @Cacheable(key = "#p0")
    Student queryStudentBySno(String sno);
    @Cacheable()
    List queryStudents();
}
