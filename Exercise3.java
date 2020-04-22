/*Write a program that will have a Properties class object which is capable of storing some States of India and their Capital. Use an Iterator to list all the elements stored in the Properties.*/

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Exercise3 {

	public static void main(String[] args) {
		Properties p=new Properties();
		p.setProperty("Rajasthan", "Jaipur");
		p.setProperty("Madhya Pradesh", "Bhopal");
		p.setProperty("Goa","Panji");
		Set set=p.entrySet();
		Iterator iter=set.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());
		

	}

}
