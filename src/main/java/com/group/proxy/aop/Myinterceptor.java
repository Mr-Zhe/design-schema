package com.group.proxy.aop;

import java.lang.reflect.InvocationTargetException;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/12/19 15:51
 * @version: 1.1.0
 */
public class Myinterceptor implements Interceptor {
    @Override
    public boolean before() {
        System.out.println("before ......");
        return true;
    }

    @Override
    public void after() {
        System.out.println("after ......");
    }

    @Override
    public Object around(Invocation invocation) throws InvocationTargetException, IllegalAccessException {
        System.out.println("around before .....");
        Object obj = invocation.proceed();
        System.out.println("around after .....");
        return obj;
    }

    @Override
    public void afterReturning() {
        System.out.println("afterReturning");
    }

    @Override
    public void afterThrowing() {
        System.out.println("afterThrowing");
    }

    @Override
    public boolean useAround() {
        return true;
    }
}
