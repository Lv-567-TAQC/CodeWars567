package com.ss.ita.implementation_andriikapustiak;

public class FindNumbers {
    public static void main(String[] args) {

    }
    private static int[] divisibleBy(int[] numbers, int divider) {
        int counter = 0;
        for(int i : numbers){
            if( i % divider == 0){
                counter++;
            }
        }

        int[] arr = new int[counter];
        int j = 0;
        for(int i : numbers){
            if(i % divider == 0){
                arr[j] = i;
                j++;
            }
        }
        return arr;

    }
}
