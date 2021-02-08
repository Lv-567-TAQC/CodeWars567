package com.ss.ita.kata.implementation.andriikapustiak;

import com.ss.ita.kata.Six;

public class SixImpl implements Six {
    @Override
    public long findNb(long m) {
        long n = 0;
        long ttl = 0;

        while (n < m) {
            ttl = ttl + 1;
            n += ttl * ttl * ttl;
        }
        if (n == m) {
            return ttl;
        }
        return -1;
    }


    @Override
    public String balance(String book) {
        return null;
    }

    @Override
    public double f(double x) {
        return x/(1+Math.sqrt(x+1));
    }

    @Override
    public double mean(String town, String strng) {
        return 0;
    }

    @Override
    public double variance(String town, String strng) {
        return 0;
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        return null;
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        return null;
    }
}
