package com.ss.ita.kata.implementation.nataliia0223;

import com.ss.ita.kata.Five;

import java.math.BigInteger;

public class FiveImpl implements Five {

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
        return n / 5;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        int n0 = 0;
        int n1 = 1;
        int n2 = n0 + n1;
        int sum = 0;
        for (int i = 0; i <= n.intValue(); i++) {
            sum += n2;
            n2 += n0;
            n0 = n1;
            n1 = n2;
        }
        return BigInteger.valueOf(sum * 4);
    }

    @Override
    public double solveSum(double m) {

        return 1 + (1 - Math.sqrt(1 + 4 * m)) / (2 * m);
    }

    @Override
    public long[] smallest(long n) {
        return new long[0];
    }
}
