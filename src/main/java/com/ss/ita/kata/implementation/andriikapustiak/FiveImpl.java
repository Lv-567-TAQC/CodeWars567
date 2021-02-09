package com.ss.ita.kata.implementation.andriikapustiak;

import com.ss.ita.kata.Five;

import java.math.BigInteger;

public class FiveImpl implements Five {
    @Override

        public int artificialRain(int[] v) {
            int maxWateredSections = 0;

            int numberOfSections = v.length;
            int[] leftPartOfWateredSection = new int[numberOfSections];
            int[] rightPartOfWateredSection = new int[numberOfSections];

            //Left side
            for (int i=1;i<numberOfSections;i++){
                if(v[i]>=v[i-1]){
                    leftPartOfWateredSection[i]=leftPartOfWateredSection[i-1]+1;
                }
                else {
                    leftPartOfWateredSection[i]=0;
                }
            }

            //right side
            for (int i=v.length-2;i>=0;i--){
                if(v[i]>=v[i+1]){
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
        return 0;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        return null;
    }

    @Override
    public double solveSum(double num) {
        int zeros=0;
        for(int i=2; i<=num; i++) {
            zeros += countFactorsOf5(i);
        }
        return zeros;
    }

    public static int countFactorsOf5(int i)
    {
        int count=0;
        while(i % 5 == 0)
        {
            count++;
            i /= 5;
        }
        return count;
    }


    @Override
    public long[] smallest(long n) {
        return new long[0];
    }
}
