package com.ss.ita.kata.khrystiash;

import com.ss.ita.kata.eight;

public class ToSquareOrNotToSquare implements eight {

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
        int [] outputArray = new int[array.length];
        for (int i = 0;i < array.length;i++){
            if(Math.sqrt(array[i]) - (int)Math.sqrt(array[i]) == 0.0) {
                outputArray[i] = (int)Math.sqrt(array[i]);
            }else{
                outputArray[i] = array[i] * array[i];
            }
        }
        return outputArray;
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