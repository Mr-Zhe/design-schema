package com.group.strategy;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/8/30 13:42
 * @version: 1.1.0
 */
public class DiscountSettlementStrategy extends AbstractSettlementStrategy {
    private Double discount;

    public DiscountSettlementStrategy(Double discount) {
        this.discount = discount;
    }

    @Override
    public double algorithmMethod(double money) {
        System.out.println("打折促销结算收费");
        return money * discount;
    }
}
