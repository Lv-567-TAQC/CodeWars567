package com.ss.ita.kata.khrystiash;

import com.ss.ita.kata.seven;

public class SumOfTheFirstNthTermOfSeries implements seven {

    @Override
    public long newAvg(double[] arr, double navg) {
        return 0;
    }
    public static final int TWO_NUMBERS_AFTER_COMMA = 100;
//    private String result;
//    private double seriesResult = -1;
//    private double denominator = 1;
//    private double denominatorStep = 3;
//    private double numerator = 1;

    @Override
    public String seriesSum(int n) {
        String result = "";
        double seriesResult = 0;
        double numerator = 1;
        double denominator = 1;
        double denominatorStep = 3;
        for (int i = 0; i < n; i++){
            seriesResult += numerator/denominator;
            denominator += denominatorStep;
        }
        seriesResult = (double)Math.round(seriesResult * TWO_NUMBERS_AFTER_COMMA)
                / TWO_NUMBERS_AFTER_COMMA;
        result += seriesResult;
        return result;
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return 0;
    }
}
