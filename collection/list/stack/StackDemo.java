import java.io.*;
import java.util.*;

class StackDemo {

	public static void main(String[] args)
	{

		Stack stack1 = new Stack();
		Stack stack2 = new Stack();

		stack1.push("Hello");
		stack1.push("World");
		stack1.push("5");
		stack1.push('x');
		
		System.out.println(stack1);
		
		stack1.pop();
		stack1.pop();
		
		System.out.println(stack1);
		
		stack2.push("Hello");
		stack2.push("World");
		stack2.push("5");
		stack2.push('x');
		
		System.out.println(stack2.peek());

	}
}
