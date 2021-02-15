package com.ss.ita.kata.implementation.kuderiavetsnata;

import com.ss.ita.kata.Seven;

public class SevenImpl implements Seven {

    @Override
    public long newAvg(double[] arr, double navg) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) sum += arr[i];
        long ans = (long) Math.ceil((arr.length + 1) * navg - sum);
        if (ans < 0) throw new IllegalArgumentException();
        return ans;
    }

    @Override
    public String seriesSum(int n) {
        double sum = 0.0;
        for (int i = 0; i < n; i++)
            sum += 1.0 / (1 + 3 * i);


        return String.format("%.2f", sum);
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        if(p > 0 && bef > 0 && aft > 0){
        return Math.min(p - bef, aft + 1);
    }
        return -1;
    }
}
