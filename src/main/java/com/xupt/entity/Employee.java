package com.xupt.entity;


import java.io.Serializable;

/**
 * @Auther: liuxun
 * @Date: 2019/3/11
 * @Description:
 */
public class Employee implements Serializable {

    private int empId;
    private String  empNo;
    private String empPass;
    private String empName;
    private int empTelNum;
    private int age;
    private int sex;
    private String empAddress;
    private String empEmail;
    private String empDepartment;
    private int empFlag;

    private static final Integer Useing=0;

    private static final Integer NotUseing=1;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public String getEmpPass() {
        return empPass;
    }

    public void setEmpPass(String empPass) {
        this.empPass = empPass;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpTelNum() {
        return empTelNum;
    }

    public void setEmpTelNum(int empTelNum) {
        this.empTelNum = empTelNum;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public String getEmpDepartment() {
        return empDepartment;
    }

    public void setEmpDepartment(String empDepartment) {
        this.empDepartment = empDepartment;
    }

    public int getEmpFlag() {
        return empFlag;
    }

    public void setEmpFlag(int empFlag) {
        this.empFlag = empFlag;
    }
}
