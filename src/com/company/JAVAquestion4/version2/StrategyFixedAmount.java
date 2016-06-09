package com.company.JAVAquestion4.version2;

import java.math.BigDecimal;

/**
 * Created by fns02 on 6/5/2016.
 */
public class StrategyFixedAmount implements Strategy {

    private final BigDecimal value;

    public StrategyFixedAmount(BigDecimal value) {
        this.value = value;
    }

    @Override
    public BigDecimal calculate(Order order) {
        return value;
    }
}
