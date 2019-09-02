package com.group.factorymethod;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/9/2 13:51
 * @version: 1.1.0
 */
public class Undergraduate extends AbstractLeiFeng {
    @Override
    public void sweep() {
        System.out.println("Undergraduate sweep");
    }

    @Override
    public void wash() {
        System.out.println("Undergraduate wash");
    }

    @Override
    public void buyRice() {
        System.out.println("Undergraduate buyRice");
    }
}
