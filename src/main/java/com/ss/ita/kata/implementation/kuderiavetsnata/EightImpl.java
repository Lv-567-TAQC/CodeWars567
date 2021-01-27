package com.ss.ita.kata.implementation.kuderiavetsnata;

import com.ss.ita.kata.Eight;

public class EightImpl implements Eight {

    @Override
    public int liters(double time) {
        return (int) (time * 0.5);
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return length * width * height;
    }

    @Override
    public float mpgToKPM(float mpg) {
        return (float) Math.round(100 * mpg * 1.609344 / 4.54609188) / 100;
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        for (int arr = 0; arr < array.length; arr++) {
            if (Math.sqrt(array[arr]) % 1 == 0) {
                array[arr] = (int) Math.sqrt(array[arr]);
            } else {
                array[arr] = array[arr] * array[arr];
            }
        }


        return array;
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        int[] output = new int[2];
        if (input == null || input.length == 0) {
            int[] empty = {};
            return empty;
        }
        for (int i = 0; i < input.length; i++) {
            if (input[i] > 0) output[0]++;
            else output[1] += input[i];
        }
        return output;

    }

    @Override
    public int stringToNumber(String str) {
        return Integer.valueOf(str);
    }


    @Override
    public boolean amIWilson(double n) {
        return n == 5.0 || n == 13.0 || n == 563.0;
    }

    @Override
    public double twoDecimalPlaces(double number) {
        return (Math.round(number * 100)) / 100.0;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        int count = 0;
        for (int number : numbers) {
            if (number % divider == 0) {
                count++;
            }
        }
        int[] arr = new int[count];
        int i = 0;
        for (int number : numbers) {
            if (number % divider == 0) {
                arr[i] = number;
                i++;
            }
        }
        return arr;

    }
}

