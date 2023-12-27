class Ten extends Thread {
	
	public void run(){
		
		//for (int i = 0; i < 10; i++)
			//System.out.println(i);
		
		System.out.println("Thread Ten is Running");
		
	System.out.println("Current state of the thread - " + Thread.currentThread().getState());

	//System.out.println("Priority of Thread Ten: "+Thread.currentThread().getPriority());
	}
}

class One extends Thread{
	
	public void run(){
		System.out.println("Started Thread One " + Thread.currentThread());
		Thread.yield();
		
		//for (int i = -10; i < 0; i++)
			//System.out.println(i);
		
		System.out.println("Thread One is Running");
		System.out.println("Ended Thread One " + Thread.currentThread());
		
	//System.out.println("Priority of Thread One: "+Thread.currentThread().getPriority());
	}
}

class Thread4{

	public static void main(String[] args){

		Ten t = new Ten();
		One o = new One();
		
		t.setPriority(10);
		o.setPriority(1);
		
		o.start();
		t.start();
		
	}
}