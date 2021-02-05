package com.ss.ita.kata.implementation.Nnn7;

import java.math.BigInteger;

import com.ss.ita.kata.Five;

public class FiveImpl implements Five{

	@Override
	public int artificialRain(int[] v) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long[] gap(int g, long m, long n) {
    	
        if((m>1100000)||(n>1100000)){
            return null;
        }
        long num1=0;
        long num2=0;
        boolean wasFound = false;
        boolean test = false;       

        for(long i=m; i<n; i++){        
            test = false;
            for (long ii = 2; ii <= i/2; ii++){  
                if (i % ii == 0) {                                            
                    test = true;
                    break;
                }
            }
            
            if(test==false){
            		if (num1 == 0) {
            				num1 = i;
            		} else {
            				if(i - num1 == g) {
            						num2=i;
            						wasFound = true;
            						break;
            				} else {
            						num1 = i;
            				}
            		}                   
                
            }                
        }     
        
        if (wasFound==true) {         
        		long [] result = {num1, num2};        
        		return result;
        }
        return null;
	}

	@Override
	public int zeros(int n) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public BigInteger perimeter(BigInteger n) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double solveSum(double m) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long[] smallest(long n) {
		// TODO Auto-generated method stub
		return null;
	}

}
