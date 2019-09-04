package com.group.observer;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/9/4 15:11
 * @version: 1.1.0
 */
public class StockObserver extends Observer {
    public StockObserver(String name, Subject subject) {
        super(name, subject);
    }

    @Override
    public void update() {
        System.out.println(String.format("%s,%s关闭股票行情，继续工作", this.getSubject().getState(), this.getName()));
    }
}
