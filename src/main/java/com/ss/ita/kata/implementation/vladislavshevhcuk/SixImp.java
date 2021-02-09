package com.ss.ita.kata.implementation.vladislavshevhcuk;

import com.ss.ita.kata.Six;
import java.util.*;
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
        return x/(1+Math.sqrt(x+1));
    }

    private static double[] getRainfallRecords(String town,String strng){
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

    static String teams = "Los Angeles Clippers,Dallas Mavericks,New York Knicks,NYK,Atlanta Hawks,Indiana Pacers,Memphis Grizzlies,"
            + "Los Angeles Lakers,Minnesota Timberwolves,Phoenix Suns,Portland Trail Blazers,New Orleans Pelicans,"
            + "Sacramento Kings,Los Angeles Clippers,Houston Rockets,Denver Nuggets,Cleveland Cavaliers,Milwaukee Bucks,"
            + "Oklahoma City Thunder,San Antonio Spurs,Boston Celtics,Philadelphia 76ers,Brooklyn Nets,Chicago Bulls,"
            + "Detroit Pistons,Utah Jazz,Miami Heat,Charlotte Hornets,Toronto Raptors,Orlando Magic,Washington Wizards,"
            + "Golden State Warriors,Dallas Maver";

    private static boolean isTeamAvailable(String[] teams,String toFind){
        for(String team : teams){
            if(team.equals(toFind)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        if(toFind.equals("")) return "";
        String[] teamsArray = teams.split(",");
        if(!isTeamAvailable(teamsArray, toFind)){
            return String.format("%s:This team didn't play!",toFind);
        }

        String[] matches = resultSheet.split(",");
        int wins=0, draws=0, losses=0, score=0, concede=0, points=0;
        String[] pairs = new String[2];
        for(String match : matches){
            if(match.contains(".")){return String.format("Error(float number):%s",match);}
            if(match.contains(toFind)){
                pairs = match.split(toFind);
                if(pairs[0].equals("")){
                    String someShit = pairs[1].trim();
                    int matchScore = Integer.parseInt(someShit.substring(0,someShit.indexOf(" ")));
                    int concedeScore = 0;
                    for(String team : teamsArray){
                        if(someShit.contains(team))
                            concedeScore =Integer.parseInt(someShit.substring(someShit.indexOf(team)+team.length()+1));
                    }
                    score+=matchScore;
                    concede+=concedeScore;
                    if(matchScore == concedeScore) draws++;
                    else if(matchScore > concedeScore) wins++;
                    else losses++;
                }
                else {
                    int matchScore = Integer.parseInt(pairs[1].trim());
                    int concedeScore = 0;
                    for(String team : teamsArray){
                        if(pairs[0].trim().contains(team)){
                            String someShit = pairs[0].trim();
                            concedeScore =Integer.parseInt(someShit.substring(team.length()+1));
                        }
                    }
                    score+=matchScore;
                    concede+=concedeScore;
                    if(matchScore == concedeScore) draws++;
                    else if(matchScore > concedeScore) wins++;
                    else losses++;
                }
            }
        }
        points = wins*3+draws*1;
        if((wins+draws+losses)==0) return String.format("%s:This team didn't play!",toFind);
        String result = String.format("%s:W=%d;D=%d;L=%d;Scored=%d;Conceded=%d;Points=%d",toFind,wins,draws,losses,score,concede,points);
        return result;
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if(lstOfArt.length == 0 || lstOf1stLetter.length==0){
            return "";
        }
        String result ="";
        Map<String, Integer> dictionary = new HashMap<String, Integer>();
        for(String category : lstOf1stLetter){
            dictionary.put(category,0);
        }
        for(String art : lstOfArt){
            String key =Character.toString(art.charAt(0));
            if(dictionary.containsKey(key)){
                int value = dictionary.get(key);
                int smth = Integer.parseInt(art.substring(art.indexOf(" ")+1));
                dictionary.put(key,value+smth);
            }
        }
        for (Map.Entry<String, Integer> item : dictionary.entrySet()){
            result+= String.format("(%s : %d) - ",item.getKey(),item.getValue());
        }
        return result.substring(0,result.length()-3);
    }
}
