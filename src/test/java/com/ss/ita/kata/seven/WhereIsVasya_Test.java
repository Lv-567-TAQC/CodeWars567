package com.ss.ita.kata.seven;

import com.ss.ita.kata.Seven;
import com.ss.ita.kata.implementation.khrystiash.SevenImplementation;
import org.junit.jupiter.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class WhereIsVasya_Test extends SevenDataProviderImplementation {


    private final Seven implementation;

    public WhereIsVasya_Test(final Seven implementation) {
        this.implementation = implementation;
    }

    @Test

    public void whereIsHe_RegularTest() {

        System.out.println(String.format("Checking for implementation: %s", implementation));
        Assertions.assertEquals(2, implementation.whereIsHe(3, 1, 1));
        String.format("Test %s failed!", implementation.getClass());
    }

    @Test
    public void whereIsHe_RegularTest_2() {

        System.out.println(String.format("Checking for implementation: %s", implementation));
        Assertions.assertEquals(52, implementation.whereIsHe(79, 27, 52));

    }

    @Test

    public void whereIsHe_NegativeNumberTest() {
        System.out.println(String.format("Checking for implementation: %s", implementation));
        Assertions.assertEquals(-1, implementation.whereIsHe(5, -2, 3));

    }
}







