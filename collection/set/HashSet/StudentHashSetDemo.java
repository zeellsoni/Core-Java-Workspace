import java.util.*;

class Student{
	
	int id;
	String name;
	
	Student(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Student that = (Student) o;
		return this.id == that.id && this.name.equals(that.name) &&
					Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	} 
	
	@Override
	public String toString() {
		return "{ id: " + this.id + " , name: " + this.name + " }";
	}
	
}
public class StudentHashSetDemo{

	public static void main(String[] args){
	
		HashSet h = new HashSet();
		
		h.add(new Student(1,"zeel"));
		
		System.out.println(h.add(new Student(1,"zeel")));
		
		System.out.println(h + " : " + h.size());
		
	}
}