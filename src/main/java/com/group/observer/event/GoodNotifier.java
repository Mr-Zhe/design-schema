package com.group.observer.event;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/9/5 13:34
 * @version: 1.1.0
 */
public class GoodNotifier extends Notifier {
    @Override
    public void notifyObserver() {
        try {
            getEventHandle().notifyEvent();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
