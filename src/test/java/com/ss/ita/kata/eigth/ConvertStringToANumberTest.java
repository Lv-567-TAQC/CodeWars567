package com.ss.ita.kata.eigth;


import com.ss.ita.kata.Eight;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(Parameterized.class)
public class ConvertStringToANumberTest {

    private  final Eight implementation;

    @Parameterized.Parameters(name = "DataProvider {0}")
    public static Collection<Eight> versionImplementation(){
        List <Eight> eightImpl = Arrays.asList(
                new com.ss.ita.kata.implementation.andriikapustiak.EightImpl(),
                new com.ss.ita.kata.implementation.khrystiash.EightImplementation(),
                new com.ss.ita.kata.implementation.kuderiavetsnata.EightImpl(),
                new com.ss.ita.kata.implementation.nataliia0223.EightImpl(),
                new com.ss.ita.kata.implementation.Nnn7.EightImpl(),
                new com.ss.ita.kata.implementation.romankhvalbota.EightImpl(),
                new com.ss.ita.kata.implementation.vladislavshevhcuk.EightImp());
        return eightImpl;
    }

    public ConvertStringToANumberTest(Eight implementation){
        this.implementation = implementation;
    }

    @Test
    public void StringToANumberTest1() {
            int expected = -7;
            int actual = implementation.stringToNumber("-7");
            assertEquals(expected, actual);
    }

    @Test
    public void StringToANumberTest2() {
            int expected = 0;
            int actual = implementation.stringToNumber("0");
            assertEquals(expected, actual);
    }

    @Test
    public void StringToANumberTest3() {
            int expected = 1;
            int actual = implementation.stringToNumber("1");
            assertEquals(expected, actual);
    }

    @Test
    public void StringToANumberTest4() {
            int expected = 127;
            int actual = implementation.stringToNumber("127");
            assertEquals(expected, actual);
    }

    @Test
    public void StringToANumberTest5() {
            int expected = 2147483647;
            int actual = implementation.stringToNumber("2147483647");
            assertEquals(expected, actual);
    }

    @Test
    public void StringToANumberTest6() {
            int expected = -2147483648;
            int actual = implementation.stringToNumber("-2147483648");
            assertEquals(expected, actual);
    }

    //assertEquals(false, impl.stringToNumber("Seven"));??
}
