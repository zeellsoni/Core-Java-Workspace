class Thread1 extends Thread {
	
	public void run(){
		
		System.out.println("Thread started and in running state");
	
		for (int i = 0; i < 10; i++)
			System.out.println(i);
		
		System.out.println("Thread completed");
		System.out.println("Current state of the thread - " + Thread.currentThread().getState());
		
		//System.out.println(thread1.isAlive());

	}
}

class ThreadStages{

	public static void main(String[] args){

			Thread1 thread1 = new Thread1();
			System.out.println(thread1.isAlive());
			System.out.println("State of the thread - " + thread1.getState());
			thread1.start();
			System.out.println("State of the thread - " + thread1.getState());
			System.out.println(thread1.isAlive());
			//thread1.pause();
			//thread1.resume();
			try {    
            thread1.join();    
			}
			catch(Exception e){
				System.out.println(e);
			}    
				
			System.out.println("State of the thread - " + thread1.getState());
			//Thread1 thread2 = new Thread1();
			
			//thread2.start();
			//System.out.println(thread2.isAlive()); 

		}
	}

