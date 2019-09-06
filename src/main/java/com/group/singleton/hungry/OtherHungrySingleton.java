package com.group.singleton.hungry;

/**
 * 饿汉模式:单例的实例在类装载时进行创建，如果单例类的构造方法中没有包含过多的操作处理，饿汉式是可以接受的
 * 缺点：如果构造方法中存在过多的处理，会导致加载这个类时比较慢，可能引起性能问题
 * 如果使用饿汉式的话，只进行了类的装载，并没有实质的调用，会造成资源的浪费
 *
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/9/6 15:15
 * @version: 1.1.0
 */
public class OtherHungrySingleton {
    private static OtherHungrySingleton singleton = null;

    static {
        singleton = new OtherHungrySingleton();
    }

    private OtherHungrySingleton() {
    }

    public static OtherHungrySingleton getInstance() {
        return singleton;
    }
}
