package com.ss.ita.kata.eigth;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.ss.ita.kata.Eight;

import java.util.Arrays;
import java.util.List;

class GetVolumeOfCuboidTest {

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
    void getVolumeOfCuboidDefaultTest() {
        for(Eight implementation: implementations){
            System.out.println(String.format("Checking for implementation: %s", implementation));

            Assertions.assertEquals(4,implementation.getVolumeOfCuboid(1,2,2),
                    String.format("Test %s failed!",implementation.getClass()));

            Assertions.assertEquals(63,implementation.getVolumeOfCuboid(6.3,2,5),
                    String.format("Test %s failed!",implementation.getClass()));
        }
    }

    @Test
    void getVolumeOfCuboidNegativeDataTest(){
        for(Eight implementation: implementations){
            System.out.println(String.format("Checking for implementation: %s", implementation));

            Assertions.assertEquals(-1,implementation.getVolumeOfCuboid(-1,4,2),
                    String.format("Test %s failed!",implementation.getClass()));

            Assertions.assertEquals(-1,implementation.getVolumeOfCuboid(1,-2,7),
                    String.format("Test %s failed!",implementation.getClass()));

            Assertions.assertEquals(-1,implementation.getVolumeOfCuboid(4,8,-2),
                    String.format("Test %s failed!",implementation.getClass()));
        }
    }

}