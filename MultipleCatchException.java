import java.io.*;
public class MultipleCatchException{


	public static void main(String[] args){
		
		try{
			FileInputStream f = new FileInputStream("xyzzzzz.txt");

		}
		catch(NullPointerException e){
			System.out.println("NullPointerException is printed");
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBoundsException is printed");		
            System.out.println(e);  
        }
		catch(RuntimeException e){
			System.out.println("RuntimeException is printed");			
            System.out.println(e);  
		}
		catch(Exception e){
			System.out.println("Exception is printed");			
            System.out.println(e);  
		}
		finally{
			System.out.println("This is always printed");
		} 		
	}
}