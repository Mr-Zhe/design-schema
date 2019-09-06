package com.group.adapter;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/9/6 11:28
 * @version: 1.1.0
 */
public abstract class Player {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player(String name) {
        this.name = name;
    }

    public abstract void attack();
    public abstract void defense();
}
