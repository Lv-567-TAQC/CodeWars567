package com.ss.ita.kata.five;

import com.ss.ita.kata.Five;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class FiveDataProviderImplementation {

    @Parameterized.Parameters(name = "DataProviderFive {0}")
    public static Collection<Five> versionImplementation(){
        List<Five> fiveImpl = Arrays.asList(
                new com.ss.ita.kata.implementation.andriikapustiak.FiveImpl(),
                new com.ss.ita.kata.implementation.khrystiash.FiveImplementation(),
                new com.ss.ita.kata.implementation.kuderiavetsnata.FiveImpl(),
                new com.ss.ita.kata.implementation.nataliia0223.FiveImpl(),
                new com.ss.ita.kata.implementation.Nnn7.FiveImpl(),
                new com.ss.ita.kata.implementation.romankhvalbota.FiveImpl(),
                new com.ss.ita.kata.implementation.vladislavshevhcuk.FiveImp());
        return fiveImpl;
    }


}
