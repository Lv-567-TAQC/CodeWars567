package com.ss.ita.implementation_andriikapustiak;

public class CountNumbers {
//    public static void main(String[] args) {
//        countPositivesSumNegatives()
//    }
    public static int[] countPositivesSumNegatives(int[] input)
    {
        int[] arr = new int[2];
        if( input.length == 0 || input == null){
            int emptyArr[] = {};
            return emptyArr;
        }
        for(int i = 0; i < input.length; i++){
            if(input[i] > 0){
                arr[0]++;
            }
            else if(input[i] < 0){
                arr[1] += input[i];
            }
        }
        return arr; //return an array with count of positives and sum of negatives
    }
}
