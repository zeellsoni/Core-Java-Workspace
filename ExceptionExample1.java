public class ExceptionExample1{
	
	public void one(){
			System.out.println("Hi");
			three();
		}
			
	public void three(){
			
			try{
				System.out.println(10/0); 
			}
			//catch(Exception e){
			//	System.out.println(e);
			//}
			finally{
			System.out.println("Releasing resources");
			}
		}
	public void two(){
			System.out.println("Hello");
			
		}

	public static void main(String[] args){
		
		ExceptionExample1 a = new ExceptionExample1();
		
		a.one();
		a.two();
		
	}
}