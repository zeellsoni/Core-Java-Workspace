public class Exception1{

	public static void main(String[] args){
		
		//Exception1 a = new Exception1();
		
		one();
		two();
	}
		static void one(){
			System.out.println("Hi");
			three();
		}
			
		static void three(){
			
			throw new ArithmeticException();
			System.out.println(10/0);
		}
		
		
		
		static void two(){
			
			System.out.println("Hello");
			
		}
}