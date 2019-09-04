package com.group.builder;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/9/4 13:46
 * @version: 1.1.0
 */
public class Student extends PersonBuilder {
    private String sno;

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    @Override
    public void out() {
        this.setName("wang");
        this.setSno("12345555");
        System.out.println(String.format("学生姓名:%s 学号:%s", this.getName(), this.getSno()));
    }
}
