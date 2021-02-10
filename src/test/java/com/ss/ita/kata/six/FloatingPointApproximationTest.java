package com.ss.ita.kata.six;


import com.ss.ita.kata.Six;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(Parameterized.class)
public class FloatingPointApproximationTest extends SixDataProviderImplementation {

    private final Six implementation;

    public FloatingPointApproximationTest(Six implementation) {
        this.implementation = implementation;
    }

    @Test
    public void FloatingPointApproximationTest1() {
        assertEquals(110.11311106255643, implementation.f(12345.12345));
    }

    @Test
    public void FloatingPointApproximationTestZero() {
        assertEquals(0.0, implementation.f(0));
    }

    @Test
    public void FloatingPointApproximationTestNegativeNumb() {
        boolean expected = Double.isNaN(0.0);


        assertEquals(Double.NaN, implementation.f(-5));
    }
}
