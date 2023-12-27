import java.util.*;

public class Testing{

	public static void main(String[] args){
	
	List<Integer> ls = new LinkedList<>();
	long k = 2147483748l + 500;
	//k -= 100;
	//System.out.println(k);
	
	for(int i = 0; i < k ; i++){
		System.gc();
		ls.add(i);
		//System.out.println(i);
	}
	System.out.println(ls);
	}
}