package com.company.JAVAquestion4.version2;

import java.math.BigDecimal;

/**
 * Created by fns02 on 6/5/2016.
 */
public class Order {
    private BigDecimal quantity, price;

    public Order(BigDecimal quantity, BigDecimal price) {
        this.quantity = quantity;
        this.price = price;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal calculateCommesion(Strategy strategy) {
        return strategy.calculate(this);
    }
}


