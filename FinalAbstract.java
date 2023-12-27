final class A {
    public abstract void add();
}

public class FinalAbstract extends A{
	
	public abstract void add(){
		System.out.println("Hello");
	}
	
	public static void main(String[] args){
		
	FinalOverride fo = new FinalOverride();
	fo.add();
	
	}
}
