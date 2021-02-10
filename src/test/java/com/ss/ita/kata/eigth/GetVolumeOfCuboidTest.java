package com.ss.ita.kata.eigth;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import com.ss.ita.kata.Eight;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class GetVolumeOfCuboidTest extends EightDataProviderImplementation {

    private final Eight implementation;

    public GetVolumeOfCuboidTest(final Eight implementation) {
        this.implementation = implementation;
    }

    @Test
    public void getVolumeOfCuboidDefaultTest() {
        System.out.println(String.format("Checking for implementation: %s", implementation));

        Assertions.assertEquals(4,implementation.getVolumeOfCuboid(1,2,2),
                String.format("Test %s failed!",implementation.getClass()));

        Assertions.assertEquals(63,implementation.getVolumeOfCuboid(6.3,2,5),
                String.format("Test %s failed!",implementation.getClass()));
    }

    @Test
    public void getVolumeOfCuboidNegativeDataTest(){
        System.out.println(String.format("Checking for implementation: %s", implementation));

        Assertions.assertEquals(-1,implementation.getVolumeOfCuboid(-1,4,2),
                String.format("Test %s failed!",implementation.getClass()));
        Assertions.assertEquals(-1,implementation.getVolumeOfCuboid(1,-2,7),
                String.format("Test %s failed!",implementation.getClass()));
        Assertions.assertEquals(-1,implementation.getVolumeOfCuboid(4,8,-2),
                String.format("Test %s failed!",implementation.getClass()));
    }

}