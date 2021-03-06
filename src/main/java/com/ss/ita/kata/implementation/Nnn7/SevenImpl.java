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
		if (n<0) {
			return "";
		}
      double result =0;
			double test = 0;
			String fresult;
			if(n==0){
					result=0.00d;
			}
			if(n>0){
					for(int i=1; i<=n; i++){
							test= 1/(1+(i-1)*3d);
							result += test;
	        }
	        }
			fresult = String.format("%.2f", result);	    
			return fresult;
	}

	@Override
	public int whereIsHe(int p, int bef, int aft) {
      int result=0;
		if(p > 0 && bef > 0 && aft > 0){
			for (int i=1; i<=p; i++){
					if((bef<i)&&((p-aft)<=i)){  
						result++;
            }
			}
			return result;
	}
            return -1;}
}
