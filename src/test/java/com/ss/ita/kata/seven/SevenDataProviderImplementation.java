package com.ss.ita.kata.seven;

import com.ss.ita.kata.Seven;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class SevenDataProviderImplementation {

    @Parameterized.Parameters(name = "DataProviderSeven {0}")
    public static Collection<Seven> versionImplementation(){
        List<Seven> sevenImpl = Arrays.asList(
                new com.ss.ita.kata.implementation.andriikapustiak.SevenImpl(),
                new com.ss.ita.kata.implementation.khrystiash.SevenImplementation(),
                new com.ss.ita.kata.implementation.kuderiavetsnata.SevenImpl(),
                new com.ss.ita.kata.implementation.nataliia0223.SevenImpl(),
                new com.ss.ita.kata.implementation.Nnn7.SevenImpl(),
                new com.ss.ita.kata.implementation.romankhvalbota.SevenImpl(),
                new com.ss.ita.kata.implementation.vladislavshevhcuk.SevenImp());
        return sevenImpl;
    }
}
