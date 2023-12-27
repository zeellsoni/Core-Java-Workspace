import java.util.Scanner;

public class Armstrongnum{

	public static void main(String[] args){
		
		int n, num, 
		int result = 0;
		int	remainder;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number");
		num = s.nextInt();
		n = num;
		
		while(n!=0){
			
			remainder = n%10;
			result += Math.pow(remainder,3);
			n /= 10;
		}
		
		if(result == num)
			System.out.println("is Armstrong");
		
		else
			System.out.println("not Armstrong");
		
	}
}
