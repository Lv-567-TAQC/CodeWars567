package com.ss.ita.implementation_andriikapustiak;

public class Square {

        public static int[] squareOrSquareRoot(int[] array)
        {
            for (int i = 0; i<array.length;i++){
                if(Math.sqrt(array[i]) % 1 == 0){
                    array[i] = (int)Math.sqrt(array[i]);
                }
                else{
                    array[i] *= array[i];
                }
            }
            return array;
        }

}
