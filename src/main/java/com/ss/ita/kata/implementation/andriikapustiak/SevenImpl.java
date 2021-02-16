package com.ss.ita.kata.implementation.andriikapustiak;

import com.ss.ita.kata.Seven;

import java.util.Arrays;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {

            if(navg < 0) {
                throw new IllegalArgumentException("Must be a positive number");
            }
            double count = 0;

            for(double el : arr){
                if(el < 0){
                    throw new IllegalArgumentException("Must be a positive number");
                }
                count += el;
            }

            long answer = (long)Math.ceil(navg * (arr.length + 1) - count);
            if(answer <= 0) {
                throw new IllegalArgumentException("Must be a positive number");
            }
            return answer;
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
        if(p > 0 && bef > 0 && aft > 0){
            return Math.min(p - bef, aft + 1); }
        return -1;
    }
}
