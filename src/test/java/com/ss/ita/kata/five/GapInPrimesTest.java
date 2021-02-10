package com.ss.ita.kata.five;

import com.ss.ita.kata.Five;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class GapInPrimesTest extends com.ss.ita.kata.five.FiveDataProviderImplementation {
    public final Five implementation;

    public GapInPrimesTest(final Five implementation){this.implementation = implementation;}

    @Test
    public void gapInPrimesTest1(){
            //System.out.println(implementation);
            assertEquals("[103, 107]", Arrays.toString(implementation.gap(4,100,110)));
        }

    @Test
    public void gapInPrimesTest2(){
            assertEquals(null, implementation.gap(6,100,110));
        }
}
