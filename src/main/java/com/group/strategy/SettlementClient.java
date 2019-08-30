package com.group.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/8/30 14:26
 * @version: 1.1.0
 */
public class SettlementClient {
    public static void main(String[] args) {
        SettlementContext normalContext = new SettlementContext(SettlementType.NORMAL, null);
        System.out.println(normalContext.settlementResult(3000));

        Map<String, Double> params = new HashMap<>(16);
        params.put("discount", 0.5D);
        SettlementContext discountContext = new SettlementContext(SettlementType.DISCOUNT, params);
        System.out.println(discountContext.settlementResult(3000));

        params.put("full", 500D);
        params.put("cut", 200D);
        SettlementContext fullCutContext = new SettlementContext(SettlementType.FULL_CUT, params);
        System.out.println(fullCutContext.settlementResult(3030));

    }
}
