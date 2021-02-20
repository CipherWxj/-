package com.kt.educ.service;

import com.kt.educ.dao.ScoreDao;
import com.kt.educ.model.Score;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreService {

    @Autowired
    ScoreDao scoreDao;

    //查询所有学生成绩
    public List<Score> getScore(){
        List<Score> scoreList = scoreDao.getScore();
        return (scoreList);
    }

    //查询单个学生成绩
    public List<Score> getStuScore() {
        List<Score> scoreList = scoreDao.getStuScore();
        return (scoreList);
    }

    //查询课程成绩
    public List<Score> getCouScore() {
        List<Score> scoreList = scoreDao.getCouScore();
        return (scoreList);
    }

}
