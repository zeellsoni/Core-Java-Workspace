import java.util.*;

public class ListIteratorCursor{

	public static void main(String[] args){
	
		LinkedList l = new LinkedList();
		
		l.add("abc");
		l.add("mno");
		l.add("xyz");
		
		System.out.println(l);
		
		ListIterator i = l.listIterator();
		
		while(i.hasNext()){
			String s = (String)i.next();
		
			if(s.equals("abc")){
				i.remove();
			}
			else if(s.equals("mno")){
				i.add("pqr");
			}
			else if(s.equals("abc")){
				i.set("ijk");
			}
		}
		System.out.println(l);
	}	
}