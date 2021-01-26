package com.ss.ita.kata.implementation.vladislavshevhcuk;

import com.ss.ita.kata.Seven;

public class SevenImp implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        double sum =0;
        for(double element : arr){
            sum+=element;
        }
        long answer = (long)Math.ceil(navg*(arr.length+1)-sum);
        if(answer <=0) {throw new IllegalArgumentException("Non positive donation");}
        return answer;
    }

    @Override
    public String seriesSum(int n) {
        return null;
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return 0;
    }
}
