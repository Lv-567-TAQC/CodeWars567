package com.ss.ita.kata.implementation.khrystiash;

import com.ss.ita.kata.Eight;

public class EightImplementation implements Eight {

    public static final double LITERS_PER_HOUR = 0.5;
    public static final int ASCII_NUMBER_NULL = 48;
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
        drankLiters = (int) (LITERS_PER_HOUR * time);
        return drankLiters;
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        if (length <= 0 || width <= 0 || height <= 0) {
            return -1;
        }
        double volumeOfCuboid;
        volumeOfCuboid = length * width * height;
        return volumeOfCuboid;
    }

    @Override
    public float mpgToKPM(float mpg) {
        if (mpg < 0) {
            return -1;
        }
        float kilometersPerLiters;
        kilometersPerLiters = mpg * (ONE_MILE_IN_KILOMETERS / ONE_IMPERIAL_GALLON_IN_LITERS);
        kilometersPerLiters = (float) Math.round(kilometersPerLiters * TWO_NUMBERS_AFTER_COMMA)
                / TWO_NUMBERS_AFTER_COMMA;
        if ((kilometersPerLiters * TWO_NUMBERS_AFTER_COMMA) % 10 == 0) {
            kilometersPerLiters = (float) Math.round(kilometersPerLiters * ONE_NUMBER_AFTER_COMMA) /
                    ONE_NUMBER_AFTER_COMMA;
        }
        return kilometersPerLiters;
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        int[] outputArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (Math.sqrt(array[i]) - (int) Math.sqrt(array[i]) == 0.0) {
                outputArray[i] = (int) Math.sqrt(array[i]);
            } else {
                outputArray[i] = array[i] * array[i];
            }
        }
        return outputArray;
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        int[] outputArray = {};
        if (input == null || input.length == 0) {
            return outputArray;
        }
        outputArray = new int[SIZE_OUTPUT_ARRAY];
        for (int i = 0; i < input.length; i++) {
            if (input[i] > 0) {
                outputArray[INDEX_OF_COUNT_POSITIVES]++;
            } else {
                outputArray[INDEX_OF_SUM_NEGATIVES] += input[i];
            }
        }
        return outputArray;
    }

    @Override
    public int stringToNumber(String str) {
        int number = 0;
        if (str.charAt(0) == '-') {
            for (int i = 1, j = str.length() - 2; i < str.length(); i++, j--) {
                number -= ((str.charAt(i) - ASCII_NUMBER_NULL) * Math.pow(NUMBER_POSITION_INCREASER, j));
            }
        } else {
            for (int i = 0, j = str.length() - 1; i < str.length(); i++, j--) {
                number += ((str.charAt(i) - ASCII_NUMBER_NULL) * Math.pow(NUMBER_POSITION_INCREASER, j));
            }
        }
        return number;
    }

    @Override
    public boolean amIWilson(double n) {
        boolean isWilsonNumber = isNumberPrime(n);
        if (isWilsonNumber) {
            isWilsonNumber = (wilsonNumberCalculation(n))
                    - (int) wilsonNumberCalculation(n) == 0;
        }
        return isWilsonNumber;
    }

    boolean isNumberPrime(double n) {
        boolean isPrime = false;
        for (int i = 2; i < n; i++) {
            if ((n / i) - (int) (n / i) == 0) {
                isPrime = false;
                break;
            } else {
                isPrime = true;
            }
        }
        return isPrime;
    }

    double factorial(double number) {
        double numberFactorial = 1;
        for (int i = 0; i < number; i++) {
            numberFactorial *= number - i;
        }
        return numberFactorial;
    }

    double wilsonNumberCalculation(double number) {
        double wilsonNumber;
        wilsonNumber = (factorial(number - 1) + 1) / (number * number);
        return wilsonNumber;
    }

    @Override
    public double twoDecimalPlaces(double number) {
        double result;
        result = (double) Math.round(number * THREE_NUMBERS_AFTER_COMMA) / THREE_NUMBERS_AFTER_COMMA;
        if (!(((result * TWO_NUMBERS_AFTER_COMMA) - ((int) result * TWO_NUMBERS_AFTER_COMMA))
                >= CONDITION_ROUNDING_UP)) {
            result = ((double) Math.round(number * TWO_NUMBERS_AFTER_COMMA) / TWO_NUMBERS_AFTER_COMMA)
                    + ROUNDING_UP;
        } else {
            result = ((double) Math.round(number * TWO_NUMBERS_AFTER_COMMA) / TWO_NUMBERS_AFTER_COMMA);
        }
        return result;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        int[] divisibleNumbers = new int[countOfDivisible(numbers, divider)];
        for (int i = 0, j = 0; i < numbers.length; i++, j++) {
            if (numbers[i] % divider == 0) {
                divisibleNumbers[j] = numbers[i];
            } else {
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
