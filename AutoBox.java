import java.util.*;

public class AutoBox{

	public static void main(String[] args){
		
		//Autoboxing
		int n = 5;
		Integer a = n;
	
		//Unboxing
		Character d = 'h';
		char c = d;
		
		//wrapping around object
		int b = 15;
		Integer i = new Integer(b);
		
		//unwrapping an object, i.e., printing as datatypes
		char e = 'p';
		Character f = new Character(e);
		
		char g = f;
		
		//printing on the console
		System.out.println(a);
		System.out.println(d);
		System.out.println(b);
		System.out.println(g);
	}
}