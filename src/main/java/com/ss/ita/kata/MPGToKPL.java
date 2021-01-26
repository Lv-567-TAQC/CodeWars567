package com.ss.ita.kata;

public class MPGToKPL implements Eight{
    @Override
    public float mpgToKPM(float mpg) {
        float kpl = (float) (mpg* (1.609344 / 4.54609188));
        kpl = (float) (Math.round(kpl * 100.0) / 100.0);
        return kpl;
    }
}
