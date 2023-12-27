abstract class A {
    public final void add(){
	}
}

public class AbstractFinalMethod extends A{
	
	public final void add(){
		System.out.println("Hello");
	}
	
	public static void main(String[] args){
		
	FinalOverride fo = new FinalOverride();
	fo.add();
	
	}
}