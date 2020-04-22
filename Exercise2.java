/*Create a Collection called HashMap which is capable of storing String objects. The program should have the following abilities
a) Check if a particular key exists or not.
b) Check if a particular value exists or not.
c) Use Iterator to loop through the map.*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Exercise2 {

	static HashMap<String, String> hobj=new HashMap<String, String>();
	static Set set=hobj.entrySet();
	//method to check whether a key exist or not
	static String checkKey(String key) {
		Iterator iterKey=set.iterator();
		while(iterKey.hasNext()) {
			Map.Entry me=(Map.Entry)iterKey.next();
			if(me.getKey().equals(key)) 
				return key+" is present in map";
			}
		return key+" is absent in map";
		}
	//method to check whether a value exist or not
	static String checkValue(String value) {
		Iterator iterValue=set.iterator();
		while(iterValue.hasNext()) {
			Map.Entry me=(Map.Entry)iterValue.next();
			if(me.getValue().equals(value)) 
				return value+" is present in map";
			}
		return value+" is absent in map";
		}
	
	static void display() {
		Iterator iter=set.iterator();
		while(iter.hasNext()) {
			Map.Entry me=(Map.Entry)iter.next();
			System.out.println(me.getKey()+":"+me.getValue());
		}
	}
	
	
	
	public static void main(String[] args) {
		
		hobj.put("India", "Delhi");
		hobj.put("Japan","Tokyo");
		hobj.put("New Zealand","Wellington");
		
		System.out.println(checkKey("Japan"));
		System.out.println(checkKey("Australia"));
		System.out.println(checkValue("Tokyo"));
		System.out.println(checkValue("London"));
		System.out.println("\nMap is:");
		display();
		

	}

}
