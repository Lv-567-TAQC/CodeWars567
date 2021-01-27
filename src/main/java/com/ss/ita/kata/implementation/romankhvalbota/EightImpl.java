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
        double volume = length * width * height;
        return volume;
    }

    @Override
    public float mpgToKPM(float mpg) {
        float kpl = (float) (mpg* (1.609344 / 4.54609188));
        kpl = (float) (Math.round(kpl * 100.0) / 100.0);
        return kpl;
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        int[] changed = new int[array.length];
        int i = 0;
        int isSquare;

        for (int num : array) {
            isSquare = (int) Math.sqrt(num);

            if (isSquare * isSquare == num){
                changed[i++] = isSquare;
            }
            else{
                changed[i++] = num * num;
            }
        }
        return changed;
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
        return Integer.parseInt(str);
    }

    @Override
    public boolean amIWilson(double n) {
        return false;
    }

    @Override
    public double twoDecimalPlaces(double number) {
        double result;
        result = Math.round(number * 100.0) / 100.0;
        return result;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        return new int[0];
    }
}
