package com.xupt.entity;

import java.io.Serializable;

/**
 * @Auther: liuxun
 * @Date: 2019/3/12
 * @Description:
 */
public class Class implements Serializable {

    private static final Long serialVersionUID =1L;

    private int classId;
    private String college;
    private String profession;
    private String classes;
    private int classNum;

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public int getClassNum() {
        return classNum;
    }

    public void setClassNum(int classNum) {
        this.classNum = classNum;
    }
}
