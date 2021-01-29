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
        String result = "";
        Integer sum = 0;
        String bukva = "";
        for (int j = 0; j < lstOf1stLetter.length; j++){
            for (int i = 0; i < lstOfArt.length; i++){
                if(lstOfArt[i].charAt(0) == lstOf1stLetter[j].charAt(0)){
                    sum += Integer.valueOf(lstOfArt[i].substring(6));
                    bukva = lstOf1stLetter[j];
                }
            }
            result += "(" + bukva + " : " + sum + ") ";
            sum = 0;
        }
        return result;
    }
}
