package com.ss.ita.kata;

public class WillsonPrimes {
    public static boolean am_i_wilson(double n) {
        int result = 1;
        for (int i = 1; i <= (n-1); i++) {
            result = result * i;
        }

        double numb = (result + 1) / (n * n);

        if(numb == (int)numb && (n > 1)){
            return true;
        }else{
            return false;
        }
    }
}
