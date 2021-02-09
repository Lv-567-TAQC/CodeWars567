package com.ss.ita.kata.implementation.kuderiavetsnata;

import com.ss.ita.kata.Six;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.averagingDouble;
import static java.util.stream.Stream.of;

public class SixImpl implements Six {
    @Override
    public long findNb(long m) {
        long mm = 0;
        long n = 0;
        while (mm < m) {
            ++n;
            mm += n * n * n;
        }
        return mm == m ? n : -1;

    }

    @Override
    public String balance(String book) {
        return null;
    }

    @Override
    public double f(double x) {
        return x / (1 + Math.sqrt(1 + x));
    }

    @Override
    public double mean(String town, String strng) {
        return parseTemp(town, strng).stream()
                .collect(averagingDouble(n -> n));
    }

    @Override
    public double variance(String town, String strng) {
        double mean = mean(town, strng);
        if (mean == -1.0) return -1.0;

        return parseTemp(town, strng).stream()
                .collect(averagingDouble(n -> (n - mean) * (n - mean)));
    }

    private static List<Double> parseTemp(String town, String strng) {
        List<Double> temps = new ArrayList<>();
        for (String line : strng.split("\\n")) {
            String[] data = line.split(":");
            if (town.equals(data[0])) {
                for (String weather : data[1].split(",")) {
                    String[] temp = weather.split("\\s");
                    temps.add(Double.parseDouble(temp[1]));
                }
                break;
            }
        }

        if (temps.isEmpty()) temps.add(-1.0);

        return temps;
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {

        if (toFind.isEmpty()) {
            return "";
        }

        int[] stats = new int[5];
        for (var match : of(resultSheet.split(",")).filter(s -> s.contains(toFind)).toArray(String[]::new)) {
            if (match.contains(".")) {
                return "Error(float number):" + match;
            }
            var teams = match.substring(0, match.lastIndexOf(' ')).replaceAll(" \\d+ ", "@").split("@");
            if (teams[0].equals(toFind) || teams[1].equals(toFind)) {
                int pointsA = Integer.parseInt(match.substring(match.lastIndexOf(' ') + 1));
                int pointsB = Integer.parseInt(match.substring(teams[0].length() + 1, match.indexOf(teams[1]) - 1));
                updateMatchStatistics(pointsA, pointsB, match.startsWith(toFind), stats);
            }
        }
        return toFind + (stats[3] + stats[4] > 0 ? ":W=" + stats[0] + ";D=" + stats[2] + ";L=" + stats[1] + ";Scored=" + stats[3] + ";Conceded=" + stats[4] + ";Points=" + (3 * stats[0] + stats[2]) : ":This team didn't play!");
    }

    private static void updateMatchStatistics(int pointsA, int pointsB, boolean home, int[] stats) {
        if (home) {
            int temp = pointsA;
            pointsA = pointsB;
            pointsB = temp;
        }

        stats[3] += pointsA;
        stats[4] += pointsB;

        if (pointsA > pointsB) {
            stats[0]++;
        } else if (pointsA < pointsB) {
            stats[1]++;
        } else {
            stats[2]++;
        }
    }


    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        int sum = 0;
        boolean hasRunOnce = false;
        String stock = "";
        for (int i = 0; i < lstOf1stLetter.length; i++) {
            for (int j = 0; j < lstOfArt.length; j++) {
                if (lstOf1stLetter[i].charAt(0) == lstOfArt[j].charAt(0)) {
                    sum += Integer.parseInt(lstOfArt[j].substring(lstOfArt[j].indexOf(" ") + 1));
                }
                if (j == lstOfArt.length - 1) {
                    if (!hasRunOnce) {
                        stock += "(" + lstOf1stLetter[i] + " : " + sum + ")";
                        sum = 0;
                        hasRunOnce = true;
                    } else {
                        stock += " - (" + lstOf1stLetter[i] + " : " + sum + ")";
                        sum = 0;
                    }
                }
            }
        }
        return stock;
    }
}

