package com.company.JAVAquestion4.version1;
import java.math.BigDecimal;

/**
 * Created by Alex on 5/25/2016.
 */
public class PersentCommision implements Type
{
    @Override
    public BigDecimal calculate(BigDecimal quantity, BigDecimal price)
    {
        return quantity.multiply(price).multiply(new BigDecimal(0.10));
    }
}