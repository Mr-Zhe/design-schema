package com.group.adapter;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/9/6 11:29
 * @version: 1.1.0
 */
public class ForeignCenter {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ForeignCenter(String name) {
        this.name = name;
    }

    public void attack(){
        System.out.println("进攻");
    }
    public void defense(){
        System.out.println("防守");
    }
}
