package com.group.factorymethod;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/9/2 14:16
 * @version: 1.1.0
 */
public class Volunteer extends AbstractLeiFeng {
    @Override
    public void sweep() {
        System.out.println("Volunteer sweep");
    }

    @Override
    public void wash() {
        System.out.println("Volunteer wash");
    }

    @Override
    public void buyRice() {
        System.out.println("Volunteer buyRice");
    }
}
