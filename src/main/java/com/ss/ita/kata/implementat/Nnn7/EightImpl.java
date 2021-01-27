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
		// TODO Auto-generated method stub
		return 0;
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
