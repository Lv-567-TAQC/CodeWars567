package com.ss.ita.kata;

public class SeriesSum implements Seven{
    @Override
    public String seriesSum(int n) {
        double sum = 0.0;

        for (int i = 0; i < n; i++){
            sum += 1.0 / (1 + 3 * i);
        }
        return String.format("%.2f", sum);
    }
}
