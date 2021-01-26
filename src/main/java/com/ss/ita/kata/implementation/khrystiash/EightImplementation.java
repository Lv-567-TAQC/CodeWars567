package com.ss.ita.kata.implementation.khrystiash;

import com.ss.ita.kata.Eight;

public class EightImplementation implements Eight {
    public static final double LITERS_PER_HOUR=0.5;
    public static final int ASCII_NUMBER_NULL =48;
    public static final int NUMBER_POSITION_INCREASER = 10;
    public static final int INDEX_OF_COUNT_POSITIVES = 0;
    public static final int INDEX_OF_SUM_NEGATIVES = 1;
    public static final int SIZE_OUTPUT_ARRAY = 2;
    public static final int THREE_NUMBERS_AFTER_COMMA = 1000;
    public static final int TWO_NUMBERS_AFTER_COMMA = 100;
    public static final int ONE_NUMBER_AFTER_COMMA = 10;
    public static final double ROUNDING_UP = 0.1;
    public static final double CONDITION_ROUNDING_UP = 0.5;
    public static final float ONE_IMPERIAL_GALLON_IN_LITERS = 4.54609188F;
    public static final float ONE_MILE_IN_KILOMETERS = 1.609344F;

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
        int[] outputArray = {};
        if(input==null || input.length == 0){
            return outputArray;
        }
        outputArray = new int[SIZE_OUTPUT_ARRAY];
        for(int i=0; i < input.length; i++){
            if(input[i] > 0){
                outputArray[INDEX_OF_COUNT_POSITIVES]++;
            }else{
                outputArray[INDEX_OF_SUM_NEGATIVES] +=input[i];
            }
        }
        return outputArray;
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
        double result;
        result = (double) Math.round(number * THREE_NUMBERS_AFTER_COMMA)/THREE_NUMBERS_AFTER_COMMA;
        if (!(((result * TWO_NUMBERS_AFTER_COMMA) - ((int)result * TWO_NUMBERS_AFTER_COMMA))
                >= CONDITION_ROUNDING_UP)) {
            result = ((double) Math.round(number * TWO_NUMBERS_AFTER_COMMA)/ TWO_NUMBERS_AFTER_COMMA)
                    + ROUNDING_UP;
        }else{
            result = ((double) Math.round(number * TWO_NUMBERS_AFTER_COMMA)/ TWO_NUMBERS_AFTER_COMMA);
        }
        return result;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        int[] divisibleNumbers = new int [countOfDivisible(numbers,divider)];
        for (int i = 0,j = 0;i < numbers.length; i++, j++){
            if(numbers[i] % divider == 0) {
                divisibleNumbers[j] = numbers[i];
            }else{
                j--;
            }
        }
        return divisibleNumbers;
    }

    int countOfDivisible(int[] numbers, int divider) {
        int numberCount = 0;
        for (int i = 0, j = 0; i < numbers.length; i++, j++) {
            if (numbers[i] % divider == 0) {
                numberCount++;
            }
        }
        return numberCount;
    }
}
