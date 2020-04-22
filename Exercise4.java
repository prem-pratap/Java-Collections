/*Create a Collection “ContactList” using HashMap to store name and phone number of contacts added. The program should use appropriate generics (String, Integer) and have the following abilities:
a) Check if a particular key exists or not. 
b) Check if a particular value exists or not.
c) Use Iterator to loop through the map.*/

import java.util.*;

public class Exercise4 {
	static HashMap<String,Integer> ContactList=new HashMap();
	static Set set=ContactList.entrySet();
	 //method to check whether contact name exist or not
	static String contactNameCheck(String key) {
		 Iterator iterKey=set.iterator();
		 while(iterKey.hasNext()) {
			 Map.Entry me=(Map.Entry) iterKey.next();
			 if(me.getKey().equals(key)) 
					return  "Contact with "+key+" is present and its contact number is "+me.getValue();
				}
			return "Contact with "+key+" is absent.";
			
		 }
	//method to check whether contact number exist or not		 
	 static String numberCheck(Integer val) {
		 Iterator iterValue=set.iterator();
		 while(iterValue.hasNext()) {
			 Map.Entry me=(Map.Entry)iterValue.next();
			 if(me.getValue()==val)
				 return "Contact number "+val+" is present with contact name as "+me.getKey();
			}
		return "Contact number "+val+" is absent.";
		
		 }
	 
	 static void display() {
			Iterator iter=set.iterator();
			while(iter.hasNext()) {
				Map.Entry me=(Map.Entry)iter.next();
				System.out.println(me.getKey()+":"+me.getValue());
			}
		}
	//main method
	public static void main(String[] args) {
		
		ContactList.put("Rohit",950902983);
		ContactList.put("Police",100);
		ContactList.put("Mohit",800872733);
		System.out.println(contactNameCheck("Rohit"));
		System.out.println(contactNameCheck("Shubham"));
		System.out.println(numberCheck(100));
		System.out.println(numberCheck(108));
		
		

	}

}
