import java.util.*;

public class CursorDemo{

	public static void main(String[] args){
	
		Vector v = new Vector();
		Enumeration e = v.elements();
		Iterator i = v.iterator();
		ListIterator l = v.listIterator();
		
		System.out.println(e.getClass().getName());
		System.out.println(i.getClass().getName());
		System.out.println(l.getClass().getName());
		
	}
}