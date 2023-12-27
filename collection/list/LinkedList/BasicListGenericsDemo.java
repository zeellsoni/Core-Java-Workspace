import java.util.*;

public class BasicListGenericsDemo{

	public static void main(String[] args){
		
		//This is a List having generics (if no data type is mentioned, it is
		//of object class 
		List<> ls = new ArrayList();
		
		//List taking only Integer type of data and having size 15
		List<Integer> i = new ArrayList<Integer>(15);
		
		//This will give incompatible type error because ArrayList takes 
		//String data type and List only accepts Integer type of data
		List<Integer> st = new ArrayList<String>();
		
		//This means that the ArrayList will take String type of data, but 
		//since no generics is there in List, it can take heterogeneous data
		List st = new ArrayList<String>();
		
		//adding elements to List st
		st.add("zeel");
		st.add("soni");
		
		//this will throw error because List st does not accept integer values
		st.add(100);
		st.add(null);
		System.out.println(st);
		
		//adding elements of different types to list ls
		ls.add(9);
		ls.add(5l);
		ls.add("demo");
		ls.add("abc");
		ls.add('a');
		ls.add(43.3);
		
		//adding elements of different types to list ls1
		ls1.add('a');
		ls1.add("abcd");

		//appending list ls to list ls1
		ls1.addAll(ls);
		
		//printing both the
		//lists
		System.out.println("Printing elements present in ls: " + ls);
		System.out.println("Printing elements present in ls1: " + ls1);
	}
}