package com.ss.ita.kata.implementation.romankhvalbota;

import com.ss.ita.kata.Five;

import java.math.BigInteger;

public class FiveImpl implements Five {
    @Override
    public int artificialRain(int[] v) {
        int left = 0, area = 0, record = 1;
        for(int i = 1; i < v.length; i++){
            if(v[i] < v[i - 1]) left = i;
            else if(v[i] > v[i-1]){
                area = Math.max(area, record);
                record = i - left;
            }
            record++;
        }
        return Math.max(area, record);
    }

    @Override
    public long[] gap(int g, long m, long n) {
        BigInteger a = new BigInteger("" + m);
        BigInteger b = a.nextProbablePrime();
        if (!a.isProbablePrime(1))
            a = b;
        long i = 0, j = 0;
        while (j <= n) {
            j = b.longValue();
            i = a.longValue();
            if (j - i == g)
                return new long[] {i, j};
            a = b;
            b = a.nextProbablePrime();
        }
        return null;
    }

    @Override
    public int zeros(int n) {
        int count = 0;

        for (int i = 5; n / i >= 1; i *= 5)
            count += n / i;

        return count;
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
        double num =  Math.sqrt(4 * m + 1);
        return (1 - num) / (2 * m) + 1;
    }

    @Override
    public long[] smallest(long n) {
        return new long[0];
    }
}
