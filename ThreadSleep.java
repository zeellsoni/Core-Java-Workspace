class Ten extends Thread {
	
	public void run(){
		
		System.out.println("Thread Ten is Running");
		
	}
}

class One extends Thread {
	
	public void run(){

		//System.out.println("Hello");
		Ten t = new Ten();
		Thread t2 = new Thread(t); 
		t2.start();
		
		System.out.println(t2 + "----->" + t2.getState());
		
		if(t2.getState().equals("TERMINATED")){
			System.out.println("Thread One is Running");
		}
		else {
            try {
				System.out.println("Hie");
                Thread.sleep(1000);
				run();
				
				} catch (InterruptedException e) {
                e.printStackTrace(); }
		}
	}
}

class ThreadSleep{

	public static void main(String[] args){

		//Ten t = new Ten();
		One o = new One();
		
		//t.setPriority(10);
		o.setPriority(1);
		
		t.start();
		o.start();
		
		
	}
}