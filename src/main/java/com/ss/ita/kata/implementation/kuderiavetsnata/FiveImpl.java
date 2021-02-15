package com.ss.ita.kata.implementation.kuderiavetsnata;

import com.ss.ita.kata.Five;

import java.math.BigInteger;

public class FiveImpl  implements Five {
    @Override
    public int artificialRain(int[] v) {
        int rain = 0;
        int high = 0;
        int smalest = 0;
        int size = 1;
        for (int i = 1; i < v.length; i++) {
            int x = v[i];
            if (x < v[i-1]) {
                smalest = i;
            }else if (x > v[i-1]) {
                rain = Math.max(rain, size);
                size = i - smalest;
                high = i;
            }
            size++;
        }
        return Math.max(rain,size);
    }

    @Override
    public long[] gap(int g, long m, long n) {
            for (long i = isPrime(m) ? m : nextPrime(m); i <= n;) {
                long nextPrime = nextPrime(i);
                if (nextPrime > n)
                    break;
                if (nextPrime - i == g)
                    return new long[]{i,nextPrime};
                i = nextPrime;
            }
            return null;
        }

        public static long nextPrime(long n) {

            while (!isPrime(++n));
            return n;
        }

        public static boolean isPrime(long n){
            if (n == 2 || n == 3)
                return true;
            if (n % 2 == 0 || n % 3 == 0)
                return false;

            int i = 5;
            int w = 2;
            while (i * i <= n) {
                if (n % i == 0)
                    return false;
                i += w;
                w = 6 - w;
            }
            return true;
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
        return (1-Math.sqrt((4*m)+1))/(2*m)+1;
    }

    @Override
    public long[] smallest(long n) {
        long min = n;
        int index1 = 0;
        int index2 = 0;
        String number = String.valueOf(n);

        if (n < 0) {
            long[] arr1 = {-1, -1, -1};
            return arr1;
        }

        for (int i=0; i<number.length(); i++) {
            for (int j=0; j<number.length(); j++) {
                if (i!=j && making(number, i, j) < min) {
                    min = making(number, i, j);
                    index1 = i;
                    index2 = j;
                }
            }
        }
        return new long[]{min, index1, index2};
    }

    public static long making(String s, int i, int j) {
        StringBuilder sb = new StringBuilder(s);
        char c = sb.charAt(i);
        sb.deleteCharAt(i);
        sb.insert(j, c);

        return Long.valueOf(sb.toString());
    }
}
