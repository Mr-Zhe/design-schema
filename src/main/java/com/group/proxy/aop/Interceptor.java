package com.group.proxy.aop;

import java.lang.reflect.InvocationTargetException;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/12/19 15:45
 * @version: 1.1.0
 */
public interface Interceptor {
    boolean before();

    void after();

    Object around(Invocation invocation) throws InvocationTargetException, IllegalAccessException;

    void afterReturning();

    void afterThrowing();

    boolean useAround();
}
