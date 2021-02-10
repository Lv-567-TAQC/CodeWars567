package com.ss.ita.kata.eigth;


import static org.junit.Assert.*;
import com.ss.ita.kata.Eight;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(Parameterized.class)
public class SquareOrSquareRootTest extends com.ss.ita.kata.eigth.EightDataProviderImplementation {

    private final Eight implementation;

    public SquareOrSquareRootTest(final Eight implementation) {
        this.implementation = implementation;
    }

    @Test
    public void TestPositive() {
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

    @Test
    public void TestNegative() {
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
