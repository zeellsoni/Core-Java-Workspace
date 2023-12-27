import java.util.*;

public class ListMethodsDemo{

	public static void main(String[] args){
		
		//declaring two lists
		List ls = new ArrayList<>();
		List ls1 = new ArrayList();
		
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
		System.out.println();
		
		//printing both the
		//lists
		System.out.println("Printing elements present in ls: " + ls);
		System.out.println("Printing elements present in ls1: " + ls1);
		System.out.println();
		
		//clearing all the
		//elements from
		//list ls
		
		ls.clear();
		
		//printing the list
		//after clearing
		System.out.println("List ls after clearing it: " + ls);
	}
}