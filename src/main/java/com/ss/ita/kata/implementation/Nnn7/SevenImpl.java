package com.ss.ita.kata.implementation.Nnn7;

import com.ss.ita.kata.Seven;

public class SevenImpl implements Seven{

	@Override
	public long newAvg(double[] arr, double navg) {
		int len = arr.length;
        double sum = 0;
        long result = 0;
          
        if ((navg<30)||(arr[len-1]<0)){        
            throw new java.lang.IllegalArgumentException();
        }         
      
        for (int i=0; i<len; i++){
            sum += arr[i];          
        }  
        result = (long)((len+1)*navg-sum);
      
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
