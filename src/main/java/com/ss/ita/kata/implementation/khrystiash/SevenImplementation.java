package com.ss.ita.kata.implementation.khrystiash;

import com.ss.ita.kata.Seven;

public class SevenImplementation implements Seven {
    public static final int TWO_NUMBERS_AFTER_COMMA = 100;

    @Override
    public long newAvg(double[] arr, double navg) {
        return 0;
    }

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
