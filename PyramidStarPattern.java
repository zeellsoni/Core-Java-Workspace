import java.util.Scanner;

public class PyramidStarPattern{

	public static void main(String[] args){
		
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		
		for(int i = 0; i < n; i++){
			
			for(int j = 1; j < n - i; j++){	
				System.out.print(" ");
			}
			
			for(int k = 1; k <= i; k++){
				System.out.print("*");
			}
			
			for(int z = 1; z <= i; z++){
				System.out.print("*");
			}
		System.out.print("*");
	
		System.out.println();
		}
	}
}