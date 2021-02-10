package com.ss.ita.kata.five;


import com.ss.ita.kata.Five;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.*;


import static org.junit.Assert.*;
@RunWith(Parameterized.class)
public class ZerosTest extends com.ss.ita.kata.five.FiveDataProviderImplementation{
    private final Five implementation;

    public ZerosTest(final Five implementation) {
        this.implementation = implementation;
    }


    @Test
    public void testZeros1() {
            System.out.println(String.format("Checking for implementation:" + implementation));
            int actual = implementation.zeros(0);
            int expected = 0;
            assertEquals(actual, expected);
    }

    @Test
    public void testZeros2() {
        System.out.println(String.format("Checking for implementation:" + implementation));
            int actual = implementation.zeros(6);
            int expected = 1;
            assertEquals(actual, expected);
    }

    @Test
    public void testZeros3() {
            System.out.println(String.format("Checking for implementation:" + implementation));
            int actual = implementation.zeros(14);
            int expected = 2;
            assertEquals(actual, expected);
    }
}