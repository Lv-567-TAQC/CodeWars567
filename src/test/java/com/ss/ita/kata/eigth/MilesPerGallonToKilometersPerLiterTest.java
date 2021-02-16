package com.ss.ita.kata.eigth;


import com.ss.ita.kata.Eight;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(Parameterized.class)
public class MilesPerGallonToKilometersPerLiterTest extends com.ss.ita.kata.eigth.EightDataProviderImplementation {
    private final Eight implementation;

    public MilesPerGallonToKilometersPerLiterTest(final Eight implementation) {
        this.implementation = implementation;
    }

    @Test
    public void mpgToKPMOne() {
        System.out.println("Checking for implementation: " + implementation);
        float actual = implementation.mpgToKPM(1);
        float expected = 0.35f;
        assertEquals(actual, expected, String.format("Test %s failed!", implementation));
    }

    @Test
    public void mpgToKPMNull() {
        System.out.println("Checking for implementation: " + implementation);
        float actual = implementation.mpgToKPM(0);
        float expected = 0.0f;
        assertEquals(expected, actual, String.format("Test %s failed!", implementation));
    }

    @Test
    public void mpgToKPMSimpleInt() {
        System.out.println("Checking for implementation: " + implementation);
        float actual = implementation.mpgToKPM(4);
        float expected = 1.42f;
        assertEquals(expected, actual, String.format("Test %s failed!", implementation));
    }

    @Test
    public void mpgToKPMSimpleFloat() {
        System.out.println("Checking for implementation: " + implementation);
        float actual = implementation.mpgToKPM(4.6f);
        float expected = 1.63f;
        assertEquals(expected, actual, String.format("Test %s failed!", implementation));
    }


    @Test
    public void mpgToKPMNegative() {
        System.out.println("Checking for implementation: " + implementation);
        float actual = implementation.mpgToKPM(-4);
        float expected = -1;
        assertEquals(expected, actual, String.format("Test %s failed - negative value!", implementation));
    }
}
