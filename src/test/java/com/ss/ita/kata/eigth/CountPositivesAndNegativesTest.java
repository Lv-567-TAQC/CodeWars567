package com.ss.ita.kata.eigth;

import com.ss.ita.kata.Eight;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public  class CountPositivesAndNegativesTest  extends EightDataProviderImplementation{
    private final Eight implementation;

    public CountPositivesAndNegativesTest(final Eight implementation) {
        this.implementation = implementation;
    }

    @Test
    public void countPositivesSumNegatives_SimpleTest() {

            System.out.println(String.format("Checking for implementation: %s", implementation));


            Assertions.assertArrayEquals(new int[]{10, -65}, implementation.countPositivesSumNegatives(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15}));
            String.format("Test %s failed!", implementation.getClass());

            Assertions.assertArrayEquals(new int[]{8, -50}, implementation.countPositivesSumNegatives(new int[]{0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14}));
            String.format("Test %s failed!", implementation.getClass());
        }
    }


