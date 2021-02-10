package com.ss.ita.kata.eigth;

import com.ss.ita.kata.Eight;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class WilsonPrimeTest {
    List <Eight> impl = Arrays.asList(
            new com.ss.ita.kata.implementation.Nnn7.EightImpl(),
            new com.ss.ita.kata.implementation.andriikapustiak.EightImpl(),
            new com.ss.ita.kata.implementation.khrystiash.EightImplementation(),
            new com.ss.ita.kata.implementation.kuderiavetsnata.EightImpl(),
            new com.ss.ita.kata.implementation.nataliia0223.EightImpl(),
            new com.ss.ita.kata.implementation.romankhvalbota.EightImpl(),
            new com.ss.ita.kata.implementation.vladislavshevhcuk.EightImp() );


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
