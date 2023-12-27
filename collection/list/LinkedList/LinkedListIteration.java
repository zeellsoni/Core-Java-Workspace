import java.util.*;

public class LinkedListIteration{

	public static void main(String[] args){
			
		LinkedList l = new LinkedList();
		System.out.println(l.getClass().getName());
		
		l.add("abc");
		l.addFirst("hello");
		l.addLast(100);
		l.add('x');
		l.add(new StringBuffer("world"));
		
		for(int i = 0; i < l.size(); i++){
			
		Object o = l.get(i);
		System.out.println(o.hashCode());

		}
		System.out.println(l.hashCode());
	}
}