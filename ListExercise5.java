/*Write a Java program to create an LinkedList, add all the months of a year and print the same.*/

import java.text.DateFormatSymbols;
import java.util.LinkedList;

public class ListExercise5 {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		String[] months = new DateFormatSymbols().getMonths();
		for (int i = 0; i < months.length; i++) 
		      list.add(months[i]);
		for(String month:list)
			System.out.println(month);
		System.out.println("First month is :"+list.getFirst());
		System.out.println("Whole linked list is \n"+list);
	}

}
