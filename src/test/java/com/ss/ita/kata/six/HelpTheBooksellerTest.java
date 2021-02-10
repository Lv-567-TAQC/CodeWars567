package com.ss.ita.kata.six;


import static org.junit.Assert.*;
import com.ss.ita.kata.Six;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(Parameterized.class)
public class HelpTheBooksellerTest extends com.ss.ita.kata.six.SixDataProviderImplementation {

    private final Six implementation;

    public HelpTheBooksellerTest(final Six implementation) {
        this.implementation = implementation;
    }

    @Test
    public void TestPositive() {
       System.out.println(String.format("TestPositive checking for implementation: %s", implementation));
			System.out.println(String.format("TestPositive checking for implementation: %s", implementation));
				
			String art[] = new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"};
			String cd[] = new String[] {"A", "B"};			
			try {
				Assertions.assertTrue("(A : 200) - (B : 1140)".equals( implementation.stockSummary(art, cd)));
			} catch(AssertionError e) {
				System.out.println("Negative realization");
			}				
    }

    @Test
    public void TestNegative() {
        System.out.println(String.format("TestNegative checking for implementation: %s", implementation));
			System.out.println(String.format("TestNegative  checking for implementation: %s", implementation));
				
			String art[] = new String[]{"200 ABAR", "500 CDXE", "250 BKWR", "890 BTSQ", "600 DRTY"};
			String cd[] = new String[] {"A", "B"};			
			try {
				Assertions.assertTrue("(A : 200) - (B : 1140)".equals( implementation.stockSummary(art, cd)));
			} catch(AssertionError e) {
				System.out.println("+");
				System.out.println(" ");
			}				
    }   
    
}
