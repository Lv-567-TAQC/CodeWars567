package com.ss.ita.andriikapustiak_test;

import com.ss.ita.kata.Seven;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WhereIsVasya_Test {
    List<Seven> implementations = Arrays.asList(
            new com.ss.ita.kata.implementation.Nnn7.SevenImpl(),
            new com.ss.ita.kata.implementation.andriikapustiak.SevenImpl(),
            new com.ss.ita.kata.implementation.khrystiash.SevenImplementation(),
            new com.ss.ita.kata.implementation.kuderiavetsnata.SevenImpl(),
            new com.ss.ita.kata.implementation.nataliia0223.SevenImpl(),
            new com.ss.ita.kata.implementation.romankhvalbota.SevenImpl(),
            new com.ss.ita.kata.implementation.vladislavshevhcuk.SevenImp()
    );

    @Test
    void whereIsHe_RegularTest() {
        for(Seven implementation : implementations){
            System.out.println(String.format("Checking for implementation: %s", implementation));

            assertEquals(2, implementation.whereIsHe(3, 1, 1));
            String.format("Test %s failed!",implementation.getClass());

            assertEquals(3, implementation.whereIsHe(5, 2, 3));
            String.format("Test %s failed!",implementation.getClass());
        }
    }
}