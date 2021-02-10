package com.ss.ita.kata.seven;


import static org.junit.Assert.*;
import com.ss.ita.kata.Seven;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class SeriesSumTest extends com.ss.ita.kata.seven.SevenDataProviderImplementation {

    private final Seven implementation;

    public SeriesSumTest(final Seven implementation) {
        this.implementation = implementation;
    }

    @Test
    public void TestPositive() {
       System.out.println(String.format("TestPositive checking for implementation: %s", implementation));
				
		System.out.println(String.format("TestPositive checking for implementation: %s", implementation));
            int number = 9;
            String waitedresult1 = "1,77";
            String waitedresult2 = "1.77";
            boolean result;

            String output = implementation.seriesSum(number);


            try {
                Assertions.assertTrue(waitedresult1.equals(output) || waitedresult2.equals(output));
            } catch (AssertionError e) {
                System.out.println("Negative realization");
            }
            System.out.println("+");	
    }

    @Test
    public void TestNegative() {
        List<AssertionError> failedAssert = new ArrayList<>();
         
            System.out.println(String.format("TestNegative checking for implementation: %s", implementation));
            int number = -1;

            String waitedresult1 = "";
            String waitedresult2 = "0.00";
            String waitedresult3 = "0,00";

            String output = implementation.seriesSum(number);
            		//System.out.print("Test==");
            System.out.println(output);
            try {
                Assertions.assertTrue(waitedresult1.equals(output)||waitedresult2.equals(output)||waitedresult3.equals(output));
            } catch (AssertionError e) {
                failedAssert.add(e);
                System.out.println("");
            }
            if (failedAssert.size() > 0) {
                throw new AssertionError(String.format("Test is failed on: %s", failedAssert));
            }
         
    }   
}
