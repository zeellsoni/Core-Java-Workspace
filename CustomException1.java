import java.lang.*;

class B{
	
	public static void add() throws Exception{

			C c = new C();
			c.add1();
		}
}

class C extends Exception{
	
		public static void add1() throws Exception{
			
			throw new Exception("Custom Exception Defined");
		}
}		

public class CustomException1{

	public static void main(String[] args) throws Exception{
		
	B b = new B();
	b.add();
	
	}
}
