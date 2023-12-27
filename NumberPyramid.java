import java.util.Scanner;

public class NumberPyramid{

	public static void main(String[] args){
		
		int n,k;
	
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		
		for(int i = 0; i < n; i++){
			
			for(int j = 1; j < n - i ; j++){
				
				System.out.print(" ");
			}
			
			for(k = 0; k <= i; k++){
				System.out.print(k+1);
			}
			
			for(int z = 1; z <= i; z++){
				System.out.print(k+z);
			}
		System.out.println();
		}
		
	}
}
