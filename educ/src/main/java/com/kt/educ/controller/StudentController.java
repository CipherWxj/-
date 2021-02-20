package com.kt.educ.controller;


import com.kt.educ.model.Student;
import com.kt.educ.service.StudentService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class StudentController {

    @Resource
    StudentService studentService;

    @RequestMapping("/stu/{id}")
    public List<Student> getStuWithSco(@PathVariable("id") String id) {
        List<Student> student = studentService.getStudent(id);
        return student;
    }
}
