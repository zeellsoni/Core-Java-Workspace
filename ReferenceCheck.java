class Student {
	int id;
	String name;
	
	Student(int id, String name) {		
		this.id = id;
		this.name = name;
	}
	
	void print() {
		System.out.println("id : " + this.id + " name: " + name);
	}
}

class ReferenceCheck {
	
	public static void main (String[] args) {
	
		Student s = new Student(1, "zeel");
		Student s2 = s;
		s.name = "zeel 1";
		s.print();
		s2.print();
		Student s3 = new Student(2, "vatsal");
		s3.print();
	}
}