package com.ss.ita.kata.implementation.khrystiash;

import com.ss.ita.kata.Six;

public class SixImplementation implements Six {
    @Override
    public long findNb(long m) {
        long n = 0;
        for (int i = 1; m >= 0; i++) {
            m = m - (long) Math.pow(i, 3);
            n = i;
        }
        m = m + (long) Math.pow(n, 3);
        if (m != 0.0) {
            return -1;
        }
        return n - 1;
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
        String[] data;
        Double sum = 0.0;
        if (town == "") {
            return -1;
        }
        if (!strng.contains(town + ":")) {
            return -1;
        }
        data = strng.split("\n");
        for (int i = 0; i < data.length; i++) {
            if (town.equals(data[i].substring(0, town.length()))) {
                strng = data[i].substring(town.length() + 1);
                break;
            }
        }
        data = strng.split(",");
        String[] values = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            values[i] = data[i].substring(4);
        }
        Double[] numbs = new Double[values.length];
        for (int i = 0; i < values.length; i++) {
            numbs[i] = Double.parseDouble(values[i]);
            sum += numbs[i];
        }
        sum = sum / 12;
        return sum;
    }

    @Override
    public double variance(String town, String strng) {
        String[] data;
        Double sum = 0.0;
        if (town == "") {
            return -1;
        }
        if (!strng.contains(town + ":")) {
            return -1;
        }
        data = strng.split("\n");
        for (int i = 0; i < data.length; i++) {
            if (town.equals(data[i].substring(0, town.length()))) {
                strng = data[i].substring(town.length() + 1);
                break;
            }
        }
        data = strng.split(",");
        String[] values = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            values[i] = data[i].substring(4);
        }
        Double[] numbs = new Double[values.length];
        for (int i = 0; i < values.length; i++) {
            numbs[i] = Double.parseDouble(values[i]);
            sum += numbs[i];
        }
        sum /= 12;
        double result = 0;
        for (int i = 0; i < numbs.length; i++) {
            numbs[i] = Math.pow((sum - numbs[i]), 2);
            result += numbs[i];
        }
        result /= 12;
        return result;
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        String result = "";
        int win = 0;
        int lose = 0;
        int draw = 0;
        int score = 0;
        int conceded = 0;
        int points = 0;
        int count1 = 0;
        String[] arrayGames = resultSheet.split(",");
        int count = 0;
        int[] gameRes = new int[2];
        String name = "";
        String name1 = "";

        if (resultSheet.equals("") || toFind.equals("")) {
            return result;
        }
        if (!resultSheet.contains(toFind)) {
            return result = toFind + ":This team didn't play!";
        }

        for (int i = 0; i < arrayGames.length; i++) {
            if (arrayGames[i].contains(toFind)) {
                count++;
            }
            if (arrayGames[i].contains(".")) {
                return result = "Error (float number):" + arrayGames[i];
            }
        }
        String[] arrayTrueGames = new String[count];
        count = 0;
        for (int i = 0, j = 0; i < arrayGames.length && j < arrayTrueGames.length; i++) {
            if (arrayGames[i].contains(toFind)) {
                arrayTrueGames[j] = arrayGames[i];
                j++;
            }
        }
        for (int i = 0; i < arrayTrueGames.length; i++) {
            String[] game = arrayTrueGames[i].split(" ");
            for (int j = 0, a = 0; j < game.length && a < 2; j++) {
                if (isInt(game[j])) {
                    gameRes[a] = Integer.parseInt(game[j]);
                    a++;
                }
                if (a == 0) {
                    name += game[j] + " ";
                    count++;
                }
                if (a == 1 && (!(isInt(game[j])))) {
                    name1 += game[j] + " ";
                    count1++;
                }
            }
            name = name.substring(0, name.length() - 1);
            name1 = name1.substring(0, name1.length() - 1);
            if (name.matches(toFind)) {
                if (gameRes[0] > gameRes[1]) {
                    score += gameRes[0];
                    conceded += gameRes[1];
                    win++;
                } else if (gameRes[0] == gameRes[1]) {
                    score += gameRes[0];
                    conceded += gameRes[1];
                    draw++;
                } else {
                    score += gameRes[0];
                    conceded += gameRes[1];
                    lose++;
                }
            } else if (name1.matches(toFind)) {
                if (gameRes[0] > gameRes[1]) {
                    score += gameRes[1];
                    conceded += gameRes[0];
                    lose++;
                } else if (gameRes[0] == gameRes[1]) {
                    score += gameRes[1];
                    conceded += gameRes[0];
                    draw++;
                } else {
                    score += gameRes[1];
                    conceded += gameRes[0];
                    win++;
                }
            }
            name = "";
            name1 = "";
        }

        if (win == 0 && lose == 0 && draw == 0) {
            result = toFind + ":This team didn't play!";
        } else {
            points = win * 3 + draw;
            result = toFind + ":W=" + win + ";D=" + draw + ";L=" + lose + ";Scored="
                    + score + ";Conceded=" + conceded + ";Points=" + points;
        }
        return result;
    }

    public boolean isInt(String str) {
        try {
            Integer.valueOf(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        String result = "";
        Integer sum = 0;
        String bukva = "";
        for (int j = 0; j < lstOf1stLetter.length; j++) {
            for (int i = 0; i < lstOfArt.length; i++) {
                if (lstOfArt[i].charAt(0) == lstOf1stLetter[j].charAt(0)) {
                    bukva = lstOf1stLetter[j];
                    sum += Integer.valueOf(lstOfArt[i].substring(lstOfArt[i].indexOf(" ")+1));
                }
            }
            result += "(" + bukva + " : " + sum + ")";
            if(j<lstOf1stLetter.length-1){
                result += " - ";
            }
            sum = 0;
        }
        return result;
    }
}
