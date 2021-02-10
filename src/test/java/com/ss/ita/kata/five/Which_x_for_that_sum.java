package com.ss.ita.kata.five;

import com.ss.ita.kata.Five;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class Which_x_for_that_sum extends FiveDataProviderImplementation {

    private final Five implementation;

    public Which_x_for_that_sum(final Five implementation) {
        this.implementation = implementation;
    }

    @Test
    public void solveSumDefaultTest() {
        System.out.println(String.format("Checking for implementation: %s", implementation));

        Assertions.assertEquals(0.5,implementation.solveSum(2.0),1e-12,
                String.format("Test %s failed!",implementation.getClass()));
        Assertions.assertEquals(0.7034648345913732,implementation.solveSum(8.0),1e-12,
                String.format("Test %s failed!",implementation.getClass()));
        Assertions.assertEquals(6.096117967978e-01,implementation.solveSum(4.0),1e-12,
                String.format("Test %s failed!",implementation.getClass()));
    }

    @Test
    public void solveSumZeroTest() {
        System.out.println(String.format("Checking for implementation: %s", implementation));

        boolean isNan = Double.isNaN(implementation.solveSum(0.0));
        Assertions.assertTrue(isNan);
    }

    @Test
    public void solveSumLessThanZeroTest() {
        System.out.println(String.format("Checking for implementation: %s", implementation));

        boolean isNan = Double.isNaN(implementation.solveSum(-1.2));
        Assertions.assertTrue(isNan);
    }
}