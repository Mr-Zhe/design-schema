package com.group.singleton.enumeration;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/9/6 15:59
 * @version: 1.1.0
 */
public enum SingletonEnum {
    INSTANCE("单例的枚举方式");
    private String name;

    private SingletonEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
