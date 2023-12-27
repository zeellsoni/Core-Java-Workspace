import java.util.*;

public class BasicListDemo{

	public static void main(String[] args){
		
		//declaring two lists
		List ls = new ArrayList();
		List ls1 = new ArrayList<>();
		int i = 1000;
		//List ls1 = new ArrayList<String>();
		//List<> ls1 = new ArrayList();
		//List<Integer> i = new ArrayList<Integer>(15);
		
		ArrayList st = new ArrayList();
		//List st = new ArrayList<String>();
		
		//st.add("zeel");
		//st.add("soni");
		//st.add(100);
		st.add(i);
		//st.add(null);
		System.out.println(st);
		System.out.println(i);
		
		//size of list ls
		//before inserting
		//elements
		int s = ls.size();
		System.out.println("Size of ls: " +s);
		
		//adding elements of 
		//different types  
		//to list ls
		ls.add(9);
		ls.add(5l);
		ls.add("demo");
		ls.add("abc");
		ls.add('a');
		ls.add(43.3);
		
		//adding elements of 
		//different types 
		//to list ls1
		ls1.add('a');
		ls1.add("abcd");

		//appending list ls
		//to list ls1
		ls1.addAll(ls);
		
		//finding size of 
		//both the lists
		//after element
		//insertion
		int sz = ls.size();
		int sz1 = ls1.size();
		
		System.out.println("Size of ls: " + sz);
		System.out.println("Size of ls: " + sz1);
		
		//printing both the
		//lists
		System.out.println("Printing elements present in ls: " + ls);
		System.out.println("Printing elements present in ls1: " + ls1);
	}
}