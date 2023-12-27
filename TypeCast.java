import java.util.*;

public class TypeCast{

	public static void main(String[] args){
	
		//Widening typecasting
		
		int a = 5;
		
		long l = a;
		double d = a;
		
		System.out.println(a);
		System.out.println(l);
		System.out.println(d);
		//System.out.println(Integer.SIZE);
		
		//Narrowing typecasting
		
		long b = 500;
		
		int i = (int)b;
		short s = (short)b;
		
		System.out.println(i);
		System.out.println(s);
		
		
	}
}