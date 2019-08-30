package com.group.strategy;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/8/30 13:42
 * @version: 1.1.0
 */
public class FullCutSettlementStrategy extends AbstractSettlementStrategy {
    private Double full;
    private Double cut;

    public FullCutSettlementStrategy(Double full, Double cut) {
        this.full = full;
        this.cut = cut;
    }

    @Override
    public double algorithmMethod(double money) {
        System.out.println("满减活动结算收费");
        double cutMoney = Math.floor(money / full) * cut;
        return money - cutMoney;
    }
}
