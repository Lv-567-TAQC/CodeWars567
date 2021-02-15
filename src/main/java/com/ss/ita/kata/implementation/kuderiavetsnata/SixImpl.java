package com.ss.ita.kata.implementation.kuderiavetsnata;

import com.ss.ita.kata.Six;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.averagingDouble;


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
        String t = book.replaceAll("([^\\n. \\da-zA-Z])", "");
        String[] arr = t.split("[\\n]+");
        double current = Double.parseDouble(arr[0]);
        double total = 0;
        int count = 0;
        StringBuilder result = new StringBuilder();
        result.append("Original Balance: " + arr[0]);
        for (int i = 1; i < arr.length; i++) {
            count++;
            String[] line = arr[i].split("[ ]+");
            current -= Double.parseDouble(line[2]);
            total += Double.parseDouble(line[2]);
            String u = String.format("\\r\\n%s %s %s Balance %.2f", line[0], line[1], line[2], current);
            result.append(u);
        }
        result.append(String.format("\\r\\nTotal expense  %.2f\\r\\nAverage expense  %.2f", total, total / count));
        return result.toString();
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
        if (resultSheet.equals("") || toFind.equals("")) {
            return "";
        }
            int countTeamName = toFind.split(" ").length;
            String[] split = resultSheet.split(",");
            int points = 0;
            int won = 0;
            int draw = 0;
            int lost = 0;
            int scored = 0;
            int conceded = 0;
            for (String temp : split) {
                int ownPoints = 0;
                int oppPoints = 0;
                boolean teamFound = false;
                String[] parts = temp.split(" ");
                if (countTeamName == 2) {
                    teamFound = (parts[0].equals(toFind.split(" ")[0]) && parts[1].equals(toFind.split(" ")[1]))
                            || (parts[parts.length - 3].equals(toFind.split(" ")[0])
                            && parts[parts.length - 2].equals(toFind.split(" ")[1]));
                } else {
                    teamFound = (parts[0].equals(toFind.split(" ")[0]) && parts[1].equals(toFind.split(" ")[1])
                            && parts[2].equals(toFind.split(" ")[2]))
                            || (parts[parts.length - 4].equals(toFind.split(" ")[0])
                            && parts[parts.length - 3].equals(toFind.split(" ")[1])
                            && parts[parts.length - 2].equals(toFind.split(" ")[2]));
                }

                if (teamFound) {
                    try {
                        if (toFind.split(" ")[0].equals(parts[0])) {
                            if (toFind.split(" ").length == 2) {
                                ownPoints = Integer.parseInt(parts[2]);
                            } else {
                                ownPoints = Integer.parseInt(parts[3]);
                            }
                            oppPoints = Integer.parseInt(parts[parts.length - 1]);
                        } else {
                            if (toFind.split(" ").length == 2) {
                                oppPoints = Integer.parseInt(parts[parts.length - 4]);
                            } else {
                                oppPoints = Integer.parseInt(parts[parts.length - 5]);
                            }
                            ownPoints = Integer.parseInt(parts[parts.length - 1]);
                        }
                    } catch (NumberFormatException e) {
                        return "Error(float number):" + temp;
                    }
                    scored += ownPoints;
                    conceded += oppPoints;
                    if (ownPoints > oppPoints) {
                        points += 3;
                        won++;
                    } else if (ownPoints == oppPoints) {
                        points += 1;
                        draw++;
                    } else {
                        lost++;
                    }
                }

            }

            if (won == 0 && draw == 0 && lost == 0) {
                return toFind + ":This team didn't play!";
            } else {
                return toFind + ":W=" + won + ";D=" + draw + ";L=" + lost + ";Scored=" + scored + ";Conceded=" + conceded
                        + ";Points=" + points;
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

