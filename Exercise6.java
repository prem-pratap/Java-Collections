/*It uses CountryTable class. It implements assignment1 using Hashtable*/


public class Exercise6 {

	public static void main(String[] args) {
		CountryTable obj=new CountryTable();
		
		
		obj.saveCountryCapital("Russia","Moscow");
		obj.saveCountryCapital("Netherlands","Amsterdam");
		obj.saveCountryCapital("Australia","Canberra");
		obj.saveCountryCapital("Thailand", "Bangkok");
		
		//Displaying the map M1
		obj.displayMap();
		//getting capital name of countries
		System.out.println("\nThe capital of Thailand is "+obj.getCapital("Thailand"));
		System.out.println("The capital of India is "+obj.getCapital("India"));
		//getting country name with passing capital
		System.out.println("\nAmsterdam is the capital of "+obj.getCountry("Amsterdam"));
		
		
		//getting the reverse map
		Hashtable<String, String> reverseMap=obj.swapMap();
		System.out.println("\nReverse map with capitals as keys and countries as value:");
		for (String key:reverseMap.keySet())
			System.out.println(key+":"+reverseMap.get(key));
		

	}

}
