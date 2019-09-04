package com.group.builder;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/9/4 10:33
 * @version: 1.1.0
 */
public abstract class PersonBuilder {
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void out();

}
