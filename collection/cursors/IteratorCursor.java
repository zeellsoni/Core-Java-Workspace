import java.util.*;

public class IteratorCursor{

	public static void main(String[] args){
	
		ArrayList l = new ArrayList();
		
		for(int i = 0; i <= 10; i++){
			l.add(i);
		}
		System.out.println(l);
		
		Iterator i = l.iterator();
		System.out.println(i.getClass().getName());
		while(i.hasNext()){
			Integer I = (Integer)i.next();
			if(I % 2 == 0){
				System.out.println(I);
			}
			else{
				i.remove();
			}
		}
		System.out.println(l);
	}	
}