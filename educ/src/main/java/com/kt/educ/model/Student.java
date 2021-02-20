package com.kt.educ.model;

import java.util.List;

//学生信息
public class Student {

    private int id;  //主键
    private String studentId;  //学号
    private String studentName;  //姓名
    private List<Score> scoreList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public List<Score> getScoreList() { return scoreList; }

    public void setScoreList(List<Score> scoreList) { this.scoreList = scoreList; }
}
