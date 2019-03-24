package com.xupt.entity;

/**
 * @Auther: liuxun
 * @Date: 2019/3/12
 * @Description:
 */
public class CourseTimeSchedule {

    private int scheId;
    private int empCourseId;
    private int timeId;
    private int labId;
    private int classId;

    public int getScheId() {
        return scheId;
    }

    public void setScheId(int scheId) {
        this.scheId = scheId;
    }

    public int getEmpCourseId() {
        return empCourseId;
    }

    public void setEmpCourseId(int empCourseId) {
        this.empCourseId = empCourseId;
    }

    public int getTimeId() {
        return timeId;
    }

    public void setTimeId(int timeId) {
        this.timeId = timeId;
    }

    public int getLabId() {
        return labId;
    }

    public void setLabId(int labId) {
        this.labId = labId;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }
}
