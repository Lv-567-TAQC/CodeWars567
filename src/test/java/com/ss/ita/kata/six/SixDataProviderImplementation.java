package com.ss.ita.kata.six;

import com.ss.ita.kata.Six;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class SixDataProviderImplementation {

    @Parameterized.Parameters(name = "DataProviderSix {0}")
    public static Collection<Six> versionImplementation(){
        List<Six> sixImpl = Arrays.asList(
                new com.ss.ita.kata.implementation.andriikapustiak.SixImpl(),
                new com.ss.ita.kata.implementation.khrystiash.SixImplementation(),
                new com.ss.ita.kata.implementation.kuderiavetsnata.SixImpl(),
                new com.ss.ita.kata.implementation.nataliia0223.SixImpl(),
                new com.ss.ita.kata.implementation.Nnn7.SixImpl(),
                new com.ss.ita.kata.implementation.romankhvalbota.SixImpl(),
                new com.ss.ita.kata.implementation.vladislavshevhcuk.SixImp());
        return sixImpl;
    }
}
