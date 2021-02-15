package com.ss.ita.kata.five;

import com.ss.ita.kata.Five;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(Parameterized.class)
public class PerimeterOfSquares {

    public final Five implementation;

    public PerimeterOfSquares(Five implementation){
        this.implementation = implementation;
    }

    @Test
    public void PerimeterOfSquares1(){
        BigInteger numb = BigInteger.valueOf(30);
        assertEquals("14098308", implementation.perimeter(numb).toString());
    }

}
