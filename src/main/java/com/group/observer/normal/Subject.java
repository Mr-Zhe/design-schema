package com.group.observer.normal;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/9/4 15:11
 * @version: 1.1.0
 */
public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObserver();
    String getState();
}
