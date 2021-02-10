package com.ss.ita.kata.implementation.nataliia0223;

import com.ss.ita.kata.Six;

public class SixImpl implements Six {

    @Override
    public long findNb(long m) {
        long n = 1;
        long volume = 0;
        while (volume < m) {
            volume += n * n * n;
            n++;
        }
        if (volume == m) {
            return n - 1;
        }else{
            return -1;
        }
    }

    @Override
    public String balance(String book) {
        return null;
    }

    @Override
    public double f(double x) {
        return x / (Math.sqrt(x + 1) + 1);
    }

    @Override
    public double mean(String town, String strng) {
        if (town == null || town.length() == 0 || strng == null || strng.length() == 0) return -1;
        final String s = town + ":";
        final String[] a = strng.split("\n");
        String[] str1 = null;
        int l;
        double sum = 0;

        for (String str : a) {
            if (str.startsWith(s)) {
                str1 = str.split(":")[1].split(",");
                break;
            }
        }
        if (str1 == null || str1.length == 0) return -1;

        l = str1.length;
        for (int i = 0; i < l; i++) {
            sum += Double.parseDouble(str1[i].split(" ")[1]);
        }

        return sum / l;
    }

    @Override
    public double variance(String town, String strng) {
        if (town == null || town.length() == 0 || strng == null || strng.length() == 0) return -1;
        final String s = town + ":";
        final String[] a = strng.split("\n");
        String[] str1 = null;
        double[] vals;
        int l;
        double temp;
        double sum = 0;

        for (String str : a) {
            if (str.startsWith(s)) {
                str1 = str.split(":")[1].split(",");
                break;
            }
        }
        if (str1 == null || str1.length == 0) return -1;

        l = str1.length;
        vals = new double[l];
        for (int i = 0; i < l; i++) {
            vals[i] = temp = Double.parseDouble(str1[i].split(" ")[1]);
            sum += temp;
        }

        temp = sum / l;
        sum = 0;
        for (int i = 0; i < l; i++) {
            sum += Math.pow(vals[i] - temp, 2);
        }
        temp = Math.sqrt(sum / l);

        return temp * temp;
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        return null;
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        String result = "";
        String letter = "";
        for (int i = 0; i < lstOf1stLetter.length; i++) {
            int sum = 0;
            for (int j = 0; j < lstOfArt.length; j++) {
                if (lstOfArt[j].charAt(0) == lstOf1stLetter[i].charAt(0)) {
                    sum += Integer.valueOf(lstOfArt[j].substring(5));
                    letter = lstOf1stLetter[i];
                }
            }
            result += "(" + letter + " : " + sum + ")";
        }
        return result;
    }

}
