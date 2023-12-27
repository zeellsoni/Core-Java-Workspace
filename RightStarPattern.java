import java.util.Scanner;

public class RightStarPattern{

	public static void main(String[] args){
		
		int i, n, j;
		Scanner s = new Scanner(System.in);
		//System.out.println("Enter Number");
		n = s.nextInt();
		
		for(i = n; i >= 0; i--){
			
			for(j = i; j >= 0; j--){ 
				
				System.out.print("* ");
			}
			
			System.out.println(" ");
	
		}
		for(i = n; i > 0; i--){ //for outer loop starting from n
			
			for(j = n; j >= i ; j--){ //for inner loop 
				
				System.out.print("* ");
			}
			
			System.out.println(" ");

		}
		System.out.println();
	}
}


