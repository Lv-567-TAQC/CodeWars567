package com.ss.ita.kata.implementation.vladislavshevhcuk;

import com.ss.ita.kata.Eight;

public class EightImp implements Eight {

    @Override
    public int liters(double time) {
        return 0;
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        if (length > 0 && width > 0 && height > 0)
            return length * width * height;
        return -1;
    }

    @Override
    public float mpgToKPM(float mpg) {
        if (mpg > 0) {
            final double IMPERIAL_GALLON = 4.54609188;
            final double MILE = 1.609344;
            return (float) (Math.round(mpg * MILE / IMPERIAL_GALLON * 100) / 100.00);
        }
        return -1;
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.sqrt(array[i]) % 1 == 0 ? (int) Math.sqrt(array[i]) : (int) Math.pow(array[i], 2);
        }
        return array;
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
