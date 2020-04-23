/*Create an ArrayList that can store only numbers like int,float,double,etc, but not any other data type.*/

import java.util.List;
import java.util.ArrayList;


class myArrayList<N> extends ArrayList<N>{
	public boolean add(N e) {
		if(e instanceof Integer || e instanceof Float || e instanceof Double) { 
			super.add(e);
			return true;}
		else {
			throw new ClassCastException("Only number datatype allowed, cannot add string to list");
	}
	}
}

public class ListExercise4 {

	public static void main(String[] args) {
		List<Object> li=new myArrayList<>();
		try {
		li.add(100);
		li.add(23.09);
		li.add(1.92812);
		li.add("hello");}
		catch(ClassCastException ce) {
			System.out.println(ce.getMessage());
		}
		for(Object l: li) 
			System.out.println(l);
			
		

	}

}
