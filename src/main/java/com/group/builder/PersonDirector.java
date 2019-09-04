package com.group.builder;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/9/4 13:47
 * @version: 1.1.0
 */
public class PersonDirector {
    private PersonBuilder builder;

    public PersonDirector(PersonBuilder builder) {
        this.builder = builder;
    }

    public void createPerson(){
        builder.out();
    }
}
