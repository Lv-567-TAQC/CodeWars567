package com.ss.ita.kata.seven;

import com.ss.ita.kata.Seven;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SevenTest {

    List<Seven> impl = Arrays.asList(
            new com.ss.ita.kata.implementation.Nnn7.SevenImpl(),
            new com.ss.ita.kata.implementation.andriikapustiak.SevenImpl(),
            new com.ss.ita.kata.implementation.khrystiash.SevenImplementation(),
            new com.ss.ita.kata.implementation.kuderiavetsnata.SevenImpl(),
            new com.ss.ita.kata.implementation.nataliia0223.SevenImpl(),
            new com.ss.ita.kata.implementation.romankhvalbota.SevenImpl(),
            new com.ss.ita.kata.implementation.vladislavshevhcuk.SevenImp() );

    @Test
    void newAvgSimle() {
        for (Seven impl : impl) {
            System.out.println("Checking for implementation: " + impl);
            long actual = impl.newAvg(new double[]{14, 30, 5, 7, 9, 11, 15}, 30);
            long expected = 149;
            assertEquals(expected, actual, String.format("Test %s failed!", impl));
            long actual1 = impl.newAvg(new double[]{14, 30, 5, 7, 9, 11, 15}, 92);
            long expected1 = 645;
        }
    }

    @Test
    void newAvgDouble() {
        for (Seven impl : impl) {
            System.out.println("Checking for implementation: " + impl);
            long actual3 = impl.newAvg(new double[]{14.0, 30.0, 5.0, 7.0, 9.0, 11.0, 16.0}, 90);
            long expected3 = 628;
            assertEquals(expected3, actual3, String.format("Test %s failed!", impl));
            long actual6 = impl.newAvg(new double[]{21.4, 354.2, 23.5, 23.6}, 341);
            long expected6 = 1282;
            assertEquals(expected6, actual6, String.format("Test %s failed!", impl));
        }
    }

    @Test
    void newAvgEmpty() {
        for (Seven impl : impl) {
            System.out.println("Checking for implementation: " + impl);
            long actual4 = impl.newAvg(new double[]{}, 90);
            long expected4 = 90;
            assertEquals(expected4, actual4, String.format("Test %s failed!", impl));
        }
    }

    @Test
    void newAvgZeros() {
        for (Seven impl : impl) {
            System.out.println("Checking for implementation: " + impl);
            long actual5 = impl.newAvg(new double[]{0, 0, 0, 0, 0}, 90);
            long expected5 = 540;
            assertEquals(expected5, actual5, String.format("Test %s failed!", impl));
        }
    }

    @Test
    void newAvgNegativeLess() {
        for (Seven impl : impl) {
            System.out.println("Checking for implementation: " + impl);

            Throwable exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
                impl.newAvg(new double[]{14, 30, 5, 7, 9, 11, 15}, 2);
            });
        }
    }

    @Test
    void newAvgNegativeArray() {
        for (Seven impl : impl) {
            System.out.println("Checking for implementation: " + impl);
            Throwable exception2 = Assertions.assertThrows(IllegalArgumentException.class, () -> {
                impl.newAvg(new double[]{-56, -6, -56, -64, -34, -56, -546}, 22);
            });
        }
    }

    @Test
    void newAvgNegativeAll() {
        for (Seven impl : impl) {
            System.out.println("Checking for implementation: " + impl);
            Throwable exception3 = Assertions.assertThrows(IllegalArgumentException.class, () -> {
                impl.newAvg(new double[]{-56, -6, -56, -64, -34, -56, -546}, -5464);
            });
        }
    }

    @Test
    void newAvgNegativeNewAvarage() {
        for (Seven impl : impl) {
            System.out.println("Checking for implementation: " + impl);
            Throwable exception4 = Assertions.assertThrows(IllegalArgumentException.class, () -> {
                impl.newAvg(new double[]{14, 30, 5, 7, 9, 11, 15}, -5666);
            });
        }
    }
}