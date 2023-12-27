class Base
{
    public int f(int i)
    {
		try{
			System.out.print(i/0);
			
		}catch(ArithmeticException e){
		System.out.print("error");}
	return i;
    }
	public int s(int a){
		System.out.print(a);
		return a;
	}
	
    public static void main(String args[])
    {
	Base b = new Base();
	b.f(13);
	b.s(12);
    }
}
