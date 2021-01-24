package com.ss.ita.kata;

public class MilesPerGallonToKilometersPerLiter  implements Eight{
    public static float mpgToKPM(final float mpg) {
        float kpl = (float)1.609344 / (float)4.54609188 * mpg;
        return kpl;
    }
}
