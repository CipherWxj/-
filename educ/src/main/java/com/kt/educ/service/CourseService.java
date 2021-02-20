package com.kt.educ.service;

import com.kt.educ.dao.CourseDao;
import com.kt.educ.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseDao courseDao;

    //查询课程
    public List<Course> getCourse(String num) {
        return courseDao.getCourse(num);
    }
}
