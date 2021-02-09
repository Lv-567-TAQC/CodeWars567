package com.ss.ita.andriikapustiak_test;

import com.ss.ita.kata.Five;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArtificialRain_Test {
     List<Five> implementations = Arrays.asList(
            new com.ss.ita.kata.implementation.Nnn7.FiveImpl(),
            new com.ss.ita.kata.implementation.andriikapustiak.FiveImpl(),
            new com.ss.ita.kata.implementation.khrystiash.FiveImplementation(),
//            new com.ss.ita.kata.implementation.kuderiavetsnata.FiveImpl(),
            new com.ss.ita.kata.implementation.nataliia0223.FiveImpl(),
//            new com.ss.ita.kata.implementation.romankhvalbota.FiveImpl(),
            new com.ss.ita.kata.implementation.vladislavshevhcuk.FiveImp() );



    @Test
    public void regularTest() {
        for(Five implementation: implementations) {
            System.out.println(String.format("Checking for implementation: %s", implementation));
            assertEquals(1, implementation.artificialRain(new int[]{2}));
            String.format("Test %s failed!",implementation.getClass());

            assertEquals(3, implementation.artificialRain(new int[]{1,2,1,2,1}));
            String.format("Test %s failed!",implementation.getClass());

            assertEquals(4, implementation.artificialRain(new int[]{4,2,3,3,2}));
            String.format("Test %s failed!",implementation.getClass());
}}}