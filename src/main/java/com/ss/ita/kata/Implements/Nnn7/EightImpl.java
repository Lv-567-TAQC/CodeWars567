package com.ss.ita.kata.Implements.Nnn7;

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
		double kmperlitres;
		double changer = 1.609344d/ 4.54609188;
		kmperlitres= mpg*changer;
   		double result = Math.round(kmperlitres*100)/100.00;
    	return  (float)result;
	}

	@Override
	public int[] squareOrSquareRoot(int[] array) {
		// TODO Auto-generated method stub
		return null;
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
