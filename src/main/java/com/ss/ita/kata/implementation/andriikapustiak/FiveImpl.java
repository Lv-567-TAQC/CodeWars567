package com.ss.ita.kata.implementation.andriikapustiak;

import com.ss.ita.kata.Five;

import java.math.BigInteger;

import static com.ss.ita.kata.implementation.khrystiash.FiveImplementation.NUMBER_OF_SQUARE_SIDES;

public class FiveImpl implements Five {
    @Override

        public int artificialRain(int[] v) {
            int sections = 0;

            int numberOfSections = v.length;
            int[] leftSide = new int[numberOfSections];
            int[] rightSide = new int[numberOfSections];

            //left side
            for (int i = 1;i < numberOfSections; i++){
                if(v[i] >= v[i-1]){
                    leftSide[i]=leftSide[i-1]+1;
                }
                else {
                    leftSide[i]=0;
                }
            }

            //right side
            for (int i = v.length-2; i >= 0; i-- ){
                if(v[i] >= v[i+1]){
                    rightSide[i] = rightSide[i+1]+1;
                }
                else {
                    rightSide[i]=0;
                }
            }
            for(int i=0;i<v.length;i++){
                sections = Math.max(sections,leftSide[i]+rightSide[i]);
            }
            return sections+1;
        }


    @Override
    public long[] gap(int g, long m, long n) {
        long[] result = new long[2];
        for(long i = m; i <= n - g; i++){
            boolean flag = true;
            if(isPrime(i)){
                if(isPrime(i + g)){
                    for(long j = i + 1; j < i + g; j++){
                        if(isPrime(j)) {
                            flag = false;
                            break;
                        }
                    }
                    if(flag){
                        result[0] = i;
                        result[1] = i + g;
                        return result;
                    }
                }
            }
        }
        return null;
    }

    private static boolean isPrime(long number){
        if(number == 2 || number ==3){
            return true;
        }
        if(number == 4){
            return false;
        }
        for(long i=2;i<number/2;i++){
            if(number%i == 0){
                return false;
            }
        }
        return true;
    }

    @Override
    public int zeros(int n) {
        int result = 0;
        while (n > 0) {
            n /= 5;
            result += n;
        }
        return result;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        BigInteger f =BigInteger.valueOf(0);
        BigInteger s = BigInteger.valueOf(1);
        BigInteger sum = BigInteger.valueOf(0);
        BigInteger copy_s = s;
        for (int i=0;i <= n.intValue();i++){
            sum=sum.add(s);
            s=s.add(f);
            f = copy_s;
            copy_s = s;
        }
        return sum.multiply(BigInteger.valueOf(NUMBER_OF_SQUARE_SIDES));
    }

    @Override
    public double solveSum(double n) {

        return ((2*n+1)-Math.sqrt(((2*n+1)*(2*n+1))-(4*n*n)))/(2*n);
    }


    @Override
    public long[] smallest(long n) {
        String numb = "";
        String[] result = new String[3];
        long[] res = new long[3];
        numb += n;
        int count = 0;
        int count1 = 0;
        char smallest = numb.charAt(0);
        if (n < 0) {
            res[0] = -1;
            res[1] = -1;
            res[2] = -1;
            return res;
        }
        for (int a = 1, b = 2; a < numb.length() && b < numb.length(); a++, b++) {
            if (numb.charAt(0) == numb.charAt(a)) {
                count++;
            }
            if (numb.charAt(1) == numb.charAt(b) && numb.charAt(0) > numb.charAt(1)) {
                count1++;
            }
        }
        if (count1 == numb.length() - 2) {
            res[0] = Long.parseLong(numb.substring(1) + numb.substring(0, 1));
            res[1] = 0;
            res[2] = numb.length() - 1;
            return res;
        }
        for (int i = 0; i < numb.length(); i++) {
            for (int j = 1; j < numb.length(); j++) {
                if (smallest > numb.charAt(j) || count == numb.length() - 1) {
                    smallest = numb.charAt(j);
                }
                if (smallest == numb.charAt(0) && j != 1 && count != numb.length() - 1) {
                    result[0] = String.valueOf(smallest);
                    smallest = numb.charAt(j);
                    break;
                }
            }
        }
        if (smallest > numb.charAt(0)) {
            result[0] += smallest + numb.substring(1, numb.indexOf(smallest)) + numb.substring(numb.indexOf(smallest) + 1);
        } else {
            result[0] = smallest + numb.substring(0, numb.indexOf(smallest)) + numb.substring(numb.indexOf(smallest) + 1);
        }
        if (numb.indexOf(smallest) == 1) {
            result[1] = String.valueOf(0);
            smallest = numb.charAt(0);
        } else {
            result[1] = String.valueOf(numb.indexOf(smallest));
        }
        result[2] = String.valueOf(result[0].indexOf(smallest));
        for (int i = 0; i < res.length; i++) {
            res[i] = Long.parseLong(result[i]);
        }
        return res;
    }
    }

