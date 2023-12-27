class A{
	
	//public int id = 1;
	//public String collegeName = "LJ";
	//public String city = "Ahmedabad";
	
	public void parentDetail(){
		System.out.println("parent class: overriden");}

}
class B extends A{
	public void childDetail(){
		System.out.println("child class: overriding");}
		
}

public class Polymorphism{
		
	public static void main(String[] args){
	
	B b = new B();
	b.childDetail();
	
	A a = new B();
	a.parentDetail();
	
	}
}



	