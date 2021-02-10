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
        for(long i = m;i<=n-g;i++){
            boolean flag = true;
            if(isPrime(i)){
                if(isPrime(i+g)){
                    for(long j=i+1;j<i+g;j++){
                        if(isPrime(j)) {
                            flag = false;
                            break;
                        }
                    }
                    if(flag){
                        result[0]=i;
                        result[1]=i+g;
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
        return 0;
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
        return new long[0];
    }
}
