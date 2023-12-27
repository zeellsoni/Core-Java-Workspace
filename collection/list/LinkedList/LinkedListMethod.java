import java.util.*;

public class LinkedListMethod{

	public static void main(String[] args){
		
		LinkedList l = new LinkedList();
		
		l.add("abc");
		l.addFirst("hello");
		l.addLast(100);
		l.add(null);
		l.add('x');
		l.add("world");
		
		System.out.println(l);
		
		l.removeFirst();
		l.removeLast();
		System.out.println(l);
		
		l.getFirst();
		l.getLast();
		
		System.out.println(l);
		
	}
}