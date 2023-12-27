import java.util.Scanner;

public class InverseNumberPyramid{

	public static void main(String[] args){
		
		int n,k;
	
		Scanner s = new Scanner(System.in);
		n = s.nextInt();

		for(int i = 1; i < n ; i++){
			
			for(int j = 0; j <i; j++){	
				System.out.print(" ");
			}
			
			for(k = 0; k > n - i; k++){
				System.out.print(k+1);
			}
			
			for(int z = 0; z > n - i; z++){
				System.out.print(z+k);
			}
		}
	}
}