package com.ss.ita.kata;

public class SumOfTheFirstNthTermOfSeries implements Seven{
    @Override
    public static String seriesSum(int n) {
        double sum = 0;
        double k = 1.0;
        for(int i = 1; i <= n; i++){
            sum += (1 / k);
            k += 3;
        }
        sum = (double)Math.round(sum * 100) / 100;

        return Double.toString(sum);
    }
}
