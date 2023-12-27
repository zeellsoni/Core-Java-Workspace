import java.io.*;

class Thread1 extends Thread {

	// run() method for Thread1
	public void run()
	{
		// Display message only when thread1 starts
		System.out.println("Thread 1 started ");

		// Iterations
		for (int i = 101; i < 200; i++)
			System.out.print(i + " ");

		// Display message only when thread1 ended
		System.out.println("\nThread 1 completed");
	}
}

// Class 2
// Helper Class (extending main Thread class)
// Defining Thread2
class Thread2 extends Thread {

	// run() method for Thread 2
	public void run()
	{

		// Display message only when thread 2 starts
		System.out.println("Thread 2 started ");

		// Iterations
		for (int i = 201; i < 300; i++)
			System.out.print(i + " ");

		// Display message only when thread 2 ended
		System.out.println("\nThread 2 completed");
	}
}

// Class 3
// Helper Class (extending main Thread class)
// Defining Thread3
class Thread3 extends Thread {

	// run() method for Thread 3
	public void run()
	{

		// Display message only when thread 3 starts
		System.out.println("Thread 3 started ");

		// Iterations
		for (int i = 301; i < 400; i++)
			System.out.print(i + " ");

		// Display message only when thread 3 starts
		System.out.println("\nThread 3 completed");
	}
}

// Class 4
// Main Class
class RunnableThread {

	// Main driver method
	public static void main(String[] args)
	{

		// Try block to check for exceptions
		try {

			// Creating object of each of the threads
			// defined
			Thread1 thread1 = new Thread1();
			Thread2 thread2 = new Thread2();
			Thread3 thread3 = new Thread3();

			// Instructing thread to start the execution
			// using the start() method
			thread1.start();
			thread2.start();
			thread3.start();
		}

		// Catch block to handle the exceptions
		catch (Exception e) {

			// Print the line number where exception
			// occurred
			e.printStackTrace();
		}
	}
}
