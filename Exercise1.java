/*it uses CountryCapital  class*/

import java.util.*;

public class Exercise1 {
	
	public static void main(String[] args) {
		CountryCapital obj=new CountryCapital();
		obj.saveCountryCapital("India", "New Delhi");
		obj.saveCountryCapital("Japan", "Tokyo");
		obj.saveCountryCapital("Australia", "Canberra");
		obj.saveCountryCapital("New Zealand", "Wellington");
		
		//Displaying the map M1
		obj.displayMap();
		//getting capital name of countries
		System.out.println("\nThe capital of Australia is "+obj.getCapital("Australia"));
		System.out.println("The capital of Srilanka is "+obj.getCapital("Srilanka"));
		//getting country name with passing capital
		System.out.println("\nWellington is the capital of "+obj.getCountry("Wellington"));
		
		
		//getting the reverse map
		HashMap<String, String> reverseMap=obj.swapMap();
		System.out.println("\nReverse map with capitals as keys and countries as value:");
		for (String key:reverseMap.keySet())
			System.out.println(key+":"+reverseMap.get(key));
		
		
	}

}
