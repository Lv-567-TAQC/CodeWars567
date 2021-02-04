package com.ss.ita.kata.implementation.Nnn7;

import com.ss.ita.kata.Eight;

public class EightImpl implements Eight{

	@Override
	public int liters(double time) {
		double liters = 0.5f;
		liters=(liters*time) - (liters*time)%1;    
		int result=(int)liters; 
		return result;
	}

	@Override
	public double getVolumeOfCuboid(double length, double width, double height) {
		double volumeofcuboid = length *width *height;
		int result=(int)volumeofcuboid; 
		return result;
	}

	@Override
	public float mpgToKPM(float mpg) {
		double kmperlitres;
		double changer = 1.609344d/ 4.54609188;
		kmperlitres= mpg*changer;
		double result = Math.round(kmperlitres*100)/100.00;
		return  (float)result;
	}

	@Override
	public int[] squareOrSquareRoot(int[] array) {
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

	@Override
	public int[] countPositivesSumNegatives(int[] input) {
        int[] finalr = {};  
        if(input==null || input.length == 0){          
            return finalr;
        }else{
            int len = input.length;
	          int countpos = 0;
	          int sumnegative = 0;
            for(int i=0; i<len; i++){
	    	    if (input[i]<0) {
	    		      sumnegative+=input[i];
	          }else if(input[i]>0){
	    		      countpos+=1;
	        }	       
	      }	      
	      int [] finalarray = {countpos , sumnegative};
	      return finalarray;       
        }	       
	}

	@Override
	public int stringToNumber(String str) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean amIWilson(double n) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double twoDecimalPlaces(double number) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int[] divisibleBy(int[] numbers, int divider) {
		// TODO Auto-generated method stub
		return null;
	}

}
