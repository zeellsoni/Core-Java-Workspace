import java.util.*;

interface person{
}

class Employee implements person {
	
}

public class Student extends Employee implements person{

	public static void main(String[] args){
	
		//List<Student> s = new ArrayList<person>();
		//List<person> s = new ArrayList<Student>();
		//List<person> s = new ArrayList<Employee>();
		//List<Employee> s = new ArrayList<Student>();
		//List<Student> s = new ArrayList<Employee>();
		//List<? extends Employee> s = new ArrayList<Student>();
		List<? extends person> s = new ArrayList<Student>();
		//List<? extends Student> s = new ArrayList<Employee>();

	}
}
