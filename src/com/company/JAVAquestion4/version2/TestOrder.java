package com.company.JAVAquestion4.version2;

import java.math.BigDecimal;

/**
 * Created by fns02 on 6/5/2016.
 */
public class TestOrder {
    public static void main(String[] args) {

        Order order1 = new Order(new BigDecimal(10), new BigDecimal(100));
        Order order2 = new Order(new BigDecimal(100), new BigDecimal(300));
        Order order3 = new Order(new BigDecimal(40), new BigDecimal(700));

        Strategy strategy1 = new StrategyFixedAmount(new BigDecimal(200));
        Strategy strategy2 = new StrategyFixedPercent(new BigDecimal(0.1));
        Strategy strategy3 = new StrategyThirdType(new BigDecimal(200), new BigDecimal(50), new BigDecimal(100));

        System.out.println(order1.calculateCommesion(strategy1));
        System.out.println(order1.calculateCommesion(strategy2));
        System.out.println(order1.calculateCommesion(strategy3));

        System.out.println(order2.calculateCommesion(strategy1));
        System.out.println(order2.calculateCommesion(strategy2));
        System.out.println(order2.calculateCommesion(strategy3));

        System.out.println(order3.calculateCommesion(strategy1));
        System.out.println(order3.calculateCommesion(strategy2));
        System.out.println(order3.calculateCommesion(strategy3));
    }
}
