package com.ss.ita.andriikapustiak_tests;

import com.ss.ita.kata.Eight;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CountPositivesSumNegatives_Test {
    List<Eight> implementations = Arrays.asList(
            new com.ss.ita.kata.implementation.Nnn7.EightImpl(),
            new com.ss.ita.kata.implementation.andriikapustiak.EightImpl(),
            new com.ss.ita.kata.implementation.khrystiash.EightImplementation(),
            new com.ss.ita.kata.implementation.kuderiavetsnata.EightImpl(),
            new com.ss.ita.kata.implementation.nataliia0223.EightImpl(),
            new com.ss.ita.kata.implementation.romankhvalbota.EightImpl(),
            new com.ss.ita.kata.implementation.vladislavshevhcuk.EightImp()
    );

    @Test
    void countPositivesSumNegatives_SimpleTest() {
        for(Eight implementation: implementations) {
            System.out.println(String.format("Checking for implementation: %s", implementation));


            assertArrayEquals(new int[] {10, -65}, implementation.countPositivesSumNegatives(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15}));
            String.format("Test %s failed!",implementation.getClass());

            assertArrayEquals(new int[] {8, -50}, implementation.countPositivesSumNegatives(new int[] {0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14}));
            String.format("Test %s failed!",implementation.getClass());
        }}}