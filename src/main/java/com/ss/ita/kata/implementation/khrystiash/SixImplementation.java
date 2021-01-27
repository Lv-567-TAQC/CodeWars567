package com.ss.ita.kata.implementation.khrystiash;

import com.ss.ita.kata.Six;

public class SixImplementation implements Six {
    @Override
    public long findNb(long m) {
        long n = 0;
        for (int i = 1; m >= 0;i++){
            m=m-(long) Math.pow(i,3);
            n=i;
        }
        return n-1;
    }

    @Override
    public String balance(String book) {
        return null;
    }

    @Override
    public double f(double x) {
        return 0;
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
