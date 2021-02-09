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
        return ((2*m+1)-Math.sqrt(((2*m+1)*(2*m+1))-(4*m*m)))/(2*m);
    }

    @Override
    public long[] smallest(long n) {
        String numb = "";
        String[] result = new String[3];
        long[] res = new long[3];
        numb += n;
        int count = 0;
        int count1 = 0;
        char smallest = numb.charAt(0);
        for (int a = 1, b = 2; a < numb.length() && b < numb.length(); a++, b++) {
            if (numb.charAt(0) == numb.charAt(a)) {
                count++;
            }
            if (numb.charAt(1) == numb.charAt(b) && numb.charAt(0) > numb.charAt(1)) {
                count1++;
            }
        }
        if (count1 == numb.length() - 2) {
            res[0] = Long.parseLong(numb.substring(1)+numb.substring(0,1));
            res[1] = 0;
            res[2] = numb.length()-1;
            return res;
        }
        for (int i = 0; i < numb.length(); i++) {
            for (int j = 1; j < numb.length(); j++) {
                if (smallest > numb.charAt(j) || count == numb.length() - 1) {
                    smallest = numb.charAt(j);
                }
                if (smallest == numb.charAt(0) && j != 1 && count != numb.length() - 1) {
                    result[0] = String.valueOf(smallest);
                    smallest = numb.charAt(j);
                    break;
                }
            }
        }
        if (smallest > numb.charAt(0)) {
            result[0] += smallest + numb.substring(1, numb.indexOf(smallest)) + numb.substring(numb.indexOf(smallest) + 1);
        } else {
            result[0] = smallest + numb.substring(0, numb.indexOf(smallest)) + numb.substring(numb.indexOf(smallest) + 1);
        }
        if (numb.indexOf(smallest) == 1) {
            result[1] = String.valueOf(0);
            smallest = numb.charAt(0);
        } else {
            result[1] = String.valueOf(numb.indexOf(smallest));
        }
        result[2] = String.valueOf(result[0].indexOf(smallest));
        for (int i = 0; i < res.length; i++) {
            res[i] = Long.parseLong(result[i]);
        }
        return res;
    }
}
