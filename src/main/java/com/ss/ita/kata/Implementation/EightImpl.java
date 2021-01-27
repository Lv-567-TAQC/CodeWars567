package com.ss.ita.kata.Implementation;

import com.ss.ita.kata.Eight;

public class EightImpl implements Eight{

	@Override
	public int liters(double time) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getVolumeOfCuboid(double length, double width, double height) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float mpgToKPM(float mpg) {
		// TODO Auto-generated method stub
		return 0;
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
		// TODO Auto-generated method stub
		return null;
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
