package com.ss.ita.kata.implementation.nataliia0223;

import com.ss.ita.kata.Five;

import java.math.BigInteger;

public class FiveImpl implements Five {

    @Override
    public int artificialRain(int[] v) {
        int height = 0;
        int size = 1;
        int low = 0;
        for (int i = 1; i < v.length; i++) {
            int k = v[i];
            if (k > v[i - 1]) {
                height = Math.max(height, size);
                size = i - low;
            }
            if (k < v[i - 1]) {
                low = i;
            }
            size++;
        }
        return Math.max(height, size);
    }

    @Override
    public long[] gap(int g, long m, long n) {
        return new long[0];
    }

    @Override
    public int zeros(int n) {
        return n / 5;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        int n0 = 0;
        int n1 = 1;
        int n2 = n0 + n1;
        int sum = 0;
        for (int i = 0; i <= n.intValue(); i++) {
            sum += n2;
            n2 += n0;
            n0 = n1;
            n1 = n2;
        }
        return BigInteger.valueOf(sum * 4);
    }

    @Override
    public double solveSum(double m) {
        return 1 + (1 - Math.sqrt(1 + 4 * m)) / (2 * m);
    }

    @Override
    public long[] smallest(long n) {
        long[] arr = new long[3];
        boolean check = false;
        if(n < 0){
            long[] arr1 = {-1, -1, -1};
            return arr1;
        }
        String str = n + "";
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(0) == str.charAt(i)){
                check = true;
            }else{
                check = false;
            }
        }
        if(check == true){
            long[] arr1 = {n, 0, 0};
            return arr1;
        }
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                StringBuffer sb = new StringBuffer(str);
                char ch = sb.charAt(i);
                sb.delete(i, i + 1);
                sb.insert(j, ch);
                long number = Long.valueOf(sb.toString());

                if (number < n) {
                    n = number;
                    arr[0] = n;
                    arr[1] = i;
                    arr[2] = j;
                }
            }
        }
        return arr;
    }
}
