package com.xupt.entity;

/**
 * @Auther: liuxun
 * @Date: 2019/3/12
 * @Description:
 */
public class EmpCourse {


    private int empCourseId;
    private int empId;
    private int courseId;

    public int getEmpCourseId() {
        return empCourseId;
    }

    public void setEmpCourseId(int empCourseId) {
        this.empCourseId = empCourseId;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }
}
