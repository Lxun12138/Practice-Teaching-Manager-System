package com.xupt.entity;

/**
 * @Auther: liuxun
 * @Date: 2019/3/12
 * @Description:
 */
public class Laboratory {

            private int labId;
            private String labNo;
            private String labName;
            private int labMaxNum;
            private String labIntroduction;
            private int labFlag;

    public int getLabId() {
        return labId;
    }

    public void setLabId(int labId) {
        this.labId = labId;
    }

    public String getLabNo() {
        return labNo;
    }

    public void setLabNo(String labNo) {
        this.labNo = labNo;
    }

    public String getLabName() {
        return labName;
    }

    public void setLabName(String labName) {
        this.labName = labName;
    }

    public int getLabMaxNum() {
        return labMaxNum;
    }

    public void setLabMaxNum(int labMaxNum) {
        this.labMaxNum = labMaxNum;
    }

    public String getLabIntroduction() {
        return labIntroduction;
    }

    public void setLabIntroduction(String labIntroduction) {
        this.labIntroduction = labIntroduction;
    }

    public int getLabFlag() {
        return labFlag;
    }

    public void setLabFlag(int labFlag) {
        this.labFlag = labFlag;
    }
}
