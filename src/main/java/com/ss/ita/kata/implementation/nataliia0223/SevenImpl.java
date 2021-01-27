package com.ss.ita.kata.implementation.nataliia0223;

import com.ss.ita.kata.Seven;

public class SevenImpl implements Seven {

    @Override
    public long newAvg(double[] arr, double navg) {
        double sum =0;
        for(int i = 0; i <= arr.length - 1; i++){
            sum+=arr[i];
        }
        long result = (long)Math.ceil(navg * (arr.length + 1) - sum);
        if(result <= 0){
            throw new IllegalArgumentException("Non positive");
        }
        return result;
    }

    @Override
    public String seriesSum(int n) {
        double sum = 0;
        double k = 1.0;
        for(int i = 1; i <= n; i++){
            sum += (1 / k);
            k += 3;
        }
        sum = (double)Math.round(sum * 100) / 100;

        return Double.toString(sum);
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {

        return Math.min(p-bef,aft+1);
    }
}
