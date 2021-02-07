package test;


import com.ss.ita.kata.Five;
import org.junit.Test;

import java.util.*;


import static org.junit.Assert.*;

public class FiveImplTest {
    List<Five> impl = Arrays.asList(
            new com.ss.ita.kata.implementation.Nnn7.FiveImpl(),
            new com.ss.ita.kata.implementation.andriikapustiak.FiveImpl(),
            new com.ss.ita.kata.implementation.khrystiash.FiveImplementation(),
            //new com.ss.ita.kata.implementation.kuderiavetsnata.Five(),
            new com.ss.ita.kata.implementation.nataliia0223.FiveImpl(),
            //new com.ss.ita.kata.implementation.romankhvalbota.Five(),
            new com.ss.ita.kata.implementation.vladislavshevhcuk.FiveImp() );

    @Test
    public void testZeros1() {
        for(Five impl: impl) {
            int actual = impl.zeros(0);
            int expected = 0;
            assertEquals(actual, expected);
        }
    }

    @Test
    public void testZeros2() {
        for(Five impl: impl) {
            int actual = impl.zeros(6);
            int expected = 1;
            assertEquals(actual, expected);
        }
    }

    @Test
    public void testZeros3() {
        for(Five impl: impl) {
            int actual = impl.zeros(14);
            int expected = 2;
            assertEquals(actual, expected);
        }
    }
}