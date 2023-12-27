
class Student {
	int id;
	String studentName = "abc";
	
	public String toString() {
		return "student:{name: " + this.studentName + "}";
	}
}

public class StudentToStringMethod {
	public static void main(String[] args){
		
		Student s = new Student();
		s.studentName = "zeel";
		System.out.println(s);
	}
}
