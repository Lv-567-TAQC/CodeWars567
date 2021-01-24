package com.ss.ita.kata.khrystiash;

import com.ss.ita.kata.eight;

public class MilesPerGallonToKilometerPerLiter implements eight {
    public static final float ONE_IMPERIAL_GALLON_IN_LITERS = 4.54609188F;
    public static final float ONE_MILE_IN_KILOMETERS = 1.609344F;
    public static final int TWO_NUMBERS_AFTER_COMMA = 100;
    public static final int ONE_NUMBER_AFTER_COMMA = 10;

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
        float kilometersPerLiters;
        kilometersPerLiters = mpg * (ONE_MILE_IN_KILOMETERS / ONE_IMPERIAL_GALLON_IN_LITERS);
        kilometersPerLiters = (float) Math.round(kilometersPerLiters * TWO_NUMBERS_AFTER_COMMA)
                / TWO_NUMBERS_AFTER_COMMA;
        if ((kilometersPerLiters * TWO_NUMBERS_AFTER_COMMA) % 10 == 0 ){
            kilometersPerLiters = (float) Math.round(kilometersPerLiters * ONE_NUMBER_AFTER_COMMA) /
                    ONE_NUMBER_AFTER_COMMA;
        }
        return kilometersPerLiters;
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