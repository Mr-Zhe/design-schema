package com.group.proxy.aop;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/12/19 16:12
 * @version: 1.1.0
 */
public class ProxyBeanTest {
    public static void main(String[] args) {
        HelloService helloService = new HelloServiceImpl();
        Object proxy = ProxyBean.getProxyBean(helloService, new Myinterceptor());
        HelloService helloServiceProxy = (HelloService) proxy;
        helloServiceProxy.sayHello("zhang san");
        System.out.println("\n########### ####name is null !!! #########\\n");
        helloServiceProxy.sayHello(null);
    }
}
