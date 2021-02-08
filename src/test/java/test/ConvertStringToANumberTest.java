package test;

import static org.junit.Assert.*;
import com.ss.ita.kata.Eight;
import org.junit.Test;
import java.util.*;

public class ConvertStringToANumberTest {
    List <Eight> eightImpl = Arrays.asList(
            new com.ss.ita.kata.implementation.andriikapustiak.EightImpl(),
            new com.ss.ita.kata.implementation.khrystiash.EightImplementation(),
            new com.ss.ita.kata.implementation.kuderiavetsnata.EightImpl(),
            new com.ss.ita.kata.implementation.nataliia0223.EightImpl(),
            new com.ss.ita.kata.implementation.Nnn7.EightImpl(),
            new com.ss.ita.kata.implementation.romankhvalbota.EightImpl(),
            new com.ss.ita.kata.implementation.vladislavshevhcuk.EightImp());

    @Test
    public void StringToANumberTest1() {
        for (Eight impl : eightImpl) {
            int expected = -7;
            int actual = impl.stringToNumber("-7");
            assertEquals(expected, actual);
        }
    }

    @Test
    public void StringToANumberTest2() {
        for (Eight impl : eightImpl) {
            int expected = 0;
            int actual = impl.stringToNumber("0");
            assertEquals(expected, actual);
        }
    }

    @Test
    public void StringToANumberTest3() {
        for (Eight impl : eightImpl) {
            int expected = 1;
            int actual = impl.stringToNumber("1");
            assertEquals(expected, actual);
        }
    }

    @Test
    public void StringToANumberTest4() {
        for (Eight impl : eightImpl) {
            int expected = 127;
            int actual = impl.stringToNumber("127");
            assertEquals(expected, actual);
        }
    }

    @Test
    public void StringToANumberTest5() {
        for (Eight impl : eightImpl) {
            int expected = 2147483647;
            int actual = impl.stringToNumber("2147483647");
            assertEquals(expected, actual);
        }
    }

    @Test
    public void StringToANumberTest6() {
        for (Eight impl : eightImpl) {
            int expected = -2147483648;
            int actual = impl.stringToNumber("-2147483648");
            assertEquals(expected, actual);
        }
    }

    //assertEquals(false, impl.stringToNumber("Seven"));//??
}
