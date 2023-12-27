package p;

public class AccessModifier {

	protected void s(){

		int a = 5;
		System.out.println(a);
	}

	public static void main(String[] args){

	AccessModifier a1 = new AccessModifier();
	a1.s();
	
	}
}	