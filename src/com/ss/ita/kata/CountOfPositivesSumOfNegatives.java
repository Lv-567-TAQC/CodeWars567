package com.ss.ita.kata;

public class CountOfPositivesSumOfNegatives implements Eight {
    @Override
    public static int[] countPositivesSumNegatives(int[] input)
    {
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
}
