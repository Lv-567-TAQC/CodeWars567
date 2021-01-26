package com.ss.ita.kata.implementation.nataliia0223;

import com.ss.ita.kata.Eight;

public class EightImpl implements Eight {

    @Override
    public  int liters(double time){ return 0; }

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

        int result = 1;
        for (int i = 1; i <= (n-1); i++) {
            result = result * i;
        }

        double numb = (result + 1) / (n * n);

        if(numb == (int)numb && (n > 1)){
            return true;
        }else{
            return false;
        }
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
