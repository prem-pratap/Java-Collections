/*Create an ArrayList that can store only Strings. 
Create a printAll method that will print all the elements of the ArrayList using an Iterator.*/

import java.util.ArrayList;
import java.util.Iterator;

public class ListExercise3 {

	public static void printAll(ArrayList ar) {
		Iterator<String> iter=ar.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());
	}
	
	
	public static void main(String[] args) {

		ArrayList<String> alist=new ArrayList<String>();
		alist.add("Dhoni");
		alist.add("Virat");
		alist.add("Rahul");
		alist.add("Rohit");
		
		printAll(alist);
		

	}

}
