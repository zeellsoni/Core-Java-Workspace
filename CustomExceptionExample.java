import java.lang.*;

class MyCustomException extends Exception {
    public MyCustomException(String s){
		super(s);
    }
}

class C{
		void add1() throws MyCustomException {
		
		throw new MyCustomException("My Custom Exception");
			
		}
}	

class B extends C{
	
	void add() throws MyCustomException{
			B b = new B();
			b.add1();
		}
}	

public class CustomExceptionExample extends B{

	public static void main(String[] args) throws MyCustomException{
		
		CustomExceptionExample a = new CustomExceptionExample();
		a.add();
	}
}
