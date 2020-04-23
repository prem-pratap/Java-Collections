/*Write a Java program to create an vector, add all the months of a year and print the same.*/

import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Vector;

public class ListExercise6 {

	public static void main(String[] args) {
		Vector<String> vec=new Vector<String>();
		String[] months = new DateFormatSymbols().getMonths();
		for (int i = 0; i < months.length; i++) 
		      vec.add(months[i]);
		for(String month:vec)
			System.out.println(month);

	}

}
