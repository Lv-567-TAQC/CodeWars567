package com.ss.ita.kata.five;

import com.ss.ita.kata.Eight;
import com.ss.ita.kata.Five;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Which_x_for_that_sum {

    List<Five> implementations = Arrays.asList(
            new com.ss.ita.kata.implementation.Nnn7.FiveImpl(),
            new com.ss.ita.kata.implementation.andriikapustiak.FiveImpl(),
            new com.ss.ita.kata.implementation.khrystiash.FiveImplementation(),
            //new com.ss.ita.kata.implementation.kuderiavetsnata.FiveImpl(),
            new com.ss.ita.kata.implementation.nataliia0223.FiveImpl(),
            new com.ss.ita.kata.implementation.romankhvalbota.FiveImpl(),
            new com.ss.ita.kata.implementation.vladislavshevhcuk.FiveImp()
    );

    @Test
    void solveSumDefaultTest() {

        for(Five implementation: implementations){
            System.out.println(String.format("Checking for implementation: %s", implementation));

            Assertions.assertEquals(0.5,implementation.solveSum(2.0),1e-12,
                    String.format("Test %s failed!",implementation.getClass()));
            Assertions.assertEquals(0.7034648345913732,implementation.solveSum(8.0),1e-12,
                    String.format("Test %s failed!",implementation.getClass()));
            Assertions.assertEquals(6.096117967978e-01,implementation.solveSum(4.0),1e-12,
                    String.format("Test %s failed!",implementation.getClass()));
        }


    }

    @Test
    void solveSumZeroTest() {
        for(Five implementation: implementations) {
            System.out.println(String.format("Checking for implementation: %s", implementation));

            boolean isNan = Double.isNaN(implementation.solveSum(0.0));
            Assertions.assertTrue(isNan);
        }
    }

    @Test
    void solveSumLessThanZeroTest() {
        for(Five implementation: implementations) {
            System.out.println(String.format("Checking for implementation: %s", implementation));

            boolean isNan = Double.isNaN(implementation.solveSum(-1.2));
            Assertions.assertTrue(isNan);
        }
    }
}