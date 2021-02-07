package com.ss.ita.kata.implementation.romankhvalbota;

import com.ss.ita.kata.Six;

public class SixImpl implements Six {
    @Override
    public long findNb(long m) {
        long num = 0;
        long sum = 0;
        while(num < m){
            sum = sum + 1;
            num += sum * sum * sum;
        }
        if(num == m){
            return sum;
        }
        return -1;
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
        return x / (Math.sqrt(1 + x) + 1);

    }

    @Override
    public double mean(String town, String strng) {
        if (town == null || town.length() == 0 || strng == null || strng.length() == 0) return -1;
        final String s = town + ":";
        final String[] a = strng.split("\n");
        String[] recs = null;
        int l;
        double sum = 0;

        for (String str : a) {
            if (str.startsWith(s)) {
                recs = str.split(":")[1].split(",");
                break;
            }
        }
        if (recs == null || recs.length == 0) return -1;

        l = recs.length;
        for (int i = 0; i < l; i++) {
            sum += Double.parseDouble(recs[i].split(" ")[1]);
        }

        return sum / l;
    }

    @Override
    public double variance(String town, String strng) {
        if (town == null || town.length() == 0 || strng == null || strng.length() == 0) return -1;
        final String s = town + ":";
        final String[] a = strng.split("\n");
        String[] recs = null;
        double[] vals = null;
        int l;
        double temp;
        double sum = 0;

        for (String str : a) {
            if (str.startsWith(s)) {
                recs = str.split(":")[1].split(",");
                break;
            }
        }
        if (recs == null || recs.length == 0) return -1;

        l = recs.length;
        vals = new double[l];
        for (int i = 0; i < l; i++) {
            vals[i] = temp = Double.parseDouble(recs[i].split(" ")[1]);
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
        int w = 0;
        int d = 0;
        int l = 0;
        int pt = 0;
        int pl = 0;
        int mk = 0;

        if (toFind.equals("")) {return "";}
        boolean found = false;
        String s = resultSheet.replaceAll("([0-9.]) ","$1-");
        s = s.replaceAll(" ([0-9.]*)(-)","_$1$2").replaceAll(" ([0-9.]*)(,)","_$1$2").replaceAll(" ([0-9.]*)$","_$1");
        String[] p = s.split(",");

        for (int i=0; i < p.length; i++){
            String[] match = p[i].split("-");
            String[] matchA = match[0].split("_");
            String teamA = matchA[0];
            int pointsA = -1;

            try{
                pointsA = Integer.parseInt(matchA[1]);
            }catch(Exception e){return "Error(float number):" + p[i].replaceAll("-"," ").replaceAll("_"," ");}

            String[] matchB = match[1].split("_");
            String teamB = matchB[0];
            int pointsB = -1;

            try{
                pointsB = Integer.parseInt(matchB[1]);
            }catch(Exception e){return "Error(float number):" + p[i].replaceAll("-"," ").replaceAll("_"," ");}

            if(teamA.equals(toFind)){
                found = true;
                if(pointsA > pointsB){
                    w++;
                    mk += 3;
                }
                else if(pointsA == pointsB){
                    d++;
                    mk += 1;
                }
                else{
                    l++;
                }
                pt += pointsA;
                pl += pointsB;
            }

            if (teamB.equals(toFind)){
                found = true;
                if (pointsB > pointsA){
                    w++;
                    mk += 3;
                }
                else if (pointsA == pointsB){
                    d++;
                    mk += 1;
                }
                else{
                    l++;
                }
                pt += pointsB;
                pl += pointsA;
            }
        }

        if (!found){
            return toFind +":This team didn't play!";
        }
        return toFind + ":W=" + w +";D="+d+";L="+l+";Scored="+pt+";Conceded="+pl+";Points="+mk;
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if (lstOfArt.length == 0 || lstOf1stLetter.length == 0){
            return "";
        }

        int sum;
        String result = "";

        for (String i : lstOf1stLetter) {
            sum = 0;
            for (String j : lstOfArt) {
                sum += j.substring(0,1).equals(i) ? Integer.parseInt(j.replaceAll("[^0-9]","")) : 0;
            }
            result += " - (" + i + " : " + sum + ")";
        }

        return result.substring(3);
    }
}
