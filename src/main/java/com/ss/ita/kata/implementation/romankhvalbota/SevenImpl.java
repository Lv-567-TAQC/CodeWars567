package com.ss.ita.kata.implementation.romankhvalbota;

import com.ss.ita.kata.Seven;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        double sum = 0;
        long result;
        for (double i : arr){
            sum += i;
        }

        if (navg < sum / arr.length){
            throw new IllegalArgumentException();
        }

        result = (long) Math.ceil(navg * (arr.length + 1) - sum);
        return result;
    }

    @Override
    public String seriesSum(int n) {
        double sum = 0.0;

        for (int i = 0; i < n; i++){
            sum += 1.0 / (1 + 3 * i);
        }
        return String.format("%.2f", sum);
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return Math.min(p - bef, aft + 1);
    }
}
