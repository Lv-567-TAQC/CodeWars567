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
        String s = book.replaceAll("([^\\n. \\da-zA-Z])", "");
        String[] arr = s.split("[\\n]+");
        double current = Double.parseDouble(arr[0]);
        double total = 0;
        int count = 0;
        StringBuilder result = new StringBuilder();
        result.append("Original Balance: ").append(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            count++;
            String[] line = arr[i].split("[ ]+");
            current -= Double.parseDouble(line[2]);
            total += Double.parseDouble(line[2]);
            String res = String.format("\\r\\n%s %s %s Balance %.2f", line[0], line[1], line[2], current);
            result.append(res);
        }

        result.append(String.format("\\r\\nTotal expense  %.2f\\r\\nAverage expense  %.2f", total, total / count));
        return result.toString();
    }

    @Override
    public double f(double x) {
        return 0;
    }

    @Override
    public double mean(String town, String strng) {
        String[] arrayStrng;
        Double result = 0.0;
        if (town == ""){
            return -1;
        }
        arrayStrng = strng.split("\n");
        for (int i = 0; i < arrayStrng.length;i++){
            if(town.equals(arrayStrng[i].substring(0,town.length()))){
                strng = arrayStrng[i].substring(town.length()+1);
                break;
            }
        }
        arrayStrng = strng.split(" ");
        Double[] numbs = new Double[arrayStrng.length];
        for (int i=0; i< arrayStrng.length;i++){
            numbs[i]=Double.parseDouble(arrayStrng[i]);
            result+=numbs[i];
        }
        result = result/12;
        return result;
    }

    @Override
    public double variance(String town, String strng) {
        String[] arrayStrng;
        if (town == ""){
            return -1;
        }
        arrayStrng = strng.split("\n");
        for (int i=0; i<arrayStrng.length;i++){
            if(town.equals(arrayStrng[i].substring(0,town.length()))){
                strng = arrayStrng[i].substring(town.length()+1);
                break;
            }
        }
        arrayStrng = strng.split(" ");
        Double[] numbs = new Double[arrayStrng.length];
        Double sum = 0.0;
        for (int i=0; i< arrayStrng.length;i++){
            numbs[i]=Double.parseDouble(arrayStrng[i]);
            sum+=numbs[i];
        }
        sum = sum/12;
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
