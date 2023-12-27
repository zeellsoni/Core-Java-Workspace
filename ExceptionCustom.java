import java.lang.*;

class MyCustomException extends Exception {
    public MyCustomException(String s){
    }
}

public class ExceptionCustom{

	public static void main(String[] args){
		
		//Exception1 a = new Exception1();
		
		one();
		two();
	}
		static void one() throws MyCustomException{
			System.out.println("Hi");
			three();
		}
			
		static void three() throws MyCustomException{
			
			throw new MyCustomException("My Exception...");

		}
		
		static void two(){
			
			System.out.println("Hello");
			
		}
}