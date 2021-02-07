package com.ss.ita.kata.implementation.andriikapustiak;

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
        return 0;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        return null;
    }

    @Override
    public double solveSum(double num) {
        int zeros=0;
        for(int i=2; i<=num; i++) {
            zeros += countFactorsOf5(i);
        }
        return zeros;
    }

    public static int countFactorsOf5(int i)
    {
        int count=0;
        while(i % 5 == 0)
        {
            count++;
            i /= 5;
        }
        return count;
    }


    @Override
    public long[] smallest(long n) {
        return new long[0];
    }
}
