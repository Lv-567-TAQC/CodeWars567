package com.ss.ita.kata.five;

import com.ss.ita.kata.Five;
import com.ss.ita.kata.Seven;
import com.ss.ita.kata.implementation.khrystiash.FiveImplementation;
import org.junit.jupiter.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;


@RunWith(Parameterized.class)
public class ArtificialRain_Test extends FiveDataProviderImplementation {

    private final Five implementation;

    public ArtificialRain_Test(final Five implementation) {
        this.implementation = implementation;
    }

    @Test
    public void regularTest() {

        System.out.println(String.format("Checking for implementation: %s", implementation));
        Assertions.assertEquals(1, implementation.artificialRain(new int[]{2}));
    }

    @Test
    public void regularTest_2() {
        System.out.println(String.format("Checking for implementation: %s", implementation));

        Assertions.assertEquals(3, implementation.artificialRain(new int[]{1, 0, 1, 0, 1, 0}));

        System.out.println(String.format("Checking for implementation: %s", implementation));
        Assertions.assertEquals(4, implementation.artificialRain(new int[]{4, 2, 3, 3, 2}));
    }
}





