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
        if (length <= 0 || width <= 0 || height <= 0) {
            return -1;
        }

        double volume = length * width * height;
        return volume;
    }

    @Override
    public float mpgToKPM(float mpg) {
        if(mpg >= 0){
            float kpl = (float) (mpg* (1.609344 / 4.54609188));
            kpl = (float) (Math.round(kpl * 100.0) / 100.0);
            return kpl;
        }
        return -1;
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

        if(n == 5.0 || n == 13.0 || n == 563.0)
            return true;
        else
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
        int i = 0;

        for (int num: numbers){
            if (num %  divider == 0){
                i++;
            }
        }

        int[] divisibleNumbers = new int[i];
        i = 0;

        for (int num: numbers){
            if (num %  divider == 0){
                divisibleNumbers[i++] = num;
            }
        }
        return divisibleNumbers;
    }
}
