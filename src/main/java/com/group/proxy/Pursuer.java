package com.group.proxy;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/9/2 10:20
 * @version: 1.1.0
 */
public class Pursuer implements GiveGift {
    private SchoolGirl girl;

    public Pursuer(SchoolGirl girl) {
        this.girl = girl;
    }

    @Override
    public void giveDolls() {
        System.out.println(String.format("送玩具给%s", girl.getName()));
    }

    @Override
    public void giveFlowers() {
        System.out.println(String.format("送花给%s", girl.getName()));
    }

    @Override
    public void giveChocolate() {
        System.out.println(String.format("送巧克力给%s", girl.getName()));
    }
}
