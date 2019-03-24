package com.xupt.entity;

/**
 * @Auther: liuxun
 * @Date: 2019/3/12
 * @Description:
 */
public class Time {

//     `time_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '时间表',
//            `time_academic_year` varchar(20) NOT NULL COMMENT '学年',
//            `time_semester` int(10) NOT NULL COMMENT '学期',
//            `time_week` int(10) NOT NULL COMMENT '星期',
//            `time_class` int(11) NOT NULL COMMENT '节次',

    private int timeId;
    private String timeAcademicYear;
    private int timeSemester;
    private int timeWeek;
    private int timeClass;

    public int getTimeId() {
        return timeId;
    }

    public void setTimeId(int timeId) {
        this.timeId = timeId;
    }

    public String getTimeAcademicYear() {
        return timeAcademicYear;
    }

    public void setTimeAcademicYear(String timeAcademicYear) {
        this.timeAcademicYear = timeAcademicYear;
    }

    public int getTimeSemester() {
        return timeSemester;
    }

    public void setTimeSemester(int timeSemester) {
        this.timeSemester = timeSemester;
    }

    public int getTimeWeek() {
        return timeWeek;
    }

    public void setTimeWeek(int timeWeek) {
        this.timeWeek = timeWeek;
    }

    public int getTimeClass() {
        return timeClass;
    }

    public void setTimeClass(int timeClass) {
        this.timeClass = timeClass;
    }
}
