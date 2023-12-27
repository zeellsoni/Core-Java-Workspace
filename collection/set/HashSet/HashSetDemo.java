import java.util.*;

public class HashSetDemo{

	public static void main(String[] args){
	
		HashSet h = new HashSet();
		
		h.add("A");
		h.add('a');
		h.add(10);
		h.add(null);
		h.add("abc");
		//char s1 = 65;
		
		System.out.println(h.add("A"));
		//System.out.println(h.add(s1)); 
		
		System.out.println(h.add(new Integer(5)));
		System.out.println(h.add(new Integer(5)));
		System.out.println(h);
		//System.out.println(h.add(new Character('a')));
	}
}