package com.group.prototype;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/9/3 11:02
 * @version: 1.1.0
 */
public class WorkExperience implements Cloneable{
    private String workDate;
    private String company;

    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Object cloneWork() throws CloneNotSupportedException {
        return this.clone();
    }
}
