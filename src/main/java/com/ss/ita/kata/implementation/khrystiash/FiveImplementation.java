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
            while (j < v.length - 1) {
                if (v[j] >= v[j + 1]) {
                    sections_value_new++;
                    j++;
                } else {
                    j++;
                    break;
                }
            }
            j = i;
            while (j > 1) {
                if (v[j] >= v[j - 1]) {
                    sections_value_new++;
                    j--;
                } else {
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
        long[] result = new long[2];
        boolean isPrime = false;
        long first = 0;
        long second = 0;
        if (n < m) {
            return null;
        }
        if (n > 1100000) {
            return null;
        }
        if (g < 2) {
            return null;
        }
        if (m <= 2 || m == n) {
            return null;
        }

        for (long i = m; i <= n; i = i + 1) {
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = true;
                    break;
                }
            }
            if (!isPrime) {
                if (first == 0) {
                    first = i;
                } else {
                    if (i - first == g) {
                        second = i;
                        break;
                    } else {
                        first = i;
                    }
                }
            }
            isPrime = false;
        }
        if (second - first == g) {
            result[0] = first;
            result[1] = second;
            return result;
        } else {
            return null;
        }
    }

    @Override
    public int zeros(int n) {
        return n / COUNT_OF_NUMBERS_FOR_ONE_MORE_NULL;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        BigInteger first = BigInteger.valueOf(0);
        BigInteger second = BigInteger.valueOf(1);
        BigInteger sum = BigInteger.valueOf(0);
        BigInteger copy_second = second;
        for (int i = 0; i <= n.intValue(); i++) {
            sum = sum.add(second);
            second = second.add(first);
            first = copy_second;
            copy_second = second;
        }
        return sum.multiply(BigInteger.valueOf(NUMBER_OF_SQUARE_SIDES));
    }

    @Override
    public double solveSum(double m) {
        return ((2 * m + 1) - Math.sqrt(((2 * m + 1) * (2 * m + 1)) - (4 * m * m))) / (2 * m);
    }

    @Override
    public long[] smallest(long n) {
        String number = "";
        String[] result = new String[3];
        long[] res = new long[3];
        number += n;
        int count = 0;
        int count1 = 0;
        char smallest = number.charAt(0);
        if (n < 0) {
            res[0] = -1;
            res[1] = -1;
            res[2] = -1;
            return res;
        }
        for (int a = 1, b = 2; a < number.length() && b < number.length(); a++, b++) {
            if (number.charAt(0) == number.charAt(a)) {
                count++;
            }
            if (number.charAt(1) == number.charAt(b) && number.charAt(0) > number.charAt(1)) {
                count1++;
            }
        }
        if (count1 == number.length() - 2) {
            res[0] = Long.parseLong(number.substring(1) + number.substring(0, 1));
            res[1] = 0;
            res[2] = number.length() - 1;
            return res;
        }
        for (int i = 0; i < number.length(); i++) {
            for (int j = 1; j < number.length(); j++) {
                if (smallest > number.charAt(j) || count == number.length() - 1) {
                    smallest = number.charAt(j);
                }
                if (smallest == number.charAt(0) && j != 1 && count != number.length() - 1) {
                    result[0] = String.valueOf(smallest);
                    smallest = number.charAt(j);
                    break;
                }
            }
        }
        if (smallest > number.charAt(0)) {
            result[0] += smallest + number.substring(1, number.indexOf(smallest)) + number.substring(number.indexOf(smallest) + 1);
        } else {
            result[0] = smallest + number.substring(0, number.indexOf(smallest)) + number.substring(number.indexOf(smallest) + 1);
        }
        if (number.indexOf(smallest) == 1) {
            result[1] = String.valueOf(0);
            smallest = number.charAt(0);
        } else {
            result[1] = String.valueOf(number.indexOf(smallest));
        }
        result[2] = String.valueOf(result[0].indexOf(smallest));
        for (int i = 0; i < res.length; i++) {
            res[i] = Long.parseLong(result[i]);
        }
        return res;
    }
}
