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
        if(BigInteger.valueOf(-1).compareTo(n) == 0) {
            return BigInteger.valueOf(0);
        }
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
        return (2*m+1-Math.sqrt(4*m+1))/(2*m);
    }

    @Override
    public long[] smallest(long n) {
        if(n <0) return new long[] {-1,-1,-1};

        long minNumber=n;
        int firstIndex=0;
        int secondIndex=0;
        String number = Long.toString(n);
        for (int i = 0; i < number.length(); i++) {
            for (int j = 0; j < number.length(); j++) {
                if(i != j && (digitChanger(number,i,j)<minNumber)){
                    minNumber = digitChanger(number,i,j);
                    firstIndex =i;
                    secondIndex =j;
                }
            }
        }
        return new long[]{minNumber,firstIndex,secondIndex};
    }

    private static long digitChanger(String number, int firstIndex,int secondIndex){
        StringBuilder sb = new StringBuilder(number);
        char digit = sb.charAt(firstIndex);
        sb.deleteCharAt(firstIndex);
        sb.insert(secondIndex,digit);
        return Long.parseLong(sb.toString());
    }
}
