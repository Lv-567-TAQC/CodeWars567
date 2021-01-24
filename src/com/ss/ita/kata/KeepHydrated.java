package com.ss.ita.kata;

public class KeepHydrated implements Eight {
    @Override
    public  int liters(double time){
        int liters = (int) time / 2;
        return liters;
    }
}