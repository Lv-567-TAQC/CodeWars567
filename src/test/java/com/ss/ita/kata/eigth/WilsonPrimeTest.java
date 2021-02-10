package com.ss.ita.kata.eigth;

import com.ss.ita.kata.Eight;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class WilsonPrimeTest extends com.ss.ita.kata.eigth.EightDataProviderImplementation{
    private final Eight implementation;

    public WilsonPrimeTest(Eight implementation) {
        this.implementation = implementation;
    }

    @Test
    public void testWilsonPrime1() {
            System.out.println(String.format("Checking for implementation" + implementation));
            assertEquals(false, implementation.amIWilson(0));
    }

    @Test
    public void testWilsonPrime2() {
            System.out.println(String.format("Checking for implementation" + implementation));
            assertEquals(false, implementation.amIWilson(1));
    }

    @Test
    public void testWilsonPrime3() {
            System.out.println(String.format("Checking for implementation" + implementation));
            assertEquals(true, implementation.amIWilson(5));
    }

    @Test
    public void testWilsonPrime4() {
            System.out.println(String.format("Checking for implementation" + implementation));
            assertEquals(false, implementation.amIWilson(-5));
    }
}
