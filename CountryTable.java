/*Class to implement assignment1 using Hashtable*/

import java.util.*;
import java.util.Map.Entry;

public class CountryTable {
	private Hashtable<String, String> M1=new Hashtable<String, String>();
	
	public Hashtable <String,String> saveCountryCapital(String CountryName,String Capital) {
		M1.put(CountryName,Capital);
		return M1;
	}
	
	public String getCapital(String CountryName) {
		if(M1.containsKey(CountryName))
				return M1.get(CountryName);
		else
			return "not found in database as invalid country";
	}
	
	public String getCountry(String capitalName) {
		for(String key:M1.keySet()) {
			if(M1.get(key).equals(capitalName))
				return key; 
		}
		return "not found in database as invalid capital";
	}
	
	public Hashtable<String, String> swapMap(){
		Hashtable<String, String> M2=new Hashtable<String, String>();
		for(String key:M1.keySet())
			M2.put(M1.get(key),key);
		return M2;
	}
	
	public ArrayList<String> keyArraylist(){
		ArrayList<String> keyList=new ArrayList<String>();
		Set<Entry<String, String>> set=M1.entrySet();
		Iterator<Entry<String, String>> iter=set.iterator();
		while(iter.hasNext()) {
			Map.Entry me=(Map.Entry)iter.next();
			keyList.add((String) me.getKey());
		}
		return keyList;		
	}
	
	
	public void displayMap() {
		for(String key:M1.keySet())
			System.out.println(key+":"+M1.get(key));
	}

	
	

	
	
	
}
