package com.ss.ita.kata.seven;

import com.ss.ita.kata.Seven;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(Parameterized.class)
public class LookingForABenefactorTest extends com.ss.ita.kata.seven.SevenDataProviderImplementation{
    private final Seven implementation;

    public LookingForABenefactorTest(final Seven implementation) {
        this.implementation = implementation;
    }

    @Test
    public void newAvgSimle() {
        System.out.println("Checking for implementation: " + implementation);
        long actual = implementation.newAvg(new double[]{14, 30, 5, 7, 9, 11, 15}, 30);
        long expected = 149;
        assertEquals(expected, actual, String.format("Test %s failed!", implementation));
        long actual1 = implementation.newAvg(new double[]{14, 30, 5, 7, 9, 11, 15}, 92);
        long expected1 = 645;
    }

    @Test
    public void newAvgDouble() {
        System.out.println("Checking for implementation: " + implementation);
        long actual3 = implementation.newAvg(new double[]{14.0, 30.0, 5.0, 7.0, 9.0, 11.0, 16.0}, 90);
        long expected3 = 628;
        assertEquals(expected3, actual3, String.format("Test %s failed!", implementation));
        long actual6 = implementation.newAvg(new double[]{21.4, 354.2, 23.5, 23.6}, 341);
        long expected6 = 1283;
        assertEquals(expected6, actual6, String.format("Test %s failed!", implementation));
    }

    @Test
    public void newAvgEmpty() {
        System.out.println("Checking for implementation: " + implementation);
        long actual4 = implementation.newAvg(new double[]{}, 90);
        long expected4 = 90;
        assertEquals(expected4, actual4, String.format("Test %s failed!", implementation));
    }

    @Test
    public void newAvgZeros() {
        System.out.println("Checking for implementation: " + implementation);
        long actual5 = implementation.newAvg(new double[]{0, 0, 0, 0, 0}, 90);
        long expected5 = 540;
        assertEquals(expected5, actual5, String.format("Test %s failed!", implementation));
    }

    @Test
    public void newAvgNegativeLess() {
        System.out.println("Checking for implementation: " + implementation);

        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            implementation.newAvg(new double[]{14, 30, 5, 7, 9, 11, 15}, 2);
        });
    }

    @Test
    public void newAvgNegativeArray() {
        System.out.println("Checking for implementation: " + implementation);
        Throwable exception2 = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            implementation.newAvg(new double[]{-56, -6, -56, -64, -34, -56, -546}, 22);
        });
    }

    @Test
    public void newAvgNegativeAll() {
        System.out.println("Checking for implementation: " + implementation);
        Throwable exception3 = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            implementation.newAvg(new double[]{-56, -6, -56, -64, -34, -56, -546}, -5464);
        });
    }

    @Test
    public void newAvgNegativeNewAvarage() {
        System.out.println("Checking for implementation: " + implementation);
        Throwable exception4 = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            implementation.newAvg(new double[]{14, 30, 5, 7, 9, 11, 15}, -5666);
        });
    }
}