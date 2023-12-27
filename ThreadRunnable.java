class Ten implements Runnable {
	
	public void run(){
		
		System.out.println("Thread Ten is Running");
		
	}
}

class ThreadRunnable{

	public static void main(String[] args){

		Ten t = new Ten();
		
		t.start();
			
	}
}