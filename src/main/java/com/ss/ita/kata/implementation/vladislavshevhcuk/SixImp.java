package com.ss.ita.kata.implementation.vladislavshevhcuk;

import com.ss.ita.kata.Six;

public class SixImp implements Six {
    @Override
    public long findNb(long m) {
        long n = 1;
        long answer = 0;
        while (answer < m) {
            answer += n * n * n;
            n++;
        }
        return answer == m ? n - 1 : -1;
    }

    @Override
    public String balance(String book) {
        String t = book.replaceAll("([^\\n. \\da-zA-Z])", "");
        String[] pages = t.split("\n");

        double current = Double.parseDouble(pages[0]);
        double amount = 0;
        double count = 1;
        StringBuilder result = new StringBuilder();
        String str = String.format("Original Balance: %.2f", current);
        result.append(str);
        for(int i=1;i<pages.length;i++){
            String[] item = pages[i].split("[ ]+");
            current -= Double.parseDouble(item[2]);
            amount += Double.parseDouble(item[2]);
            String element = String.format("\\r\\n%s %s %s Balance %.2f", item[0],item[1],item[2],current);
            result.append(element);
            count++;
        }
        result.append(String.format("\\r\\nTotal expense  %.2f\\r\\nAverage expense  %.2f",amount,amount/(count-1)));
        return result.toString();
    }

    @Override
    public double f(double x) {
        return 0;
    }

    @Override
    public double mean(String town, String strng) {
        return 0;
    }

    @Override
    public double variance(String town, String strng) {
        return 0;
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        return null;
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        return null;
    }
}
