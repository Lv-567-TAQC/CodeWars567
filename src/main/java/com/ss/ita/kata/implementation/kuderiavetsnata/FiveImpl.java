package com.ss.ita.kata.implementation.kuderiavetsnata;

import com.ss.ita.kata.Five;

import java.math.BigInteger;

public class FiveImpl  implements Five {
    @Override
    public int artificialRain(int[] v) {
        return 0;
    }

    @Override
    public long[] gap(int g, long m, long n) {
        return new long[0];
    }

    @Override
    public int zeros(int n) {
        int res = 0;
        for (int i = 5; i <= n; i *= 5) {
            res += n / i;
        }
        return res;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        BigInteger sum = BigInteger.ZERO;
        BigInteger num1 = BigInteger.ZERO;
        BigInteger num2 = BigInteger.ONE;
        BigInteger num3 = BigInteger.ONE;

        for(int i = 0; i <= n.intValue(); i++) {
            num1 = num2;
            num2 = num3;
            num3 = num1.add(num2);
            sum = sum.add(num1);
        }
        return sum.multiply(BigInteger.valueOf(4));
    }

    @Override
    public double solveSum(double m) {
        return 0;
    }

    @Override
    public long[] smallest(long n) {
        return new long[0];
    }
}
