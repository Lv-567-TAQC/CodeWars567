package com.ss.ita.kata.eigth;

import com.ss.ita.kata.Eight;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class DivisibleByTest extends EightDataProviderImplementation {

    private final Eight implementation;

    public DivisibleByTest(final Eight implementation) {
        this.implementation = implementation;
    }

    @Test
    public void DivisibleByDefaultTest(){
        System.out.println(String.format("Checking for implementation: %s", implementation));

        Assertions.assertArrayEquals(new int[] {2,4,6}, implementation.divisibleBy(new int[] {1,2,3,4,5,6},2),
                String.format("Test %s failed!",implementation.getClass()));
        Assertions.assertArrayEquals(new int[] {3,6}, implementation.divisibleBy(new int[] {1,2,3,4,5,6},3),
                String.format("Test %s failed!",implementation.getClass()));
        Assertions.assertArrayEquals(new int[] {0,4}, implementation.divisibleBy(new int[] {0,1,2,3,4,5,6},4),
                String.format("Test %s failed!",implementation.getClass()));
        Assertions.assertArrayEquals(new int[] {0,-5}, implementation.divisibleBy(new int[] {0,1,-2,3,4,-5,-6},5),
                String.format("Test %s failed!",implementation.getClass()));
    }

    @Test
    public void divisibleByZeroTest() throws ArithmeticException{
        System.out.println(String.format("Checking for implementation: %s", implementation));

        Throwable exception = Assertions.assertThrows(ArithmeticException.class, ()->{
            implementation.divisibleBy(new int[] {0,1,2,3,4,5,6},0);
        });
    }
}