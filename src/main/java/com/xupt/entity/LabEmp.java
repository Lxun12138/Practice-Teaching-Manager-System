package com.xupt.entity;

/**
 * @Auther: liuxun
 * @Date: 2019/3/12
 * @Description:
 */
public class LabEmp {

//     `lab_emp_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '实验室_管理人员id',
//            `lab_id` int(11) NOT NULL COMMENT '实验室id',
//            `emp_id` int(11) NOT NULL COMMENT '管理员id',

    private int labEmpId;
    private int labId;
    private int empId;

    public int getLabEmpId() {
        return labEmpId;
    }

    public void setLabEmpId(int labEmpId) {
        this.labEmpId = labEmpId;
    }

    public int getLabId() {
        return labId;
    }

    public void setLabId(int labId) {
        this.labId = labId;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }
}
