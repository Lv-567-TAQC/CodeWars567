package com.ss.ita.kata.implementation.Nnn7;

import com.ss.ita.kata.Seven;

public class SevenImpl implements Seven{

	@Override
	public long newAvg(double[] arr, double navg) {
		  int len = arr.length;
	        double sum = 0;
	        long result = 0;      
	        double test = 0;
	        if(len==0){
	            result = (long)navg;
	            return result;
	        }
	      
	        if ((navg<30)||(arr[len-1]<0)){        
	            throw new java.lang.IllegalArgumentException();
	        }         
	      
	        for (int i=0; i<len; i++){
	            sum += arr[i];          
	        }  
	        test = ((len+1)*navg-sum);
	        result=(long)test;
	        
	        if(result<0){
	            throw new java.lang.IllegalArgumentException();
	        }
	        
	        if(test*100%100>0){
	            result++;
	        }
	        return result;
	}

	@Override
	public String seriesSum(int n) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int whereIsHe(int p, int bef, int aft) {
		// TODO Auto-generated method stub
		return 0;
	}

}
