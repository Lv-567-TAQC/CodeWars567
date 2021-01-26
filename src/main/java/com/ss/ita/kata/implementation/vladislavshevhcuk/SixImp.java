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

    public static double[] getRainfallRecords(String town,String strng){
        String[] townsResult = strng.split("\n");
        double[] rainNumbers = new double[12];
        for(String townResult : townsResult){
            if(townResult.substring(0,townResult.indexOf(":")).equals(town)){
                String[] months = townResult.split("[:, ]");
                double average = 0;
                double averageSqr = 0;
                int count = 0;
                for(int i=2;i<months.length;i+=2,count++){
                    rainNumbers[count]=Double.parseDouble(months[i]);
                }
                return rainNumbers;
            }
        }
        return null;
    }

    @Override
    public double mean(String town, String strng) {
        double[] rainNumbers = getRainfallRecords(town,strng);
        if(rainNumbers==null) return -1;
        double average = 0;
        for(double rainNumber : rainNumbers){
            average+=rainNumber;
        }
        return average/12;
    }

    @Override
    public double variance(String town, String strng) {
        double[] rainNumbers = getRainfallRecords(town,strng);
        if(rainNumbers==null) return -1;
        double average = 0;
        double averageSqr = 0;
        for(double rainNumber : rainNumbers){
            average+=rainNumber;
            averageSqr+=rainNumber*rainNumber;
        }
        return averageSqr/12-Math.pow(average/12,2);
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
