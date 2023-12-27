final class A{

	public void add(){
		System.out.println("Hi");
	}
}

public class FinalOverride extends A{
	
	public final void add(){
		System.out.println("Hello");
	}
	
	public static void main(String[] args){
		
	FinalOverride fo = new FinalOverride();
	fo.add();
	
	}
}