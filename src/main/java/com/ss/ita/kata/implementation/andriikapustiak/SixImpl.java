package com.ss.ita.kata.implementation.andriikapustiak;

import com.ss.ita.kata.Six;

public class SixImpl implements Six {
    @Override
    public long findNb(long m) {
        long n = 0;
        long ttl = 0;

        while (n < m) {
            ttl = ttl + 1;
            n += ttl * ttl * ttl;
        }
        if (n == m) {
            return ttl;
        }
        return -1;
    }


    @Override
    public String balance(String book) {

        String s = book.replaceAll("([^\\n. \\da-zA-Z])", "");
        String[] array = s.split("[\\n]+");
        double current = Double.parseDouble(array[0]);
        double ttl = 0;
        int counter = 0;
        StringBuilder result = new StringBuilder();
        result.append("Original Balance: ").append(array[0]);

        for (int i = 1; i < array.length; i++) {
            counter++;
            String[] line = array[i].split("[ ]+");
            current -= Double.parseDouble(line[2]);
            ttl += Double.parseDouble(line[2]);
            String res = String.format("\\r\\n%s %s %s Balance %.2f", line[0], line[1], line[2], current);
            result.append(res);
        }

        result.append(String.format("\\r\\nTotal expense  %.2f\\r\\nAverage expense  %.2f", ttl, ttl / counter));
        return result.toString();
    }

    @Override
    public double f(double x) {
        return x / (1 + Math.sqrt(x + 1));
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
        int wins = 0;
        int draws = 0;
        int loses = 0;
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
                    wins++;
                    mk += 3;
                }
                else if(pointsA == pointsB){
                    draws++;
                    mk += 1;
                }
                else{
                    loses++;
                }
                pt += pointsA;
                pl += pointsB;
            }

            if (teamB.equals(toFind)){
                found = true;
                if (pointsB > pointsA){
                    wins++;
                    mk += 3;
                }
                else if (pointsA == pointsB){
                    draws++;
                    mk += 1;
                }
                else{
                    loses++;
                }
                pt += pointsB;
                pl += pointsA;
            }
        }

        if (!found){
            return toFind +":This team didn't play!";
        }
        return toFind + ":W=" + wins +";D="+draws+";L="+loses+";Scored="+pt+";Conceded="+pl+";Points="+mk;
    }


    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        String result = "";
        String letter = "";
        int sum = 0;
        for (int j = 0; j < lstOf1stLetter.length; j++) {

            for (int i = 0; i < lstOfArt.length; i++) {
                if (lstOfArt[i].charAt(0) == lstOf1stLetter[j].charAt(0)) {
                    sum += Integer.valueOf(lstOfArt[i].substring(lstOfArt[i].indexOf(" ") + 1));
                    letter = lstOf1stLetter[j];
                }
            }
            result += "(" + letter + " : " + sum + ")";
            if (j < lstOf1stLetter.length - 1) {
                result += " - ";
            }
            sum = 0;
        }
        return result;
    }

}
