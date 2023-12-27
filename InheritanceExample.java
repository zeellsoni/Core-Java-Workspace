class A{
	
	//public int id = 1;
	public String collegeName = "LJ";
	public String city = "Ahmedabad";
	
	void getCollegeDetail(){
		System.out.println("College Name is: " + collegeName);
		System.out.println("City: " + city);}
}

class B extends A{
	
	private int id = 1;
	private String s_name = "ABC";
	
	void getStudentDetails(){
		System.out.println("Student ID: " + id);
		System.out.println("Student Name: " + s_name);}
}

class C extends A{
	
	private int i = 2;
	private String s1_name = "EFG";
	
	void getStudentDetails1(){
		System.out.println("Student ID: " + i);
		System.out.println("Student Name: " + s1_name);}
}

public class InheritanceExample{

	public static void main(String[] args){
	
	B b = new B();
	b.getStudentDetails();
	b.getCollegeDetail();
	
	C c = new C();
	c.getStudentDetails1();
	c.getCollegeDetail();

	}
	
}
		