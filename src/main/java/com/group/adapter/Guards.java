package com.group.adapter;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/9/6 11:29
 * @version: 1.1.0
 */
public class Guards extends Player {
    public Guards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("attack");
    }

    @Override
    public void defense() {
        System.out.println("defense");
    }
}
