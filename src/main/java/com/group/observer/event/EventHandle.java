package com.group.observer.event;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/9/5 13:34
 * @version: 1.1.0
 */
public class EventHandle {
    private List<Event> events;

    public EventHandle() {
        events = new ArrayList<>();
    }

    public void addEvent(Object target, String method, Object... params) {
        Event event = new Event(target, method, params);
        events.add(event);
    }

    public void notifyEvent() throws Exception {
        for (Event event : events) {
            event.invoke();
        }
    }
}
