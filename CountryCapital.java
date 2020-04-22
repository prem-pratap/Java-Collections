/*Develop a java class with a instance variable M1 (HashMap)  create a method saveCountryCapital(String CountryName, String capital) , the method should add the passed country and capital as key/value in the map M1 and return the Map (M1).
Key- Country                          Value - Capital
India                                                   Delhi
Japan                                                Tokyo
2. Develop a method getCapital(String CountryName) which returns the capital for the country passed, from the Map M1 created in step 1.
3. Develop a method getCountry(String capitalName) which returns the country for the capital name, passed from the Map M1 created in step 1.
4. Develop a method which iterates through the map M1 and creates another map M2 with Capital as the key and value as Country and returns the Map M2.
Key – Capital                    Value – Country
Delhi                                           India
Tokyo                                        Japan
5. Develop a method which iterates through the map M1 and creates an ArrayList with all the Country names stored as keys. This method should return the ArrayList.*/

import java.util.*;
import java.util.Map.Entry;

public class CountryCapital {

		private HashMap<String, String> M1=new HashMap<String, String>();
		
		public HashMap <String,String> saveCountryCapital(String CountryName,String Capital) {
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
		
		public HashMap<String, String> swapMap(){
			HashMap<String, String> M2=new HashMap<String, String>();
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


