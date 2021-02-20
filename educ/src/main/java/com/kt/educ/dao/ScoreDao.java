package com.kt.educ.dao;

import com.kt.educ.model.Score;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ScoreDao {

    //查询所有学生成绩
    List<Score> getScore();

    //查询单个学生成绩
    List<Score> getStuScore();

    //查询课程成绩
    List<Score> getCouScore();
}
