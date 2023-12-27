import java.util.Scanner;

public class Vowel{

	public static void main(String[] args){
		
		char n;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Character");
		n = s.next().charAt(0);
		
		if(n=='a' || n=='e' || n=='i' || n=='o' || n=='u'){
			
			System.out.println("is a vowel");
		}
		if(n=='A' || n=='E' || n=='I' || n=='O' || n=='U'){
			
			System.out.println("is a vowel");
		}
		else{
			System.out.println("is not a vowel");
		}
	}
}
