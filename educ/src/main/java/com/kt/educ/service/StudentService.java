package com.kt.educ.service;

import com.kt.educ.dao.StudentDao;
import com.kt.educ.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentDao studentDao;

    //查询学生
    public List<Student> getStudent(String id) {
        return studentDao.getStudent(id);
    }
}
