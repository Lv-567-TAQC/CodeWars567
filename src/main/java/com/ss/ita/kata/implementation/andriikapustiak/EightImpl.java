package com.ss.ita.kata.implementation.andriikapustiak;

import com.ss.ita.kata.Eight;

public class EightImpl implements Eight {
    private static final double WATER_PER_HOUR = 0.5;

    @Override
    public int liters(double time) {
        return 0;
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
        int[] arr = new int[2];
        if( input.length == 0 || input == null){
            int emptyArr[] = {};
            return emptyArr;
        }
        for(int i = 0; i < input.length; i++){
            if(input[i] > 0){
                arr[0]++;
            }
            else if(input[i] < 0){
                arr[1] += input[i];
            }
        }
         return arr; //return an array with count of positives and sum of negatives
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
        return Math.round(number * 100.0) / 100.0;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        return new int[0];
    }
}
