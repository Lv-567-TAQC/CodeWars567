package com.ss.ita.kata.five;

import com.ss.ita.kata.Five;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@RunWith(Parameterized.class)
public class FindTheSmallestTest extends com.ss.ita.kata.five.FiveDataProviderImplementation {
    private final Five implementation;

    public FindTheSmallestTest(final Five implementation) {
        this.implementation = implementation;
    }

    @Test
    public void smallestSimple() {
        System.out.println("Checking for implementation: " + implementation);
        long[] actual = implementation.smallest(261235L);
        long[] expected = {126235, 2, 0};
        assertArrayEquals(expected, actual, String.format("Test %s failed!", implementation));
        long[] actual1 = implementation.smallest(209917L);
        long[] expected1 = {29917, 0, 1};
        assertArrayEquals(expected1, actual1, String.format("Test %s failed!", implementation));
        long[] actual2 = implementation.smallest(285365);
        long[] expected2 = {238565, 3, 1};
        assertArrayEquals(expected2, actual2, String.format("Test %s failed!", implementation));
        long[] actual3 = implementation.smallest(296837L);
        long[] expected3 = {239687, 4, 1};
        assertArrayEquals(expected3, actual3, String.format("Test %s failed!", implementation));
    }

    @Test
    public void smallestNull() {
        System.out.println("Checking for implementation: " + implementation);
        long[] actual4 = implementation.smallest(0);
        long[] expected4 = {0, 0, 0};
        assertArrayEquals(expected4, actual4, String.format("Test %s failed!", implementation));
    }

    @Test
    public void smallestAllEquals() {
        System.out.println("Checking for implementation: " + implementation);
        long[] actual5 = implementation.smallest(11111);
        long[] expected5 = {11111, 0, 0};
        assertArrayEquals(expected5, actual5, String.format("Test %s failed!", implementation));
    }

    @Test
    public void smallestFirstDifferent() {
        System.out.println("Checking for implementation: " + implementation);
        long[] actual6 = implementation.smallest(1000000);
        long[] expected6 = {1, 0, 6};
        assertArrayEquals(expected6, actual6, String.format("Test %s failed!", implementation));
    }


    @Test
    public void smallestNegative() {
        System.out.println("Checking for implementation: " + implementation);
        long[] actual = implementation.smallest(-296837L);
        long[] expected = {-1, -1, -1};
        assertArrayEquals(expected, actual, String.format("Test %s failed - negative value!", implementation));
    }
}
