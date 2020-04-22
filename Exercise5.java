/*It uses CountryTree class. It implements assignment 1 using TreeMap*/

import java.util.*;

public class Exercise5 {

	public static void main(String[] args) {
		CountryTree object=new CountryTree();
		
		object.saveCountryCapital("Bangladesh", "Dhaka");
		object.saveCountryCapital("United Kingdom", "London");
		object.saveCountryCapital("Nepal","Kathmandu");
		object.saveCountryCapital("Thailand", "Bangkok");
		
		//Displaying the map M1
		object.displayMap();
		//getting capital name of countries
		System.out.println("\nThe capital of United Kingdom is "+object.getCapital("United Kingdom"));
		System.out.println("The capital of India is "+object.getCapital("India"));
		//getting country name with passing capital
		System.out.println("\nBangkok is the capital of "+object.getCountry("Bangkok"));
		
		
		//getting the reverse map
		TreeMap<String, String> reverseMap=object.swapMap();
		System.out.println("\nReverse map with capitals as keys and countries as value:");
		for (String key:reverseMap.keySet())
			System.out.println(key+":"+reverseMap.get(key));
		
		
		
	}

}
