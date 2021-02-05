package com.ss.ita.kata.implementation.romankhvalbota;

import com.ss.ita.kata.Six;

public class SixImpl implements Six {
    @Override
    public long findNb(long m) {
        long num = 0;
        long sum = 0;
        while(num < m){
            sum = sum + 1;
            num += sum * sum * sum;
        }
        if(num == m){
            return sum;
        }
        return -1;
    }

    @Override
    public String balance(String book) {
        return null;
    }

    @Override
    public double f(double x) {
        return x / (Math.sqrt(1 + x) + 1);

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
        if (lstOfArt.length == 0 || lstOf1stLetter.length == 0){
            return "";
        }

        int sum;
        String result = "";

        for (String i : lstOf1stLetter) {
            sum = 0;
            for (String j : lstOfArt) {
                sum += j.substring(0,1).equals(i) ? Integer.parseInt(j.replaceAll("[^0-9]","")) : 0;
            }
            result += " - (" + i + " : " + sum + ")";
        }

        return result.substring(3);
    }
}
