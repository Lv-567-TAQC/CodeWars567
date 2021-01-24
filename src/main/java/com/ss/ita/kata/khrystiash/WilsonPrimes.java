package com.ss.ita.kata.khrystiash;

import com.ss.ita.kata.eight;

public class WilsonPrimes implements eight {
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
        boolean isWilsonNumber = isNumberPrime(n);
        if(isWilsonNumber){
            isWilsonNumber = (wilsonNumberCalculation(n))
                    - (int)wilsonNumberCalculation(n) == 0;
        }
        return isWilsonNumber;
    }

    boolean isNumberPrime(double n){
        boolean isPrime = false;
        for (int i = 2; i < n; i++){
            if ((n / i) - (int) (n / i) == 0) {
                isPrime = false;
                break;
            }else{
                isPrime = true;
            }
        }
        return isPrime;
    }

    double factorial(double number){
        double numberFactorial=1;
        for (int i = 0;i < number;i++){
            numberFactorial *= number-i;
        }
        return numberFactorial;
    }

    double wilsonNumberCalculation(double number){
        double wilsonNumber;
        wilsonNumber = (factorial(number - 1) + 1) / (number * number);
        return wilsonNumber;
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