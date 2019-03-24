package com.xupt.entity;

/**
 * @Auther: liuxun
 * @Date: 2019/3/12
 * @Description:
 */
public class CourseType {

    private int courseTypeId;
    private int courseId;
    private int courseType;

    public int getCourseTypeId() {
        return courseTypeId;
    }

    public void setCourseTypeId(int courseTypeId) {
        this.courseTypeId = courseTypeId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getCourseType() {
        return courseType;
    }

    public void setCourseType(int courseType) {
        this.courseType = courseType;
    }
}
