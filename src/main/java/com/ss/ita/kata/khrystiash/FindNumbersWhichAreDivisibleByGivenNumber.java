package com.ss.ita.kata.khrystiash;

import com.ss.ita.kata.eight;

public class FindNumbersWhichAreDivisibleByGivenNumber implements eight {
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
        return 0;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        int[] divisibleNumbers = new int [coutnOfDivisible(numbers,divider)];
        for (int i = 0,j = 0;i < numbers.length; i++, j++){
            if(numbers[i] % divider == 0) {
                divisibleNumbers[j] = numbers[i];
            }else{
                j--;
            }
        }
        return divisibleNumbers;
    }

    int coutnOfDivisible(int[] numbers, int divider) {
        int numberCount = 0;
        for (int i = 0,j = 0;i < numbers.length; i++, j++){
            if(numbers[i] % divider == 0){
                numberCount++;
            }
        }
        return numberCount;
    }
}