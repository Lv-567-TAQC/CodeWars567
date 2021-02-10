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
        return x/(1+Math.sqrt(x+1));
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
            if (toFind.equals(""))
                return "";
            int countTeamname = toFind.split(" ").length;
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
                if (countTeamname == 2) {
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
