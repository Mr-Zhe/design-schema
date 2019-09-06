package com.group.singleton.lazy;

/**
 * 懒汉模式:单例实例在第一次使用时进行创建，这种情况下避免了饿汉式可能遇到的问题
 * 缺点：多个线程密集调用getInstance时，存在创建多个实例的可能。
 *      如线程A进入null == sInstance这段代码块，而在A线程未创建完成实例时，如果线程B也进入了该代码块，必然会造成两个实例的产生。
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/9/6 15:19
 * @version: 1.1.0
 */
public class LazySingleton {
    private static LazySingleton lazySingleton = null;
    private LazySingleton(){}
    public static LazySingleton getInstance(){
        if (lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
