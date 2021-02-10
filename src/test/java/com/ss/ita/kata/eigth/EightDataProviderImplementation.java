package com.ss.ita.kata.eigth;

import com.ss.ita.kata.Eight;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class EightDataProviderImplementation {

    @Parameterized.Parameters(name = "DataProvider {0}")
    public static Collection<Eight> versionImplementation(){
        List<Eight> eightImpl = Arrays.asList(
                new com.ss.ita.kata.implementation.andriikapustiak.EightImpl(),
                new com.ss.ita.kata.implementation.khrystiash.EightImplementation(),
                new com.ss.ita.kata.implementation.kuderiavetsnata.EightImpl(),
                new com.ss.ita.kata.implementation.nataliia0223.EightImpl(),
                new com.ss.ita.kata.implementation.Nnn7.EightImpl(),
                new com.ss.ita.kata.implementation.romankhvalbota.EightImpl(),
                new com.ss.ita.kata.implementation.vladislavshevhcuk.EightImp());
        return eightImpl;
    }


}
