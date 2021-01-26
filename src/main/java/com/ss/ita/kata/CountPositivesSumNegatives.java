package com.ss.ita.kata;

public class CountPositivesSumNegatives implements Eight{
    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        int positiveCount = 0;
        int negativeSum = 0;

        if (input == null || input.length == 0){
            int[] arr = {};
            return arr;
        }
        for(int num : input){
            if(num > 0){
                positiveCount++;
            }
            else {
                negativeSum += num;
            }
        }
        return new int[]{positiveCount, negativeSum};
    }
}
