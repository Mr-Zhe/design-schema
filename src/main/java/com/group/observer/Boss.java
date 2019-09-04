package com.group.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/9/4 15:11
 * @version: 1.1.0
 */
public class Boss implements Subject {
    private String actionState;

    private List<Observer> observers = new ArrayList<>(16);

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    @Override
    public String getState() {
        return actionState;
    }

    public String getActionState() {
        return actionState;
    }

    public void setActionState(String actionState) {
        this.actionState = actionState;
    }
}
