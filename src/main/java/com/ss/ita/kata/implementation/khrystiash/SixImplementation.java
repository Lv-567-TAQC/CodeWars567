package com.ss.ita.kata.implementation.khrystiash;

import com.ss.ita.kata.Six;

public class SixImplementation implements Six {
    @Override
    public long findNb(long m) {
        long n = 0;
        for (int i = 1; m >= 0;i++){
            m=m-(long) Math.pow(i,3);
            n=i;
        }
        return n-1;
    }

    @Override
    public String balance(String book) {
        return null;
    }

    @Override
    public double f(double x) {
        return 0;
    }

    @Override
    public double mean(String town, String strng) {
        String[] data;
        Double sum = 0.0;
        if (town == ""){
            return -1;
        }
        data = strng.split("\n");
        for (int i=0; i<data.length;i++){
            if(town.equals(data[i].substring(0,town.length()))){
                strng = data[i].substring(town.length()+1);
                break;
            }
        }
        data = strng.split(",");
        String[] values = new String[data.length];
        for (int i=0;i<data.length;i++){
            values[i]=data[i].substring(4);
        }
        Double[] numbs = new Double[values.length];
        for (int i=0; i< values.length;i++){
            numbs[i]=Double.parseDouble(values[i]);
            sum+=numbs[i];
        }
        sum = sum/12;
        return sum;
    }

    @Override
    public double variance(String town, String strng) {
        String[] data;
        Double sum = 0.0;
        if (town == ""){
            return -1;
        }
        data = strng.split("\n");
        for (int i=0; i<data.length;i++){
            if(town.equals(data[i].substring(0,town.length()))){
                strng = data[i].substring(town.length()+1);
                break;
            }
        }
        data = strng.split(",");
        String[] values = new String[data.length];
        for (int i=0;i<data.length;i++){
            values[i]=data[i].substring(4);
        }
        Double[] numbs = new Double[values.length];
        for (int i=0; i< values.length;i++){
            numbs[i]=Double.parseDouble(values[i]);
            sum+=numbs[i];
        }
        sum/=12;
        double result = 0;
        for (int i=0; i< numbs.length;i++){
            numbs[i]=Math.pow((sum - numbs[i]),2);
            result += numbs[i];
        }
        result/=12;
        return result;
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        return null;
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        String result = "";
        Integer sum = 0;
        String bukva = "";
        for (int j = 0; j < lstOf1stLetter.length; j++){
            for (int i = 0; i < lstOfArt.length; i++){
                if(lstOfArt[i].charAt(0) == lstOf1stLetter[j].charAt(0)){
                    sum += Integer.valueOf(lstOfArt[i].substring(6));
                    bukva = lstOf1stLetter[j];
                }
            }
            result += "(" + bukva + " : " + sum + ") ";
            sum = 0;
        }
        return result;
    }
}
