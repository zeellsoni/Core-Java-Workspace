import java.util.Scanner;

public class Fibonacci{

	public static void main(String[] args){
		
		int i, n;
		int a = 0;
		int	b = 0;
		int c = 1;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number");
		n = s.nextInt();
		
		for(i = 1;i <= n; i++){
			
			a = b;
			b = c;
			c = a + b;	
		}
		System.out.println(a);
	}
}