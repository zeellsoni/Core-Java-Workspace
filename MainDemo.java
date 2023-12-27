class A{
	String b;
	A(){
		System.out.println(this.hashCode());
		}
	A(String a){
		this.b = a;
		System.out.println(a); }
	}
class B extends A{
	
	B(){
		
		System.out.println(this.hashCode());
		System.out.println(b);
		super("zeel");
		}
	}
	
public class MainDemo{
	public static void main(String[] args){
		
		B b = new B();
		System.out.println(b.hashCode());
	}
	}