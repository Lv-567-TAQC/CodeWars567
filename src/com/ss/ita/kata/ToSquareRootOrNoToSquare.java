package com.ss.ita.kata;

public class ToSquareRootOrNoToSquare implements Eight{
    public static int[] squareOrSquareRoot(int[] array)
    {
        for(int i = 0; i <= array.length - 1; i++) {
            if (array[i] > 0) {
                if (Math.sqrt(array[i]) == (int) Math.sqrt(array[i])) {
                    array[i] = (int) Math.sqrt(array[i]);
                } else {
                    array[i] *= array[i];
                }
            }
        }
        return array;
    }
}
