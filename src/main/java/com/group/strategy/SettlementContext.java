package com.group.strategy;

import java.util.Map;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/8/30 11:26
 * @version: 1.1.0
 */
public class SettlementContext {
    AbstractSettlementStrategy settlementStrategy;

    public SettlementContext(SettlementType strategy, Map<String, Double> params) {
        switch (strategy) {
            case NORMAL:
                settlementStrategy = new NormalSettlementStrategy();
                break;
            case DISCOUNT:
                Double discount = params.get("discount");
                settlementStrategy = new DiscountSettlementStrategy(discount);
                break;
            case FULL_CUT:
                Double full = params.get("full");
                Double cut = params.get("cut");
                settlementStrategy = new FullCutSettlementStrategy(full, cut);
                break;
            default:
                throw new RuntimeException("未找到相应的结算策略");
        }
    }

    public double settlementResult(double money) {
        return settlementStrategy.algorithmMethod(money);
    }
}
