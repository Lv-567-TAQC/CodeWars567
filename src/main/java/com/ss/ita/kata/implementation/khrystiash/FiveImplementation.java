package com.ss.ita.kata.implementation.khrystiash;

import com.ss.ita.kata.Five;

import java.math.BigInteger;

public class FiveImplementation implements Five {
    public static final int COUNT_OF_NUMBERS_FOR_ONE_MORE_NULL = 5;
    public static final int NUMBER_OF_SQUARE_SIDES = 4;

    @Override
    public int artificialRain(int[] v) {
        int sections_value_old = 0;
        int sections_value_new = 0;
        for (int i = 0, j = 0; i < v.length; i++) {
            j = i;
            while (j < v.length-1) {
                if (v[j] >= v[j + 1]) {
                    sections_value_new++;
                    j++;
                }else {
                    j++;
                    break;
                }
            }
            j = i;
            while (j > 1) {
                if (v[j] >= v[j - 1]) {
                    sections_value_new++;
                    j--;
                }else {
                    j--;
                    break;
                }
            }
            if (sections_value_new >= sections_value_old) {
                sections_value_old = sections_value_new;
            }
            sections_value_new = 0;
        }
        return ++sections_value_old;
    }

    @Override
    public long[] gap(int g, long m, long n) {
        return new long[0];
    }

    @Override
    public int zeros(int n) {
        return n/COUNT_OF_NUMBERS_FOR_ONE_MORE_NULL;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        BigInteger first =BigInteger.valueOf(0);
        BigInteger second = BigInteger.valueOf(1);
        BigInteger sum = BigInteger.valueOf(0);
        BigInteger copy_second = second;
        for (int i=0;i <= n.intValue();i++){
            sum=sum.add(second);
            second=second.add(first);
            first = copy_second;
            copy_second = second;
        }
        return sum.multiply(BigInteger.valueOf(NUMBER_OF_SQUARE_SIDES));
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
