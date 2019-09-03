package com.group.prototype;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/9/3 11:01
 * @version: 1.1.0
 */
public class Resume implements Cloneable{
    private String name;
    private int age;
    private String sex;
    private WorkExperience workExperience;

    public Resume(String name) {
        this.name = name;
        this.workExperience = new WorkExperience();
    }

    private Resume(WorkExperience workExperience) throws CloneNotSupportedException {
        this.workExperience = (WorkExperience) workExperience.cloneWork();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public WorkExperience getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(WorkExperience workExperience) {
        this.workExperience = workExperience;
    }

    public void setWorkExperience(String workDate, String company){
        this.workExperience.setWorkDate(workDate);
        this.workExperience.setCompany(company);
    }

    public void show(){
        System.out.println(String.format("姓名:%s 年龄:%s 性别:%s", this.name, this.age, this.sex));
        System.out.println(String.format("工作经历:%s  %s", this.workExperience.getWorkDate(), this.workExperience.getCompany()));
        System.out.println("---------------------------------------------------------------");
    }


    protected Resume cloneResume() throws CloneNotSupportedException {
        Resume resume = new Resume(this.workExperience);
        resume.setName(this.name);
        resume.setAge(this.age);
        resume.setSex(this.sex);
        return resume;
    }
}
