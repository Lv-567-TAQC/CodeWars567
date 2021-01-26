package com.ss.ita.kata;

public class DivisibleBy implements Eight{
    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        int i = 0;

        for (int num: numbers){
            if (num %  divider == 0){
                i++;
            }
        }

        int[] divisibleNumbers = new int[i];
        i = 0;

        for (int num: numbers){
            if (num %  divider == 0){
                divisibleNumbers[i++] = num;
            }
        }
        return divisibleNumbers;
    }
}
