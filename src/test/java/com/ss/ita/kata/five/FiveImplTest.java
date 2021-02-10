package com.ss.ita.kata.five;


import com.ss.ita.kata.Five;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FiveImplTest {
    List<Five> impl = Arrays.asList(
            new com.ss.ita.kata.implementation.Nnn7.FiveImpl(),
            //new com.ss.ita.kata.implementation.andriikapustiak.FiveImpl(),
            new com.ss.ita.kata.implementation.khrystiash.FiveImplementation(),
            //new com.ss.ita.kata.implementation.kuderiavetsnata.Five(),
            new com.ss.ita.kata.implementation.nataliia0223.FiveImpl(),
            //new com.ss.ita.kata.implementation.romankhvalbota.Five(),
            new com.ss.ita.kata.implementation.vladislavshevhcuk.FiveImp());

    @Test
    public void testZeros1() {
        for (Five impl : impl) {
            System.out.println(String.format("Checking for implementation: %s", impl));
            int actual = impl.zeros(0);
            int expected = 0;
            assertEquals(actual, expected);
        }
    }

    @Test
    public void testZeros2() {
        for (Five impl : impl) {
            System.out.println(String.format("Checking for implementation: %s", impl));
            int actual = impl.zeros(6);
            int expected = 1;
            assertEquals(actual, expected);
        }
    }

    @Test
    public void testZeros3() {
        for (Five impl : impl) {
            System.out.println(String.format("Checking for implementation: %s", impl));
            int actual = impl.zeros(14);
            int expected = 2;
            assertEquals(actual, expected);
        }
    }

    @org.junit.jupiter.api.Test
    public void smallestSimple() {
        for (Five impl : impl) {
            System.out.println("Checking for implementation: " + impl);
            long[] actual = impl.smallest(261235L);
            long[] expected = {126235, 2, 0};
            assertArrayEquals(expected, actual, String.format("Test %s failed!", impl));
            long[] actual1 = impl.smallest(209917L);
            long[] expected1 = {29917, 0, 1};
            assertArrayEquals(expected1, actual1, String.format("Test %s failed!", impl));
            long[] actual2 = impl.smallest(285365);
            long[] expected2 = {238565, 3, 1};
            assertArrayEquals(expected2, actual2, String.format("Test %s failed!", impl));
            long[] actual3 = impl.smallest(296837L);
            long[] expected3 = {239687, 4, 1};
            assertArrayEquals(expected3, actual3, String.format("Test %s failed!", impl));
        }
    }

    @org.junit.jupiter.api.Test
    public void smallestNull() {
        for (Five impl : impl) {
            long[] actual4 = impl.smallest(0);
            long[] expected4 = {0, 0, 0};
            assertArrayEquals(expected4, actual4, String.format("Test %s failed!", impl));
        }
    }

    @org.junit.jupiter.api.Test
    public void smallestAllEquals() {
        for (Five impl : impl) {
            long[] actual5 = impl.smallest(11111);
            long[] expected5 = {11111, 0, 0};
            assertArrayEquals(expected5, actual5, String.format("Test %s failed!", impl));
        }
    }

    @org.junit.jupiter.api.Test
    public void smallestFirstDifferent() {
        for (Five impl : impl) {
            long[] actual6 = impl.smallest(1000000);
            long[] expected6 = {1, 0, 6};
            assertArrayEquals(expected6, actual6, String.format("Test %s failed!", impl));
        }
    }


    @org.junit.jupiter.api.Test
    public void smallestNegative() {
        for (Five impl : impl) {
            System.out.println("Checking for implementation: " + impl);
            long[] actual = impl.smallest(-296837L);
            long[] expected = {-1, -1, -1};
            assertArrayEquals(expected, actual, String.format("Test %s failed - negative value!", impl));
        }
    }
}