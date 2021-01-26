package com.ss.ita.kata.implementation.khrystiash;

import com.ss.ita.kata.Eight;

public class EightImplementation implements Eight {
    public static final double LITERS_PER_HOUR=0.5;
    public static final int ASCII_NUMBER_NULL =48;
    public static final int NUMBER_POSITION_INCREASER = 10;

    @Override
    public int liters(double time) {
        int drankLiters;
        drankLiters = (int)(LITERS_PER_HOUR * time);
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
        int number = 0;
        for (int i = 0,j = str.length() - 1;i < str.length();i++,j--){
            number += ((str.charAt(i) - ASCII_NUMBER_NULL) * Math.pow(NUMBER_POSITION_INCREASER,j));
        }
        return number;
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
