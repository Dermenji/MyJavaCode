package com.company.JAVAquiestion3;

import java.math.BigInteger;

public class Test {
    private final static BigInteger one = new BigInteger("1");


    private void inc1(BigInteger d) {
        d.add(one);
    }

    private void inc2(BigInteger d) {
        d = d.add(one);
    }

    private BigInteger inc3(BigInteger d) {
        return d.add(one);
    }

    public static void main(String[] args) {
        Test t = new Test();

        BigInteger a = new BigInteger("1");
        t.inc1(a);
        System.out.println(a);

        BigInteger b = new BigInteger("1");
        t.inc2(b);
        System.out.println(b);

        BigInteger c = new BigInteger("1");
        System.out.println(t.inc3(c));

    }

  /*  inc1 - you do not use the return value of d.add(one)
    inc2 - you only overwrite the local variable d with the result
    inc3 - here you return the calculated value, so it works
    The add method is not modifiying the current object, it only returns a new object that has the calculated value.

    Also it doesn't make sense to call a variable "one" when it has value 2.

    And there are constants for that, BigInteger.ZERO, BigInteger.ONE, BigInteger.TWO, ..

    https://docs.oracle.com/javase/7/docs/api/java/math/BigInteger.html*/
}
