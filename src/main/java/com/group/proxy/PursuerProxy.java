package com.group.proxy;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/9/2 10:28
 * @version: 1.1.0
 */
public class PursuerProxy implements GiveGift {
    private Pursuer target;

    public PursuerProxy(SchoolGirl girl) {
        System.out.println("我是送礼物的代理....");
        this.target = new Pursuer(girl);
    }

    @Override
    public void giveDolls() {
        target.giveDolls();
    }

    @Override
    public void giveFlowers() {
        target.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        target.giveChocolate();
    }
}
