import java.util.Scanner;

public class ReverseNumberPattern{

	public static void main(String[] args){
		
		int n, num;
	
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		
		for(int i = 1; i <= n; i++){
		
			for(int j = i; j > 0 ; j--){
				
				System.out.print(j + " ");
			}
		//num++;
		//System.out.println(" ");
		
		System.out.println();
		}
	}
}
