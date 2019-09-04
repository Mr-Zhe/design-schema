package com.group.builder;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/9/4 14:00
 * @version: 1.1.0
 */
public class BuildTest {
    public static void main(String[] args) {
        PersonBuilder student = new Student();
        PersonDirector director = new PersonDirector(student);
        director.createPerson();

        Teacher teacher = Teacher.builder().id(1).name("zhang").sex("男").build();
        teacher.out();
    }
}
