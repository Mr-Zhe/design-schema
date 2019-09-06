package com.group.singleton.inner;

/**
 * 静态类部类：使用了lazy-loading。InnerSingleton类被装载了，但是instance并没有立即初始化。
 *      因为SingletonHolder类没有被主动使用，只有显示通过调用getInstance方法时，才会显示装载SingletonHolder类，
 *      从而实例化instance
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/9/6 15:46
 * @version: 1.1.0
 */
public class InnerSingleton {

    private InnerSingleton() {
    }

    public static final InnerSingleton getInstance() {
        return SingletonHolder.instance;
    }

    private static class SingletonHolder {
        private static final InnerSingleton instance = new InnerSingleton();
    }
}
