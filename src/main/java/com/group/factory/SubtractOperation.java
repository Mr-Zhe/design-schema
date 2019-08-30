package com.group.factory;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/8/29 15:05
 * @version: 1.1.0
 */
public class SubtractOperation extends Operation {
    @Override
    public Double calculation() {
        setResult(getNumberOne() - getNumberTwo());
        return getResult();
    }
}
