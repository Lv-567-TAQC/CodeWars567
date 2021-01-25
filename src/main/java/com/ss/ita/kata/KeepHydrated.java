package com.ss.ita.kata;


public class KeepHydrated implements Eight{
	
	  public int liters(double time)  {		    
		double liters = 0.5f;
		liters=(liters*time) - (liters*time)%1;
			
		//System.out.println(liters);
		int result=(int)liters; 
	    	return result;
	  
	  }

}
