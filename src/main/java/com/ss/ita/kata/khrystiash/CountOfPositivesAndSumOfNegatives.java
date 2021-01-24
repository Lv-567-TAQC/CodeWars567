package com.ss.ita.kata.khrystiash;

import com.ss.ita.kata.eight;

public class CountOfPositivesAndSumOfNegatives implements eight {
    public static final int INDEX_OF_COUNT_POSITIVES = 0;
    public static final int INDEX_OF_SUM_NEGATIVES = 1;
    public static final int SIZE_OUTPUT_ARRAY = 2;


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