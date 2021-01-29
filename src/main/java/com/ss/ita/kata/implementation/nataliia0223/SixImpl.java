package com.ss.ita.kata.implementation.nataliia0223;

import com.ss.ita.kata.Six;

public class SixImpl implements Six {

    @Override
    public long findNb(long m) {
        long n = 1;
        long volume = 0;
        while (volume < m) {
            volume += n * n * n;
            n++;
        }
        if(volume == m){
            return n - 1;
        }else{
            return -1;
        }
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
        String letter = "";
        for (int i = 0; i < lstOf1stLetter.length; i++) {
            int sum = 0;
            for (int j = 0; j < lstOfArt.length; j++) {
                if (lstOfArt[j].charAt(0) == lstOf1stLetter[i].charAt(0)) {
                    sum += Integer.valueOf(lstOfArt[j].substring(5));
                    letter = lstOf1stLetter[i];
                }
            }
            result += "(" + letter + " : " + sum + ")";
        }
        return result;
    }

}
