import java.util.Scanner;

public class PrimeNo{

	public static void main(String[] args){
		
		int n;
		int i;
		int count=0;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number");
		
		n = s.nextInt();
		
		for(i=2;i<n;i++){
			
			if(n%i == 0){
				count++;
				break;
			}
		}
		if(count == 0){
			System.out.println("number is prime");
		}
			
		else{
				System.out.println("number is not prime");
		}
	
	}
}
			
	