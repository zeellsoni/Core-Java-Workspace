interface A{
	int a = 10;
	void test1(); }
	
interface B{
	int a = 20;
	void test2(); }

interface C extends A,B { //an interface cannot implement an interface 
	void test3(); }
	
class D implements C {

   public void test1() {
      System.out.println("Hello");
	}
	
	public void test2(){
	 System.out.println("Hie");
	}
	
	public void test3(){
	 System.out.println("Hey");
	}
}

public class MultipleInterface{
	
	public static void main(String[] args){
	
	D d = new D();
	d.test1();
	d.test2();
	d.test3();
	}
}
	
	
	