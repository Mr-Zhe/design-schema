package com.group.strategy;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/8/30 13:42
 * @version: 1.1.0
 */
public class NormalSettlementStrategy extends AbstractSettlementStrategy {
    @Override
    public double algorithmMethod(double money) {
        System.out.println("正常结算收费");
        return money;
    }
}
