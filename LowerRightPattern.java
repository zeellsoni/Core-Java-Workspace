import java.util.Scanner;

public class LowerRightPattern{

	public static void main(String[] args){
		
		int i, n, j;
		Scanner s = new Scanner(System.in);
		//System.out.println("Enter Number");
		n = s.nextInt();
		
		
		for(i = n; i >= 1; --i){
			
			for(j = 1; j <= i ; ++j){
				
				System.out.print("*");
			}
		System.out.println(" ");
		}
		for(i = 0; i < n; i++){
			
			for(j = 0; j <= i ; j++){
				
				System.out.print("*");
			}
		System.out.println(" ");
		}
		
		System.out.println();
	}
}