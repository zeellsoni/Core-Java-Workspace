class A{
	
	public int s(int a){
		System.out.println(a);
		return a;}
}
public class MethodOverload extends A{

	public int s(int a){
		System.out.println(35);
		return 1;}

	/*public int s(int a, int b){
		System.out.println(a);
		System.out.println(b); }
		
	public int s(int a, int b, int c){
		System.out.println(a);
		System.out.println(b);
		System.out.println(c); }  */

public static void main(String[] args){
	
	a.s(21345);
	MethodOverload a = new MethodOverload();
	//a.s(2,4);
	//a.s(1,2,4);
	}
} 

