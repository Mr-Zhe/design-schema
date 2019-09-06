package com.group.singleton.doublechecklock;

/**
 * 双重检查加锁:首先进入该方法时进行null == sInstance检查，
 *          如果第一次检查通过，即没有实例创建，则进入synchronized控制的同步块,并再次检查实例是否创建，
 *          如果仍未创建，则创建该实例
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/9/6 15:29
 * @version: 1.1.0
 */
public class DoubleCheckLockingSingleton {
    private static volatile DoubleCheckLockingSingleton singleton;
    private DoubleCheckLockingSingleton(){}
    public static DoubleCheckLockingSingleton getInstance(){
        if (null == singleton){
            synchronized (DoubleCheckLockingSingleton.class){
                if (null == singleton){
                    singleton = new DoubleCheckLockingSingleton();
                }
            }
        }
        return singleton;
    }
}
