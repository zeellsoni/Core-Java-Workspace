import java.util.*;

public class TreeSetDemo{

	public static void main(String[] args){
	
		SortedSet s = new TreeSet();
		
		s.add("A");
		s.add("a");
		s.add("D");
		s.add("L");
		s.add("Z");
		//s.add(10);
		s.add(null);
		
		System.out.println(s);
		
	}
	
}
	
	