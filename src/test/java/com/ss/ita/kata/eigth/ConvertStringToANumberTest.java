package com.ss.ita.kata.eigth;


import com.ss.ita.kata.Eight;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(Parameterized.class)
public class ConvertStringToANumberTest extends com.ss.ita.kata.eigth.EightDataProviderImplementation {

    private final Eight implementation;

    public ConvertStringToANumberTest(final Eight implementation) {
        this.implementation = implementation;
    }

    @Test
    public void StringToANumberTest1() {
        System.out.println("Checking for implementation: " + implementation);
        int expected = -7;
        int actual = implementation.stringToNumber("-7");
        assertEquals(expected, actual);
    }

    @Test
    public void StringToANumberTest2() {
        System.out.println("Checking for implementation: " + implementation);
        int expected = 0;
        int actual = implementation.stringToNumber("0");
        assertEquals(expected, actual);
    }

    @Test
    public void StringToANumberTest3() {
        System.out.println("Checking for implementation: " + implementation);
        int expected = 1;
        int actual = implementation.stringToNumber("1");
        assertEquals(expected, actual);
    }

    @Test
    public void StringToANumberTest4() {
        System.out.println("Checking for implementation: " + implementation);
        int expected = 127;
        int actual = implementation.stringToNumber("127");
        assertEquals(expected, actual);
    }

    @Test
    public void StringToANumberTest5() {
        System.out.println("Checking for implementation: " + implementation);
        int expected = 2147483647;
        int actual = implementation.stringToNumber("2147483647");
        assertEquals(expected, actual);
    }

    @Test
    public void StringToANumberTest6() {
        System.out.println("Checking for implementation: " + implementation);
        int expected = -2147483648;
        int actual = implementation.stringToNumber("-2147483648");
        assertEquals(expected, actual);
    }

    //assertEquals(false, impl.stringToNumber("Seven"));??
}
