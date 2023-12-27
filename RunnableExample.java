public class RunnableExample implements Runnable{
	public void run(){
		System.out.println(
			"Thread is created and running successfully...");
	}
	public static void main(String[] args){
		Runnable r1 = new RunnableExample();
		Thread t1 = new Thread(r1, "My Thread");
		
		t1.start();
		
		String str = t1.getName();
		System.out.println(str);
		
		for (int i=0; i<10; i++) {
			System.out.println(i);
		}
	}
}
