//Write a Java program to create an ArrayList, add all the months of a year and print the same.

import java.text.DateFormatSymbols;
import java.util.ArrayList;


public class Exercise1 {

	public static void main(String[] args) {
		ArrayList<String> alist=new ArrayList<String>();
		String[] months = new DateFormatSymbols().getMonths();
		for (int i = 0; i < months.length; i++) 
		      alist.add(months[i]);
		for(String month:alist)
			System.out.println(month);
		

	}

}
