package com.ss.ita.kata;

public class FindNumbersWhichAreDivisibleByGivenNumber implements Eight{
    @Override
    public static int[] divisibleBy(int[] numbers, int divider) {
        int count = 0;
        int j = 0;
        for(int i = 0; i <= numbers.length - 1; i++) {
            if (numbers[i] % divider == 0) {
                count++;
            }
        }
        int [] array = new int [count];
        for(int i = 0; i <= numbers.length - 1; i++) {
            if (numbers[i] % divider == 0) {
                array[j] = numbers[i];
                j++;
            }
        }
        return array;
    }

}
