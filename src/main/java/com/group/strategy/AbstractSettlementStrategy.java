package com.group.strategy;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/8/30 11:27
 * @version: 1.1.0
 */
public abstract class AbstractSettlementStrategy {


    /**
     * 结算的算法
     * @param money money
     * @return double
     */
    public abstract double algorithmMethod(double money);
}
