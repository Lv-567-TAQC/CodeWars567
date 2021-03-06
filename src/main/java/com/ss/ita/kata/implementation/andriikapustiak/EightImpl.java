package com.ss.ita.kata.implementation.andriikapustiak;

import com.ss.ita.kata.Eight;

public class EightImpl implements Eight {
    private static final double WATER_PER_HOUR = 0.5;

    @Override
    public int liters(double time) {
        int water = (int) (time * WATER_PER_HOUR);
        return water;
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        if(length > 0 && width > 0 && height > 0){
            return length * width * height;
        }
        return  -1;
    }

    @Override
    public float mpgToKPM(float mpg) {
        if(mpg >= 0){
        float gallon = 4.54609188f;
        float mile = 1.609344f;
            return (float) Math.round(mpg * mile / gallon * 100) / 100;
        }
        return -1;
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (Math.sqrt(array[i]) % 1 == 0) {
                array[i] = (int) Math.sqrt(array[i]);
            } else {
                array[i] *= array[i];
            }
        }
        return array;
    }


    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        int[] arr = new int[2];
        if (input.length == 0 || input == null) {
            int[] emptyArr = {};
            return emptyArr;
        }
        for (int i = 0; i < input.length; i++) {
            if (input[i] > 0) {
                arr[0]++;
            } else if (input[i] < 0) {
                arr[1] += input[i];
            }
        }
        return arr; //return an array with count of positives and sum of negatives
    }

    @Override
    public int stringToNumber(String str) {
        return Integer.parseInt(str);
    }

    @Override
    public boolean amIWilson(double n) {

        return n == 5.0 || n == 13.0 || n == 563.0;
    }

    @Override
    public double twoDecimalPlaces(double number) {

        return Math.round(number * 100.0) / 100.0;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {

        int counter = 0;
        for (int i : numbers) {
            if (i % divider == 0) {
                counter++;
            }
        }
        int[] arr = new int[counter];
        int j = 0;
        for (int i : numbers) {
            if (i % divider == 0) {
                arr[j] = i;
                j++;
            }
        }
        return arr;
    }
}
