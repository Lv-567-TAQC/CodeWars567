package com.ss.ita.kata.eigth;

import com.ss.ita.kata.Eight;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(Parameterized.class)
public class KeepHydratedTest extends EightDataProviderImplementation{

    private final Eight implementation;

    public KeepHydratedTest(Eight implementation) {
        this.implementation = implementation;
    }

    @Test
    public void KeepHydratedTest1() {
        assertEquals(2,implementation.liters(5));

    }

    @Test
    public void KeepHydratedTest2() {
        assertEquals(0,implementation.liters(0));

    }

    @Test
    public void KeepHydratedTest3() {
        assertEquals(0,implementation.liters(-1));

    }
}
