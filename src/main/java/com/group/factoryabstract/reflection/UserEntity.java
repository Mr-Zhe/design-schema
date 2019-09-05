package com.group.factoryabstract.reflection;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/9/5 15:38
 * @version: 1.1.0
 */
public class UserEntity {
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

    public UserEntity(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
