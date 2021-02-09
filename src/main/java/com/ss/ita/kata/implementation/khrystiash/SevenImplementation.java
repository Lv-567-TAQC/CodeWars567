package com.ss.ita.kata.implementation.khrystiash;

import com.ss.ita.kata.Seven;

public class SevenImplementation implements Seven {
    public static final int TWO_NUMBERS_AFTER_COMMA = 100;
    public static final int ONE_NUMBER_AFTER_COMMA = 10;
    public static final double CONDITION_ROUNDING_UP = 0.5;

    @Override
    public long newAvg(double[] arr, double navg) {
        double nextDonation = 0;
        for (int i = 0; i < arr.length; i++) {
            nextDonation += arr[i];
        }
        nextDonation = (navg * (arr.length + 1)) - nextDonation;
        if (nextDonation <= 0) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                throw new IllegalArgumentException();
            }
        }
        if ((nextDonation * ONE_NUMBER_AFTER_COMMA) / ONE_NUMBER_AFTER_COMMA
                - ((int) ((nextDonation * ONE_NUMBER_AFTER_COMMA) / ONE_NUMBER_AFTER_COMMA))
                >= CONDITION_ROUNDING_UP) {
            nextDonation++;
        }
        return (long) nextDonation;
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
        int positionsNumber = 0;
        for (int i = 1; i <= p; i++){
            if((i > bef) && (i >= (p - aft))){
                positionsNumber++;
            }
        }
        return positionsNumber;
    }
}