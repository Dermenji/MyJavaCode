package com.company.JAVAquestion4.version2;

import java.math.BigDecimal;

/**
 * Created by fns02 on 6/5/2016.
 */
public class StrategyFixedPercent implements Strategy {
    private final BigDecimal percent;

    public StrategyFixedPercent(BigDecimal percent) {
        this.percent = percent;
    }

    @Override
    public BigDecimal calculate(Order order) {
        return order.getQuantity().multiply(order.getPrice()).multiply(percent);
    }
}
