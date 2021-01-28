package com.ss.ita.kata.implementation.vladislavshevhcuk;

import com.ss.ita.kata.Five;

import java.math.BigInteger;

public class FiveImp implements Five {
    @Override
    public int artificialRain(int[] v) {
        int maxWateredSections =0;

        int numberOfSections = v.length;
        int[] leftPartOfWateredSection = new int[numberOfSections];
        int[] rightPartOfWateredSection = new int[numberOfSections];

        //check Left
        for (int i=1;i<numberOfSections;i++){
            if(v[i]>=v[i-1]){ //поточне більше за попереднє(лівіше)
                leftPartOfWateredSection[i]=leftPartOfWateredSection[i-1]+1;
            }
            else {
                leftPartOfWateredSection[i]=0;
            }
        }

        //check Right
        for (int i=v.length-2;i>=0;i--){
            if(v[i]>=v[i+1]){ //поточне більше за попереднє(правіше)
                rightPartOfWateredSection[i]=rightPartOfWateredSection[i+1]+1;
            }
            else {
                rightPartOfWateredSection[i]=0;
            }
        }

        for(int i=0;i<v.length;i++){
            maxWateredSections = Math.max(maxWateredSections,leftPartOfWateredSection[i]+rightPartOfWateredSection[i]);
        }
        return maxWateredSections+1;
    }

    @Override
    public long[] gap(int g, long m, long n) {
        return new long[0];
    }

    @Override
    public int zeros(int n) {
        int multiplier =5;
        int result=0;
        while (n>multiplier){
            result+=n/multiplier;
            multiplier*=5;
        }
        return result;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        BigInteger prefSquare = BigInteger.valueOf(0), currentSquare = BigInteger.valueOf(1);
        BigInteger nextSquare = BigInteger.valueOf(1), sumOfSides = BigInteger.valueOf(1);

        for (BigInteger i = BigInteger.valueOf(0);
             i.compareTo(n) == -1;
             i = i.add(BigInteger.valueOf(1))) {
            prefSquare = currentSquare;
            currentSquare = nextSquare;
            nextSquare = prefSquare.add(currentSquare);
            sumOfSides = sumOfSides.add(currentSquare);
        }
        return sumOfSides.multiply(BigInteger.valueOf(4));
    }

    @Override
    public double solveSum(double m) {
        return 0;
    }

    @Override
    public long[] smallest(long n) {
        return new long[0];
    }
}
