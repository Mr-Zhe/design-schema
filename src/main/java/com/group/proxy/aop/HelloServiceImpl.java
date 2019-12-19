package com.group.proxy.aop;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/12/19 15:41
 * @version: 1.1.0
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public void sayHello(String name) {
        if (name == null || name.trim().equals("")) {
            throw new RuntimeException("parameter is null ! ! ");
        }

        System.out.println("hello " + name);
    }
}
