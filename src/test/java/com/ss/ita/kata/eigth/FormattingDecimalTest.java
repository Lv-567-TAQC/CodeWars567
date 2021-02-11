package com.ss.ita.kata.eigth;

import com.ss.ita.kata.Eight;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(Parameterized.class)
public class FormattingDecimalTest extends com.ss.ita.kata.eigth.EightDataProviderImplementation {

    private final Eight implementation;

    public FormattingDecimalTest(Eight implementation) {
        this.implementation = implementation;
    }

    @Test
    public void FormattingDecimal1() {
        assertEquals(1234.23, implementation.twoDecimalPlaces(1234.23456));
    }

    @Test
    public void FormattingDecimalNegativeNumb() {
        assertEquals(-5.35, implementation.twoDecimalPlaces(-5.3456));
    }

    @Test
    public void FormattingDecimalZero() {
        assertEquals(0.0, implementation.twoDecimalPlaces(0));
    }

}

