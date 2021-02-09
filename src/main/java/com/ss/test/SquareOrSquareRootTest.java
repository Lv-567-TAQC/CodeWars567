package com.ss.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import com.ss.ita.kata.Eight;

import java.lang.NullPointerException;

class SquareOrSquareRootTest {

	List <Eight> implementations = Arrays.asList(
				new com.ss.ita.kata.implementation.Nnn7.EightImpl(),
				new com.ss.ita.kata.implementation.andriikapustiak.EightImpl(), 
				new com.ss.ita.kata.implementation.khrystiash.EightImplementation(),
				new com.ss.ita.kata.implementation.kuderiavetsnata.EightImpl(),
				new com.ss.ita.kata.implementation.nataliia0223.EightImpl(),
				new com.ss.ita.kata.implementation.romankhvalbota.EightImpl(),
				new com.ss.ita.kata.implementation.vladislavshevhcuk.EightImp() );
		
	
	
	
	@Test
	public void testPositive() {	
		for(Eight implementation: implementations) {
			System.out.println(String.format("TestPositive checking for implementation: %s", implementation));
			int[] arr = {4, 3, 9, 7, 2, 1};
			int[] waitedresult = {2, 9, 3, 49, 4, 1};	
			int[] output = implementation.squareOrSquareRoot(arr);					
			try {
				assertArrayEquals(waitedresult,output);
			} catch(AssertionError e) {
				System.out.println("Negative realization");
			}
			System.out.println("+");	
		}		
	}
	
	@Test
	public void testNegative() {	
		for(Eight implementation: implementations) {
			System.out.println(String.format("TestNegative checking for implementation: %s", implementation));
			boolean isResult = true;
			 
		    try{    
		    	int[] arr1 = null;	    	
		    	int[] output1 = implementation.squareOrSquareRoot(arr1);		    	
		        }catch(NullPointerException e){
		        	isResult=false;
		        	}    
			
		    assertFalse(isResult);
		    System.out.println("+");
			}		
	}
	
	
	
	
	
}
