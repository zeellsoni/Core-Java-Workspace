import java.util.Scanner;

public class NumberPattern{

	public static void main(String[] args){
		
		int n, num;
		
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		num = 1;
		for(int i = 0; i < n; i++){
			
		//num = 1;
			for(int j = 0; j >= i; j++){
				
				System.out.print(num + " ");
				//num++;
			}
		
		//System.out.println(" ");
		num++;
		System.out.println();
		}
		
		
	}
}
			