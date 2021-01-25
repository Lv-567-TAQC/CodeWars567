package com.ss.ita.implementation_andriikapustiak;

public class MpgToKpl {
    public static void main(String[] args) {
    }

    public static float mpgToKPM(final float mpg) {

        float gallon = 4.54609188f;
        float mile = 1.609344f;

        return (float)Math.round(mpg * mile / gallon * 100) / 100;

    }
}
