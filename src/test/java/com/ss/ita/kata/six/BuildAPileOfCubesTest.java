package com.ss.ita.kata.six;

import static org.junit.Assert.*;
import com.ss.ita.kata.Six;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.*;

@RunWith(Parameterized.class)
public class BuildAPileOfCubesTest extends SixDataProviderImplementation{
    private final Six implementation;

    public BuildAPileOfCubesTest(final Six implementation){this.implementation = implementation;}

    @Test
    public void buildAPileOfCubesTest1() {
            assertEquals(4824, implementation.findNb(135440716410000L));
        }

    @Test
    public void buildAPileOfCubesTest2() {
            assertEquals(-1, implementation.findNb(24723578342962L));
        }
}
