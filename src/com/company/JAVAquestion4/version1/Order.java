package com.company.JAVAquestion4.version1;
import java.math.BigDecimal;

/**
 * Created by Alex on 5/25/2016.
 */
public class Order
{
    private BigDecimal quantity, price;
    public Type commisionType;

    public Order(BigDecimal quantity, BigDecimal price,  Type commisionType )
    {
        this.quantity = quantity;
        this.price = price;
        this.commisionType = commisionType;
    }

    public  BigDecimal getQuantity()
    {
        return quantity;
    }

    public BigDecimal getPrice()
    {
        return price;
    }

    public void setQuantity(BigDecimal quantity)
    {
        this.quantity = quantity;
    }

    public void setPrice(BigDecimal price)
    {
        this.price = price;
    }

    public BigDecimal calculateCommesion()
    {
        return commisionType.calculate(getQuantity(), getPrice());
    }

    public void setCalculationType(Type newCommisionType)
    {
        commisionType = newCommisionType;
    }
}