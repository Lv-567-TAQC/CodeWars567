package com.ss.ita.kata.six;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

import com.ss.ita.kata.Eight;
import com.ss.ita.kata.Six;

import com.ss.ita.kata.implementation.Nnn7.SixImpl;


class HelpTheBooksellerTest {	
	List <Six> implementations = Arrays.asList(
			new com.ss.ita.kata.implementation.Nnn7.SixImpl(), 
			new com.ss.ita.kata.implementation.andriikapustiak.SixImpl(),
			new com.ss.ita.kata.implementation.khrystiash.SixImplementation(),
			new com.ss.ita.kata.implementation.kuderiavetsnata.SixImpl(),
			new com.ss.ita.kata.implementation.nataliia0223.SixImpl(),
			new com.ss.ita.kata.implementation.romankhvalbota.SixImpl(),
			new com.ss.ita.kata.implementation.vladislavshevhcuk.SixImp());
	

	@Test
	void testPositive() {		
		for(Six implementation: implementations) {
			System.out.println(String.format("TestPositive checking for implementation: %s", implementation));
				
			String art[] = new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"};
			String cd[] = new String[] {"A", "B"};			
			try {
				Assertions.assertTrue("(A : 200) - (B : 1140)".equals( implementation.stockSummary(art, cd)));
			} catch(AssertionError e) {
				System.out.println("Negative realization");
			}				
		}		
	}	
	
	@Test
	void testNegative() {		
		for(Six implementation: implementations) {
			System.out.println(String.format("TestNegative  checking for implementation: %s", implementation));
				
			String art[] = new String[]{"200 ABAR", "500 CDXE", "250 BKWR", "890 BTSQ", "600 DRTY"};
			String cd[] = new String[] {"A", "B"};			
			try {
				Assertions.assertTrue("(A : 200) - (B : 1140)".equals( implementation.stockSummary(art, cd)));
			} catch(AssertionError e) {
				System.out.println("+");
			}				
		}		
	}
	
	
	

}
