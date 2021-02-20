package com.kt.educ.model;

import java.util.List;

//课程
public class Course {

    private int id;  //主键
    private String courseNum;  //课程编号
    private String courseName;  //课程名称
    private String teacher;  //任课老师
    private List<Score> scoreList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseNum() {
        return courseNum;
    }

    public void setCourseNum(String courseNum) {
        this.courseNum = courseNum;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public List<Score> getScoreList() { return scoreList; }

    public void setScoreList(List<Score> scoreList) { this.scoreList = scoreList; }
}
