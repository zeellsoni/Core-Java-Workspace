import java.util.Scanner;

public class DiamondPattern{

	public static void main(String[] args){
		
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		
		for(int i = 1; i <= n-1; i++){
			
			for(int j = 1; j < n - i; j++){	
				System.out.print(" ");
			}
			
			for(int k = 1; k <= i; k++){
				System.out.print("*");
			}
			
			for(int z = 1; z <= i; z++){
				System.out.print("*");
			}
		System.out.println(" ");
		}
		for(int i = 1; i <= n-1; i++){
			
			for(int j = 0; j < i; j++){	
				System.out.print(" ");
			}
			
			for(int k = n - 1; k > i ; k--){
				System.out.print("*");
			}
			
			for(int z = n - 1; z > i ; z--){
				System.out.print("*");
			}
			
		System.out.print(" ");
		
		System.out.println();
		}
	}
}