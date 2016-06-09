package com.company.JAVAquestion4.version1;

import java.math.BigDecimal;

/**
 * Created by Alex on 5/25/2016.
 */
public class AmountCommision implements Type
{
    @Override
    public BigDecimal calculate(BigDecimal quantity, BigDecimal price)
    {
        return new BigDecimal("200.00");
    }
}