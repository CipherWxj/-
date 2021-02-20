package com.kt.educ.dao;

import com.kt.educ.model.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface StudentDao {

    //查询学生信息
    List<Student> getStudent(String id);
}
