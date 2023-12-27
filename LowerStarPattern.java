import java.util.Scanner;

public class LowerStarPattern{

	public static void main(String[] args){
		
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		
		for (int i = 1; i <= n ; i++) {
		
			for (int j = 0; j < n - i; j++){ // spacing
				System.out.print(" ");
			}
			
			for (int k = 1; k < i; k++) { // left side pyramid
				System.out.print("*");
			}
			
			for (int z = 0; z < i; z++) { // right side pyramid
				System.out.print("*");
			}
	
		//System.out.print(" ");
		
		System.out.println();
		}
		for (int i = 1; i <= n - 1; i++){
			
			for(int j = 0; j < i; j++){
				System.out.print(" ");
			}
			
			for(int k = 1; k <= n - i; k++){
				System.out.print("*");
			}	
			for(int z = 1; z < n - i; z++){
				System.out.print("*");
			}
		System.out.println(); //Next line 
		}
	}	
}
