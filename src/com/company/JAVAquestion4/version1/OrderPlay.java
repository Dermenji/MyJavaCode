package com.company.JAVAquestion4.version1;

import java.math.BigDecimal;

/**
 * Created by Alex on 5/25/2016.
 */
public class OrderPlay
{
    public static void main(String[] args)
    {
        Order o = new Order(new BigDecimal(1), new BigDecimal(2), new AmountCommision());
        System.out.println(o.calculateCommesion());
        o.setCalculationType(new PersentCommision());
        System.out.println(o.calculateCommesion());
    }
}
