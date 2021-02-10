package com.ss.ita.kata.five;

import static org.junit.Assert.*;
import com.ss.ita.kata.Five;
import org.junit.Test;
import java.util.*;

public class GapInPrimesTest {
    List <Five> fiveImpl = Arrays.asList(
            new com.ss.ita.kata.implementation.andriikapustiak.FiveImpl(),
            new com.ss.ita.kata.implementation.khrystiash.FiveImplementation(),
            new com.ss.ita.kata.implementation.kuderiavetsnata.FiveImpl(),
            new com.ss.ita.kata.implementation.nataliia0223.FiveImpl(),
            new com.ss.ita.kata.implementation.Nnn7.FiveImpl(),
            new com.ss.ita.kata.implementation.romankhvalbota.FiveImpl(),
            new com.ss.ita.kata.implementation.vladislavshevhcuk.FiveImp());

    @Test
    public void gapInPrimesTest1(){
        for (Five impl: fiveImpl){
            System.out.println(impl);
            assertEquals("[103, 107]", Arrays.toString(impl.gap(4,100,110)));
            assertEquals("[337, 347]", Arrays.toString(impl.gap(10,300,400)));
        }
    }

    @Test
    public void gapInPrimesTest2(){
        for (Five impl: fiveImpl){
            assertEquals(null, impl.gap(6,100,110));
        }
    }
}
