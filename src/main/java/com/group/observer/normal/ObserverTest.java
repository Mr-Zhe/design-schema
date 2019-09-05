package com.group.observer.normal;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/9/4 15:34
 * @version: 1.1.0
 */
public class ObserverTest {
    public static void main(String[] args) {
        Boss boss = new Boss();
        StockObserver stockObserver = new StockObserver("wang", boss);
        NBAObserver nbaObserver = new NBAObserver("li", boss);
        boss.attach(stockObserver);
        boss.attach(nbaObserver);
        boss.setActionState("老板回来了");
        boss.notifyObserver();

        boss.detach(stockObserver);
        boss.notifyObserver();
    }
}
