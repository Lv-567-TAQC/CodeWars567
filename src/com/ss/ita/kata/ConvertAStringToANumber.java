package com.ss.ita.kata;

public class ConvertAStringToANumber implements Eight{
    @Override
    public static int stringToNumber(String str) {
        return Integer.parseInt(str);
    }
}
