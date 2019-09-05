package com.group.observer.event;

import java.lang.reflect.Method;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/9/5 13:33
 * @version: 1.1.0
 */
public class Event {
    private Object target;
    private String methodName;
    private Object[] params;
    private Class[] paramTypes;

    public Event(Object object, String methodName, Object... params) {
        this.target = object;
        this.methodName = methodName;
        this.params = params;
        contractParamTypes(this.params);
    }

    public void contractParamTypes(Object[] params) {
        if (params == null) {
            return;
        }
        paramTypes = new Class[params.length];
        for (int i = 0; i < params.length; i++) {
            paramTypes[i] = params[i].getClass();
        }
    }

    public void invoke() throws Exception {
        Method method = this.target.getClass().getMethod(methodName, this.paramTypes);
        if (method != null) {
            method.invoke(this.target, this.params);
        }
    }
}
