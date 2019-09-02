package com.group.factorymethod;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/9/2 14:18
 * @version: 1.1.0
 */
public class UndergraduateFactory implements LeiFengFactory {
    @Override
    public Undergraduate createLeiFeng() {
        return new Undergraduate();
    }
}
