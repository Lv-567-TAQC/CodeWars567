package com.ss.ita.test;

import com.ss.ita.kata.Eight;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DivisibleBy {

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
    void DivisibleByDefaultTest(){
        for(Eight implementation: implementations){
            System.out.println(String.format("Checking for implementation: %s", implementation));

            assertArrayEquals(new int[] {2,4,6}, implementation.divisibleBy(new int[] {1,2,3,4,5,6},2),
                    String.format("Test %s failed!",implementation.getClass()));

            assertArrayEquals(new int[] {3,6}, implementation.divisibleBy(new int[] {1,2,3,4,5,6},3),
                    String.format("Test %s failed!",implementation.getClass()));

            assertArrayEquals(new int[] {0,4}, implementation.divisibleBy(new int[] {0,1,2,3,4,5,6},4),
                    String.format("Test %s failed!",implementation.getClass()));

            assertArrayEquals(new int[] {0,-5}, implementation.divisibleBy(new int[] {0,1,-2,3,4,-5,-6},5),
                    String.format("Test %s failed!",implementation.getClass()));
        }
    }

    @Test
    void divisibleByZeroTest() throws ArithmeticException{
        for(Eight implementation: implementations){
            System.out.println(String.format("Checking for implementation: %s", implementation));

            Throwable exception = assertThrows(ArithmeticException.class, ()->{
                implementation.divisibleBy(new int[] {0,1,2,3,4,5,6},0);
            });
        }
    }
}