package com.ss.ita.kata.implementation.Nnn7;
import java.math.BigInteger;
import com.ss.ita.kata.Five;
import java.io.*; 
import java.util.*; 

public class FiveImpl implements Five{

	@Override
	public int artificialRain(int[] v) {
		int r = 0, curHigh = 0, lastLow = 0, curSize = 1;
        for (int i = 1; i < v.length; i++) {
            int x = v[i];
            if (x < v[i-1]) {
              lastLow = i;
            }else if (x > v[i-1]) {
                r = Math.max(r, curSize);
                curSize = i - lastLow;
                curHigh = i;
            }
            curSize++;
        }
        return Math.max(r,curSize);
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
		 int result = 0;
		 while (n > 0) {
			 n /= 5;
		     result += n;
		 }
		 return result;
	}

	@Override
	public BigInteger perimeter(BigInteger n) {
		  BigInteger last = new BigInteger("0");
	    BigInteger curr = new BigInteger("1");
	    BigInteger total = new BigInteger("1");
	    for (long i = 0; i < n.longValue(); i++) {
	           BigInteger next = curr.add(last);
	           total = total.add(next);
	           last = curr;
	           curr = next;
	    }
	    return total.multiply(BigInteger.valueOf(4));
	}

	@Override
	public double solveSum(double m) {
	    double result;
	    result = (1-Math.sqrt(4*m+1))/(2*m)+1;
	    return result;
	}

	@Override
	public long[] smallest(long n) {
	    if(n<0){
	    	long[] r = {-1};
	        return r;
	    	}    
		String[] symbols = String.valueOf(n).split("");
		int previousIndex = -1;
		int finalIndex = -1;
		long minimalNumber = n;
		
		for(int i=0; i<symbols.length; i++) { // from
			for(int j=0; j<symbols.length; j++) { // to
				if(j != i) {
					System.out.println("=======from " + i + " to " + j);
					StringBuilder currentDigits = new StringBuilder();
					for(int k=0; k<symbols.length; k++) {
						if (k != i) {
							currentDigits.append(symbols[k]);
						}
					}
					currentDigits.insert(j, symbols[i]);
					long currentNumber = Long.parseLong(currentDigits.toString());
					if (currentNumber < minimalNumber) {
						minimalNumber = currentNumber;
						previousIndex = i;
						finalIndex = j;
					}
				}
			}
		}
		long [] result = {minimalNumber, previousIndex, finalIndex};
		return result;
	}

}
