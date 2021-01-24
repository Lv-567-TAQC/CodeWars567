package com.ss.ita.kata;

public class FormattingDecimalPlaces implements Eight {
    @Override
    public static double TwoDecimalPlaces(double number)
    {
        return (double)Math.round(number * 100) / 100;
    }
}
