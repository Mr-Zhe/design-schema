package com.group.adapter;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/9/6 11:29
 * @version: 1.1.0
 */
public class Translator extends Player{
    private ForeignCenter foreignCenter;

    public Translator(String name) {
        super(name);
        this.foreignCenter = new ForeignCenter(name);
    }

    @Override
    public void attack() {
        foreignCenter.attack();
    }

    @Override
    public void defense() {
        foreignCenter.defense();
    }
}
