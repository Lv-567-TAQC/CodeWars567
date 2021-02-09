package com.ss.ita.kata.eigth;

import com.ss.ita.kata.Eight;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class EightImplTest {
    List <Eight> impl = Arrays.asList(
            new com.ss.ita.kata.implementation.Nnn7.EightImpl(),
            new com.ss.ita.kata.implementation.andriikapustiak.EightImpl(),
            new com.ss.ita.kata.implementation.khrystiash.EightImplementation(),
            new com.ss.ita.kata.implementation.kuderiavetsnata.EightImpl(),
            new com.ss.ita.kata.implementation.nataliia0223.EightImpl(),
            new com.ss.ita.kata.implementation.romankhvalbota.EightImpl(),
            new com.ss.ita.kata.implementation.vladislavshevhcuk.EightImp() );

    @Test
    public void mpgToKPMPositive() {
        for (Eight impl : impl) {
            System.out.println("Checking for implementation: " + impl);
            float actual = impl.mpgToKPM(1);
            float expected = 0.35f;
            Assertions.assertEquals(expected , actual, String.format("Test %s failed!", impl));
            float actual1 = impl.mpgToKPM(0);
            float expected1 = 0.0f;
            Assertions.assertEquals(expected1, actual1, String.format("Test %s failed!", impl));
            float actual2 = impl.mpgToKPM(4);
            float expected2 = 1.42f;
            Assertions.assertEquals(expected2, actual2, String.format("Test %s failed!", impl));
        }
    }


    @Test
    public void mpgToKPMNegative() {
        for (Eight impl : impl) {
            System.out.println("Checking for implementation: " + impl);
            float actual = impl.mpgToKPM(-4);
            float expected = -1;
            Assertions.assertEquals(actual, expected, String.format("Test %s failed - negative value!", impl));
        }
    }

    @Test
    public void testWilsonPrime1() {
        for (Eight impl : impl) {
            System.out.println(String.format("Checking for implementation: %s", impl));
            assertEquals(false, impl.amIWilson(0));
        }
    }

    @Test
    public void testWilsonPrime2() {
        for (Eight impl : impl) {
            System.out.println(String.format("Checking for implementation: %s", impl));
            assertEquals(false, impl.amIWilson(1));
        }
    }

    @Test
    public void testWilsonPrime3() {
        for (Eight impl : impl) {
            System.out.println(String.format("Checking for implementation: %s", impl));
            assertEquals(true, impl.amIWilson(5));
        }
    }

    @Test
    public void testWilsonPrime4() {
        for (Eight impl : impl) {
            System.out.println(String.format("Checking for implementation: %s", impl));
            assertEquals(false, impl.amIWilson(-5));
        }
    }
}
