package com.group.facade;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/9/3 17:29
 * @version: 1.1.0
 */
public class StockTwo {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StockTwo(String name) {
        this.name = name;
    }

    public void buy(){
        System.out.println("买" + this.name);
    }

    public void sell(){
        System.out.println("卖" + this.name);
    }
}
