package com.ss.ita.implementation_andriikapustiak;

public class Hydrated {

    static final double WATER_PER_HOUR = 0.5;

    static void calcWater(int hours) {
        int water = (int) (hours * WATER_PER_HOUR);
        System.out.println(water);
    }

    public static void main(String[] args) {
        calcWater(3);
        calcWater(6);
        calcWater(7);
    }
}


