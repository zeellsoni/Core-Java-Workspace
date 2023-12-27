class abc1{
public static void main(String args[])throws ArithmeticException{
B b= new B();
b.x();
}
}

class B{
 void x()throws ArithmeticException{
 C c= new C();
 c.z();
 }
}

class C{
void z()throws ArithmeticException{
	
	System.out.println(10/0);
	throw new ArithmeticException();
}
}