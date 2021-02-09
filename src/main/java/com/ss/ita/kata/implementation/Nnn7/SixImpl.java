package com.ss.ita.kata.implementation.Nnn7;

import com.ss.ita.kata.Six;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.stream.Collectors;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;


public class SixImpl implements Six {


	@Override
	public long findNb(long m) {
		long test = 0l;
	    long XZ = m;
	    for (int i=1; i< XZ; i++){
	    	m = m - (long)Math.pow(i,3);
	        test++;
	        if (m==0){
	        	break;
	        }
	        if (m<0){
	        	test = -1;
	        break;
	      }     
	    }    
	    return test;    
	}

	@Override
	public String balance(String book) {
	DecimalFormat dec = new DecimalFormat("#0.00");
	double total;
    double remainingTotal;
    double elementsQty = 0;
    double totalExpenses;
		String[] bookSplitted;
    String validSymbolsRegex = "[^A-Za-z0-9. \n\r]";
    
    bookSplitted = book.replaceAll(validSymbolsRegex, "").trim().replaceAll(" +", " ").split("\n");

    total = Double.parseDouble(bookSplitted[0]);
    remainingTotal = total;
        		
        ArrayList<String> result = new ArrayList<>();
        result.add(String.format("Original Balance: %s", dec.format(total)));
        for (int i = 1; i < bookSplitted.length; i++) {
        	if(bookSplitted[i] != "") {
            String currentLine = bookSplitted[i].trim();
        		String[] splittedLine = currentLine.split(" ");
        		double currentPrice = Double.parseDouble(splittedLine[splittedLine.length - 1]);
        		remainingTotal -= currentPrice;
        		currentLine += " "+ String.format("Balance %s", dec.format(remainingTotal));

        		result.add(currentLine);
        		elementsQty ++;
        	}
        }
        totalExpenses = total - remainingTotal;
        result.add(String.format("Total expense  %s", dec.format(totalExpenses)));
        result.add(String.format("Average expense  %s", dec.format(totalExpenses/elementsQty)));
      return String.join("\\r\\n", result);
	}

	@Override
	public double f(double x) {
		double result;
		result = x/(1+Math.sqrt(++x));
	    return result;
	}

	@Override
	public double mean(String town, String strng) {
		 return values(town, strng).stream()
                 .mapToDouble(Double::doubleValue)
                 .average()
                 .orElse(-1);
	}

	@Override
	public double variance(String town, String strng) {
		double theMean = mean(town, strng);
	    
	      return values(town, strng).stream()
	                .map(d -> Math.pow(d - theMean, 2))
	                .mapToDouble(Double::doubleValue)
	                .average().orElse(-1);
	}
    public static List<Double> values(String town, String strng) {
        Optional<String> line = Arrays.stream(strng.split("\n"))
                .filter(s -> s.startsWith(town + ":"))
                .findAny();
                
        if (line.isPresent()) {
          String myline = line.get().substring(line.get().indexOf(":") +1);
          return Arrays.stream(myline.split(","))
                    .map(s -> s.substring(s.indexOf(" ")))
                    .map(Double::parseDouble)
                    .collect(Collectors.toList());  
        } else {
          return new LinkedList<Double>();
        }
    }

	@Override
	public String nbaCup(String resultSheet, String toFind) {
		 if (toFind == "") {
		        return "";
		      }
		      final String REGEX = "([A-Za-z\\s]* [A-Za-z0-9]*) ([0-9\\.]*) ([A-Za-z\\s]* [A-Za-z0-9]*) ([0-9\\.]*)";
		      int win = 0;
		      int draw = 0;
		      int lost = 0;
		      int score = 0;
		      int conceded = 0;
		      int points = 0;
		      boolean isGames = false;
		      String errorString = "";
		      
		      Pattern pattern = Pattern.compile(REGEX) ;
		      String[] games = resultSheet.split(",");
		      
		      for(int i=0; i < games.length; i++) {
		    	  String currentGame = games[i];
		        
		    	  if (!errorString.isEmpty()) {
		    		  continue;
		    	  }
		    	  Matcher matcher = pattern.matcher(currentGame);
		    	  ArrayList<String> foundData = new ArrayList<>();
		    	  matcher.find();
		    	  for(int j=1; j<=matcher.groupCount(); j++) {
		    		  foundData.add(matcher.group(j));
		    	  }
		    	  Integer currentTeamScore = null;
		    	  Integer oppositeTeamScore = null;
		    	  if (foundData.get(0).compareTo(toFind) == 0) {
		    		  try {
		    			  currentTeamScore = Integer.parseInt(foundData.get(1));
		    			  oppositeTeamScore = Integer.parseInt(foundData.get(3));

		    		  }catch(NumberFormatException e) {
		    			  errorString = "Error(float number):" + currentGame;
		    			  continue;
		    		  }
		    	  }else if (foundData.get(2).compareTo(toFind) == 0) {
		    		  try {
		    			  currentTeamScore = Integer.parseInt(foundData.get(3));
		    			  oppositeTeamScore = Integer.parseInt(foundData.get(1));
		    		  }catch(NumberFormatException e) {
		    			  errorString = "Error(float number):" + currentGame;
		    			  continue;
		    		  }
		    	  }
		    	  if (currentTeamScore != null) {
		    		  isGames = true;
		    		  score += currentTeamScore;
		    		  conceded += oppositeTeamScore;
		    		  if (currentTeamScore > oppositeTeamScore) {
		    			  win++;
		    			  points += 3;
		    		  }else if(currentTeamScore == oppositeTeamScore) {
		    			  draw++;
		    			  points += 1;
		    		  }else{
		    			  lost++;
		    		  }
		    	  }
		      }
		      if (!errorString.isEmpty()) {
		    	  return errorString;
		      }
		      if (!isGames) {
		    	  return toFind + ":This team didn't play!";
		      }
		      return String.format("%s:W=%s;D=%s;L=%s;Scored=%s;Conceded=%s;Points=%s", 
		      toFind, win, draw, lost, score, conceded, points);
		   
	}

	@Override
	public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
		 	HashMap<String, Integer> res = new HashMap<String, Integer>();
		    boolean foundBooks = false;

		    for(int i=0; i < lstOf1stLetter.length; i++) {
		    	res.put(lstOf1stLetter[i], 0);
		    }
		    for(int i=0; i < lstOfArt.length; i++) {
		    	String firstLetter = lstOfArt[i].substring(0, 1);
		    	if (res.containsKey(firstLetter)) {
		    		foundBooks = true;
		    		String[] splittedString = lstOfArt[i].split(" ");
		    		int booksQuantity = Integer.parseInt(splittedString[splittedString.length - 1]);
		    		res.put(firstLetter, res.get(firstLetter) + booksQuantity);
		    	}
		    }
		    String result = "";
		    if (foundBooks) {
		    	result = res.entrySet().stream()
		        .map(record -> String.format("(%s : %s)", record.getKey(), record.getValue()))
		        .collect(Collectors.joining(" - "));  
		    }
		    return result;
	}

}
