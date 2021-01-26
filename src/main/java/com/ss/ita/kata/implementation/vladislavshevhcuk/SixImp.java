package com.ss.ita.kata.implementation.vladislavshevhcuk;

import com.ss.ita.kata.Six;

public class SixImp implements Six {
    @Override
    public long findNb(long m) {
        long n = 1;
        long answer = 0;
        while (answer < m) {
            answer += n * n * n;
            n++;
        }
        return answer == m ? n - 1 : -1;
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
