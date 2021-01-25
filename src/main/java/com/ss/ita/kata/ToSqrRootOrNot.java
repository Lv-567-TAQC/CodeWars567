package com.ss.ita.kata;

public class ToSqrRootOrNot implements Eight{
    @Override
    public int[] squareOrSquareRoot(int[] array) {
        int[] changed = new int[array.length];
        int i = 0;
        int isSquare;

        for (int num : array) {
            isSquare = (int) Math.sqrt(num);

            if (isSquare * isSquare == num){
                changed[i++] = isSquare;
            }
            else{
                changed[i++] = num * num;
            }
        }
        return changed;
    }
}
