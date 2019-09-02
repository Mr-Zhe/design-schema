package com.group.proxy;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/9/2 10:40
 * @version: 1.1.0
 */
public class ProxyTest {
    public static void main(String[] args) {
        SchoolGirl girl = new SchoolGirl("wang");
        PursuerProxy proxy = new PursuerProxy(girl);
        proxy.giveDolls();
        proxy.giveFlowers();
        proxy.giveChocolate();
    }
}
