package com.group.factory;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/8/29 14:38
 * @version: 1.1.0
 */
public class AddOperation extends Operation{
    @Override
    public Double calculation() {
        setResult(getNumberOne() + getNumberTwo());
        return getResult();
    }
}
