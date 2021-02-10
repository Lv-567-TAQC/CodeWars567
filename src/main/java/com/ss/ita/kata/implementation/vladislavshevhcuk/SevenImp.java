package com.ss.ita.kata.implementation.vladislavshevhcuk;

import com.ss.ita.kata.Seven;

public class SevenImp implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        if(navg <0) {throw new IllegalArgumentException("Non positive donation");}
        double sum =0;
        for(double element : arr){
            if(element<0){throw new IllegalArgumentException("Non positive donation");}
            sum+=element;
        }
        long answer = (long)Math.ceil(navg*(arr.length+1)-sum);
        if(answer <=0) {throw new IllegalArgumentException("Non positive donation");}
        return answer;
    }

    @Override
    public String seriesSum(int n) {
        if (n<0) {
            return "";
        }
        if (n==0) return "0.00";
        double answer = 1;
        for(int i=1;i<n;i++){
            answer+=(double)1/(1+i*3);
        }
        return String.format("%.2f",answer);
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return Math.min(p-bef,aft+1);
    }
}
