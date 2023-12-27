import java.util.Scanner;

public class Factorial{

	public static void main(String[] args){
		
		int i,n;
		int fact=1;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number");
		n = s.nextInt();
		
		if(n==0){
			System.out.println("1");
		}
		for(i=1;i<=n;i++){
			fact *= i;
		}
		System.out.println(fact);
		
	}
}