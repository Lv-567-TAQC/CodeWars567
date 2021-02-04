package com.ss.ita.kata.implementation.Nnn7;

import com.ss.ita.kata.Six;

public class SixImpl implements Six{

	@Override
	public long findNb(long m) {
		long test = 0l;
	    long XZ = m;
	    for (int i=1; i< XZ; i++){
	        m = m - (long)Math.pow(i,3);
	        test++;
	      if (m==0){
	        break;
	      }
	      if (m<0){
	        test = -1;
	        break;
	      }     
	    }    
	    return test;    
	}

	@Override
	public String balance(String book) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double f(double x) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double mean(String town, String strng) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double variance(String town, String strng) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String nbaCup(String resultSheet, String toFind) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
		// TODO Auto-generated method stub
		return null;
	}

}
