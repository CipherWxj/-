package com.kt.educ.controller;

import com.kt.educ.model.Course;
import com.kt.educ.service.CourseService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class CourseController {

    @Resource
    CourseService courseService;

    @RequestMapping("/cou/{num}")
        public List<Course> getCouWithSco(@PathVariable("num") String num) {
        List<Course> courses = courseService.getCourse(num);
        return courses;
    }
}
