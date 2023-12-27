import java.util.*;

public class ArrayListIteration{

	public static void main(String[] args){
			
		ArrayList l = new ArrayList();
		
		l.add("abc");
		l.add("hello");
		l.add(100);
		l.add('x');
		l.add("world");
		
		for(int i = 0; i < l.size(); i++){
			
		Object o = l.get(i);
		System.out.println(o.hashCode());

		}
		int a = 2147483647 + 10;
		System.out.println(a);
	System.out.println(l.hashCode());
	}
	
}