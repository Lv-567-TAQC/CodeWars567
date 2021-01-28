package com.ss.ita.kata.implementation.andriikapustiak;

import com.ss.ita.kata.Seven;

import java.util.Arrays;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        double sum = Arrays.stream(arr).sum();
        int result = (int) Math.ceil(navg * (arr.length + 1) - sum);
        if (result <= 0)
            throw new IllegalArgumentException();
        return result;
    }

    @Override
    public String seriesSum(int n) {
        double sum = 0;
        for (int i = 1; i < n * 3; i += 3) {
            sum += 1.0 / i;
        }
        return String.format("%.2f", sum);
    }


    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return Math.min(p - bef, aft + 1);
    }
}
