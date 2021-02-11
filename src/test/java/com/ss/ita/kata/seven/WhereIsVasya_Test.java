package com.ss.ita.kata.seven;

import com.ss.ita.kata.Seven;
import com.ss.ita.kata.implementation.khrystiash.SevenImplementation;
import org.junit.jupiter.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(Parameterized.class)
public class WhereIsVasya_Test extends SevenDataProviderImplementation{


    private final Seven implementation;

    public  WhereIsVasya_Test(final Seven implementation) { this.implementation = implementation; }

    @Test

    public void whereIsHe_RegularTest() {

            System.out.println(String.format("Checking for implementation: %s", implementation));

            Assertions.assertEquals(2, implementation.whereIsHe(3, 1, 1));
            String.format("Test %s failed!",implementation.getClass());

            Assertions.assertEquals(3, implementation.whereIsHe(5, 2, 3));
            String.format("Test %s failed!",implementation.getClass());
        }
    }





