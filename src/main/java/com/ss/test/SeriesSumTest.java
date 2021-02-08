package com.ss.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.ss.ita.kata.Seven;

class SeriesSumTest {

	
	
	List <Seven> implementations = Arrays.asList(
			new com.ss.ita.kata.implementation.Nnn7.SevenImpl(),
			new com.ss.ita.kata.implementation.andriikapustiak.SevenImpl(), 
			new com.ss.ita.kata.implementation.khrystiash.SevenImplementation(),
			new com.ss.ita.kata.implementation.kuderiavetsnata.SevenImpl(),
			new com.ss.ita.kata.implementation.nataliia0223.SevenImpl(),
			new com.ss.ita.kata.implementation.romankhvalbota.SevenImpl(),
			new com.ss.ita.kata.implementation.vladislavshevhcuk.SevenImp() );
	
	
	@Test
	public void testPositive() {	
		for(Seven implementation: implementations) {
			System.out.println(String.format("TestPositive checking for implementation: %s", implementation));
			int number = 9;
			
			String waitedresult1 = "1,77";
			String waitedresult2 = "1.77";
			boolean result;
						
			String output = implementation.seriesSum(number);		
			
			
			try {
				assertTrue(waitedresult1.equals(output) || waitedresult2.equals(output));
			} catch(AssertionError e) {
				System.out.println("Negative realization");
			}
			System.out.println("+");
		}		
	}
	
	
	@Test
	void testNegative() {
		List <AssertionError> failedAssert = new ArrayList<>();
		for(Seven implementation: implementations) {
			System.out.println(String.format("TestNegative checking for implementation: %s", implementation));
			int number = -1;
			
			String waitedresult1 = "";
			
			String output = implementation.seriesSum(number);	
			System.out.println(output);
			try {
				assertTrue(waitedresult1.equals(output));
			} catch(AssertionError e) {
				failedAssert.add(e);
			}
			if(failedAssert.size() > 0) {
				throw new AssertionError(String.format("Test is failed on: %s", failedAssert));
			}
	}

}
}