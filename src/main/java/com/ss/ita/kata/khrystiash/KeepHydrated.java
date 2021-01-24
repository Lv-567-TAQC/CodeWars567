package com.ss.ita.kata.khrystiash;

import com.ss.ita.kata.eight;

public class KeepHydrated implements eight {
    public static final int NULL_LITERS=0;
    public static final double LITERS_PER_HOUR=0.5;

    @Override
    public int liters(double time) {
        int drankLiters;
        if (time > NULL_LITERS){
            drankLiters = (int)(LITERS_PER_HOUR * time);
        }else{
            drankLiters = NULL_LITERS;
        }
        return drankLiters;
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return 0;
    }

    @Override
    public float mpgToKPM(float mpg) {
        return 0;
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        return new int[0];
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        return new int[0];
    }

    @Override
    public int stringToNumber(String str) {
        return 0;
    }

    @Override
    public boolean amIWilson(double n) {
        return false;
    }

    @Override
    public double twoDecimalPlaces(double number) {
        return 0;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        return new int[0];
    }
}