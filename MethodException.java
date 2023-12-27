class B{
	
	public static void add(){

		try{
			C c = new C();
			c.add1();
		}catch(Exception e){
				System.out.println(e);
		}
		}
}

class C{
	
		public static void add1(){
			
			System.out.println(10/0); 
			throw new ArithmeticException();	
		}
}		

public class MethodException{

	public static void main(String[] args){
		
	B b = new B();
	b.add();
	
	}
}
