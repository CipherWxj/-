package com.kt.educ.dao;

import com.kt.educ.model.Course;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CourseDao {

    //查询课程
    List<Course> getCourse(String num);
}
