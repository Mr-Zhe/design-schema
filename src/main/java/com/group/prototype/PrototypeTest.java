package com.group.prototype;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/9/3 13:41
 * @version: 1.1.0
 */
public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Resume resume = new Resume("wang");
        resume.setSex("男");
        resume.setAge(19);
        resume.setWorkExperience("2005-2010", "北京xxx公司");
        Resume resume1 = resume.cloneResume();
        resume1.setWorkExperience("2010-2015", "上海xxx公司");
        Resume resume2 = resume.cloneResume();
        resume2.setWorkExperience("2015-至今", "美国xxx公司");
        resume.show();
        resume1.show();
        resume2.show();
    }
}
