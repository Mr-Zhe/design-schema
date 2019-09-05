package com.group.observer.event;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/9/5 13:34
 * @version: 1.1.0
 */
public abstract class Notifier {
    private EventHandle eventHandle = new EventHandle();

    public EventHandle getEventHandle() {
        return eventHandle;
    }
    public void addListener(Object target, String method, Object... params){
        eventHandle.addEvent(target, method, params);
    }

    public abstract void notifyObserver();
}
