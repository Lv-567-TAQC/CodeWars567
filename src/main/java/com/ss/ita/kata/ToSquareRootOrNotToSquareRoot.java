package com.ss.ita.kata;


public class ToSquareRootOrNotToSquareRoot implements Eight {
	public static int[] squareOrSquareRoot(int[] array)
	  {
	     
	    double test=0;
	    int len = array.length ;
	    for (int i=0;i<len;i++){
	        test = Math.sqrt(array[i]);
	      
	        if (test%1==0){
	          array[i]=(int)Math.sqrt(array[i]);
	        }
	        else{
	          array[i]=array[i]*array[i];
	        }
	    }
	    
	    return array;
	  }
}
