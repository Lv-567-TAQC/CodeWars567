package com.ss.ita.kata;

public class WhereIsVasya implements Seven {

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return Math.min(p-bef,aft+1);
    }
}
