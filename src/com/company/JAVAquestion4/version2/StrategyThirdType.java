package com.company.JAVAquestion4.version2;

import java.math.BigDecimal;

/**
 * Created by fns02 on 6/5/2016.
 */
public class StrategyThirdType implements Strategy {
    private final BigDecimal porog;
    private final BigDecimal before;
    private final BigDecimal after;

    public StrategyThirdType(BigDecimal porog, BigDecimal before, BigDecimal after) {
        this.porog = porog;
        this.before = before;
        this.after = after;
    }


    @Override
    public BigDecimal calculate(Order order) {
        return order.getQuantity().compareTo(porog) > 0 ? after : before;
    }
}

