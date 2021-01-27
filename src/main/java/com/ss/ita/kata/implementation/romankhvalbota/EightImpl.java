package com.ss.ita.kata.implementation.romankhvalbota;

import com.ss.ita.kata.Eight;

public class EightImpl implements Eight {
    @Override
    public int liters(double time) {
        int liters = (int) time / 2;
        return liters;
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
        int positiveCount = 0;
        int negativeSum = 0;

        if (input == null || input.length == 0){
            int[] arr = {};
            return arr;
        }
        for(int num : input){
            if(num > 0){
                positiveCount++;
            }
            else {
                negativeSum += num;
            }
        }
        return new int[]{positiveCount, negativeSum};
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
