package com.ss.ita.kata.eigth;


import com.ss.ita.kata.Eight;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MilesPerGallonToKilometersPerLiter {
    List <Eight> impl = Arrays.asList(
            new com.ss.ita.kata.implementation.andriikapustiak.EightImpl(),
            new com.ss.ita.kata.implementation.khrystiash.EightImplementation(),
            new com.ss.ita.kata.implementation.kuderiavetsnata.EightImpl(),
            new com.ss.ita.kata.implementation.nataliia0223.EightImpl(),
            new com.ss.ita.kata.implementation.Nnn7.EightImpl(),
            new com.ss.ita.kata.implementation.romankhvalbota.EightImpl(),
            new com.ss.ita.kata.implementation.vladislavshevhcuk.EightImp());

    @Test
    public void mpgToKPMOne() {
        for (Eight impl : impl) {
            System.out.println("Checking for implementation: " + impl);
            float actual = impl.mpgToKPM(1);
            float expected = 0.35f;
            assertEquals(actual, expected, String.format("Test %s failed!", impl));
        }
    }

    @Test
    public void mpgToKPMNull() {
        for (Eight impl : impl) {
            System.out.println("Checking for implementation: " + impl);
            float actual = impl.mpgToKPM(0);
            float expected = 0.0f;
            assertEquals(expected, actual, String.format("Test %s failed!", impl));
        }
    }

    @Test
    public void mpgToKPMSimpleInt() {
        for (Eight impl : impl) {
            System.out.println("Checking for implementation: " + impl);
            float actual = impl.mpgToKPM(4);
            float expected = 1.42f;
            assertEquals(expected, actual, String.format("Test %s failed!", impl));
        }
    }

    @Test
    public void mpgToKPMSimpleFloat() {
        for (Eight impl : impl) {
            System.out.println("Checking for implementation: " + impl);
            float actual = impl.mpgToKPM(4.6f);
            float expected = 1.63f;
            assertEquals(expected, actual, String.format("Test %s failed!", impl));
        }
    }


    @Test
    public void mpgToKPMNegative() {
        for (Eight impl : impl) {
            System.out.println("Checking for implementation: " + impl);
            float actual = impl.mpgToKPM(-4);
            float expected = -1;
            assertEquals(expected, actual, String.format("Test %s failed - negative value!", impl));
        }
    }
}
