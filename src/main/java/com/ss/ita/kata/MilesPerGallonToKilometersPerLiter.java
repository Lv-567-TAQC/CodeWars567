package com.ss.ita.kata;

public class MilesPerGallonToKilometersPerLiter implements Eight{
	
	 public static float mpgToKPM(final float mpg) {
			double kmperlitres;
			double changer = 1.609344d/ 4.54609188;
			kmperlitres= mpg*changer;
	   		
	    double result = Math.round(kmperlitres*100)/100.00;
	    
			return  (float)result;
	  }

}
