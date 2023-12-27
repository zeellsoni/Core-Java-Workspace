interface myInterface{
	int a = 20;
	String write(String txt);
}

public class InterfaceExample implements myInterface{
	
	public void write(String txt){		
		System.out.println(txt); }
	

public static void main(String[] args){
	
	InterfaceExample a = new InterfaceExample();
	a.write("Hello");
	}
}
/*
import java.util.*;

interface Sample1 { 
      default void sum(int x,int y) { 
            System.out.println("Sum 1 is = "+ (x+y)); 
      } 
}

interface Sample2 { 
      default void sum(int x,int y) { 
            System.out.println("Sum 2 is = "+ (x+y)); 
      } 
}

 class InterfaceExample implements Sample1, Sample2{
      @Override
      public void sum(int x,int y) { 
            System.out.println("Sum is = "+ (x+y)); 
      }
      public static void main(String args[]){
            InterfaceExample obj = new InterfaceExample();
            obj.sum(18,92);
      }
} */