package com.clouway.task2;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by clouway on 14-9-9.
 */
public class Sumator {
    public int sum(int a, int b) {
        return a + b;
    }

    public double sum(double a, double b) {
        return a + b;
    }

    public int sum(String a, String b) {

        return Integer.parseInt(a) + Integer.parseInt(b);

    }

    public BigInteger sum(BigInteger a, BigInteger b) {
        BigInteger big1 = a;
        BigInteger big2 = b;
        return big1.add(big2);
    }

    public BigDecimal sum(BigDecimal a, BigDecimal b) {
        return a.add(b);
    }
}