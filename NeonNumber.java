import java.util.Scanner;

public class NeonNumber{

	public static void main(String[] args){
		
		int n, sum=0;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number");
		n = s.nextInt();
		
		int sq = n*n;
		
		while(sq!=0){
			int num = sq%10;
			sum += num;
			sq /= 10;
		}
		
		if(n == sum)
			System.out.println("is Neon Number");
		else
			System.out.println("not a Neon Number");
	}
}
