package com.group.observer.event;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/9/5 13:57
 * @version: 1.1.0
 */
public class EventTest {
    public static void main(String[] args) {
        Notifier notifier = new GoodNotifier();
        DeleObserverA deleObserverA = new DeleObserverA();
        DeleObserverB deleObserverB = new DeleObserverB();
        notifier.addListener(deleObserverA, "update", 123, "一月");
        notifier.addListener(deleObserverB, "delete", 123, "一月");
        notifier.notifyObserver();
    }
}
