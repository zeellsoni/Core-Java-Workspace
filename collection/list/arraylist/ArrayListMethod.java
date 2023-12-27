import java.util.*;

public class ArrayListMethod{

	public static void main(String[] args){
		
		ArrayList al = new ArrayList();
		
		al.add("abc");
		al.add('x');
		al.add(100);
		al.add(null);
		al.add('x');
		System.out.println(al);
		
		al.remove(4);
		System.out.println(al);
	}
}