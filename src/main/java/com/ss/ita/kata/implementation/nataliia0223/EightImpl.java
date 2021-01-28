package com.ss.ita.kata.implementation.nataliia0223;

import com.ss.ita.kata.Eight;

public class EightImpl implements Eight {

    @Override
    public int liters(double time) {
        int liters = (int) time / 2;
        return liters;
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return length * width * height;
    }

    @Override
    public float mpgToKPM(float mpg) {
        float kpl = (float)1.609344 / (float)4.54609188 * mpg;
        return kpl;
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        for(int i = 0; i <= array.length - 1; i++) {
            if (array[i] > 0) {
                if (Math.sqrt(array[i]) == (int) Math.sqrt(array[i])) {
                    array[i] = (int) Math.sqrt(array[i]);
                } else {
                    array[i] *= array[i];
                }
            }
        }
        return array;
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        int [] array = new int [2];
        if(input.length != 0 || input != null){
            for(int i = 0; i <= input.length - 1 ; i++){
                if(input[i] > 0){
                    array[0]++;
                }else{
                    array[1] += input[i];
                }
            }
            return array;
        }else{
            return input;
        }
    }

    @Override
    public int stringToNumber(String str) {
        return Integer.parseInt(str);
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
