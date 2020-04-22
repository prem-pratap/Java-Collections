/*Write a program that will have a Vector which is capable of storing Employee objects. Use an Iterator and enumeration to list all the elements of the Vector.*/

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Exercise7 {
	public static void main(String[]args) {
		Vector<Employee> vec=new Vector<Employee>();
		vec.add(new Employee(1,"Akhilesh","akhilesh1@abc.com","Male",29000));
		vec.add(new Employee(2,"Ishika","ishika2@abc.com","Female",39000));
		vec.add(new Employee(3,"Kabir","kabir3@abc.com","Male",25000));
		vec.add(new Employee(4,"Prem","prem4@abc.com","Male",49000));
		
		System.out.println("Listing vector elements using iterator:\n");
		//iterator to iterate vector
		Iterator<Employee> iter=vec.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());
		System.out.println("\nListing vector elements using enumeration:\n");
		//enumeration to iterate vector
		Enumeration<Employee> enu=vec.elements();
		while(enu.hasMoreElements())
			System.out.println(enu.nextElement());
				
	}
}
