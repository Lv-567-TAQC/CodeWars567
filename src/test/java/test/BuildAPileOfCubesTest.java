package test;

import static org.junit.Assert.*;
import com.ss.ita.kata.Six;
import org.junit.Test;
import java.util.*;

public class BuildAPileOfCubesTest {
    List <Six> sixImpl = Arrays.asList(
            new com.ss.ita.kata.implementation.andriikapustiak.SixImpl(),
            new com.ss.ita.kata.implementation.khrystiash.SixImplementation(),
            new com.ss.ita.kata.implementation.kuderiavetsnata.SixImpl(),
            new com.ss.ita.kata.implementation.nataliia0223.SixImpl(),
            new com.ss.ita.kata.implementation.Nnn7.SixImpl(),
            new com.ss.ita.kata.implementation.romankhvalbota.SixImpl(),
            new com.ss.ita.kata.implementation.vladislavshevhcuk.SixImp());

    @Test
    public void buildAPileOfCubesTest1() {
        for(Six impl: sixImpl) {
            assertEquals(2022, impl.findNb(4183059834009L));
            assertEquals(4824, impl.findNb(135440716410000L));
        }
    }

    @Test
    public void buildAPileOfCubesTest2() {
        for(Six impl: sixImpl) {
            assertEquals(-1, impl.findNb(24723578342962L));
        }
    }
}
