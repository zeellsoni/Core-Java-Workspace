import java.lang.*;
import java.util.*;

public class Datatypes{
	
	/*byte a = 1;
	short b = 10;
	int c = 123;
	long d = 1099;
	float e = 12.3f;
	double f = 12.22d;
	char g = "a";
	*/
	
        
 
	public static void main(String[] args){
		/*System.out.println(Byte.SIZE);
		System.out.println(Short.SIZE);
		System.out.println(Integer.SIZE);
		System.out.println(Long.SIZE);
		System.out.println(Float.SIZE);
		System.out.println(Double.SIZE);
		System.out.println(Character.SIZE); */
		
		int a = 10;
		
		int b = a;
		
		a=11;
		
		System.out.println("a: " + a + " b: " + b);
		
		int[] c = { 10, 20, 30, 40 };

		int[] d = c;
 
        System.out.println("Array c: " + Arrays.toString(c));
        System.out.println("Array d: " + Arrays.toString(d));
		
		d[1] = 50;
		System.out.println("Array d: " + Arrays.toString(d));
		System.out.println("Array c: " + Arrays.toString(c));

		
	}
}