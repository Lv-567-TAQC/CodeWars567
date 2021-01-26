package com.ss.ita.kata;

public class FormattingDecimalPlaces implements Eight{
    @Override
    public double twoDecimalPlaces(double number) {
        double result;
        result = Math.round(number * 100.0) / 100.0;
        return result;
    }
}
