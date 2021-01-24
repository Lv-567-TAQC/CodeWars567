package com.ss.ita.kata.khrystiash;

import com.ss.ita.kata.eight;

public class FormattingDecimalPlaces implements eight {
    public static final int THREE_NUMBERS_AFTER_COMMA = 1000;
    public static final int TWO_NUMBERS_AFTER_COMMA = 100;
    public static final double ROUNDING_UP = 0.1;
    public static final double CONDITION_ROUNDING_UP = 0.5;

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
        double result;
        result = (double) Math.round(number * THREE_NUMBERS_AFTER_COMMA)/THREE_NUMBERS_AFTER_COMMA;
        if (!(((result * TWO_NUMBERS_AFTER_COMMA) - ((int)result * TWO_NUMBERS_AFTER_COMMA))
                >= CONDITION_ROUNDING_UP)) {
            result = ((double) Math.round(number * TWO_NUMBERS_AFTER_COMMA)/ TWO_NUMBERS_AFTER_COMMA) + ROUNDING_UP;
        }else{
            result = ((double) Math.round(number * TWO_NUMBERS_AFTER_COMMA)/ TWO_NUMBERS_AFTER_COMMA);
        }
        return result;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        return new int[0];
    }
}