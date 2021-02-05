package com.ss.ita.kata.implementation.Nnn7;

import com.ss.ita.kata.Six;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class SixImpl implements Six {

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
	DecimalFormat dec = new DecimalFormat("#0.00");
	double total;
    double remainingTotal;
    double elementsQty = 0;
    double totalExpenses;
		String[] bookSplitted;
    String validSymbolsRegex = "[^A-Za-z0-9. \n\r]";
    
    bookSplitted = book.replaceAll(validSymbolsRegex, "").trim().replaceAll(" +", " ").split("\n");

    total = Double.parseDouble(bookSplitted[0]);
    remainingTotal = total;
        		
        ArrayList<String> result = new ArrayList<>();
        result.add(String.format("Original Balance: %s", dec.format(total)));
        for (int i = 1; i < bookSplitted.length; i++) {
        	if(bookSplitted[i] != "") {
            String currentLine = bookSplitted[i].trim();
        		String[] splittedLine = currentLine.split(" ");
        		double currentPrice = Double.parseDouble(splittedLine[splittedLine.length - 1]);
        		remainingTotal -= currentPrice;
        		currentLine += " "+ String.format("Balance %s", dec.format(remainingTotal));

        		result.add(currentLine);
        		elementsQty ++;
        	}
        }
        totalExpenses = total - remainingTotal;
        result.add(String.format("Total expense  %s", dec.format(totalExpenses)));
        result.add(String.format("Average expense  %s", dec.format(totalExpenses/elementsQty)));
      return String.join("\\r\\n", result);
	}

	@Override
	public double f(double x) {
		double result;
		result = x/(1+Math.sqrt(++x));
	    return result;
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
