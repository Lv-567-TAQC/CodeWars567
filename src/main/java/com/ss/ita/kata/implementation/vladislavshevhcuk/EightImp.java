package com.ss.ita.kata.implementation.vladislavshevhcuk;

import com.ss.ita.kata.Eight;
import java.util.ArrayList;

public class EightImp implements Eight {

    @Override
    public int liters(double time) {
        return (int)time/2;
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        if (length > 0 && width > 0 && height > 0)
            return length * width * height;
        return -1;
    }

    @Override
    public float mpgToKPM(float mpg) {
        if (mpg >= 0) {
            final double IMPERIAL_GALLON = 4.54609188;
            final double MILE = 1.609344;
            return (float) (Math.round(mpg * MILE / IMPERIAL_GALLON * 100) / 100.00);
        }
        return -1;
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.sqrt(array[i]) % 1 == 0 ? (int) Math.sqrt(array[i]) : (int) Math.pow(array[i], 2);
        }
        return array;
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {

        if(input == null || input.length==0){
            int[] emptyArray = {};
            return emptyArray;
        }
        int[] result = new int[2];
        int countOfPositiveNumbers =0;
        int sumOfNegativeNumbers = 0;
        for(int element : input){
            if(element>0)
                countOfPositiveNumbers++;
            else sumOfNegativeNumbers+=element;
        }
        result[0]=countOfPositiveNumbers;
        result[1]=sumOfNegativeNumbers;
        return result; //return an array with count of positives and sum of negatives
    }

    @Override
    public int stringToNumber(String str) {
        return Integer.parseInt(str);
    }

    @Override
    public boolean amIWilson(double n) {
        double mod = n*n;
        double fact = 1;
        for(int i=2;i<n;i++){
            fact = (fact*i)%mod;
        }
        return fact+1 == mod;
    }

    @Override
    public double twoDecimalPlaces(double number) {
        //number = Math.round(number*100)/100.00;
        number = Double.parseDouble(String.format("%.2f", number));
        return number;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int number : numbers){
            if(number%divider == 0){ list.add(number);}
        }

        int[] result = new int[list.size()];
        for(int i=0;i<result.length;i++){
            result[i] = list.get(i);
        }
        return result;
    }
}
