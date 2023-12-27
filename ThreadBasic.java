/*public class ThreadBasic extends Thread{
	public void run()
    {
        
    }

    public static void main(String[] args){
		
        ThreadBasic t = new ThreadBasic();
		t.start();
	
	   }
} 
public class ThreadBasic extends Thread{
	public void run()
    {
        System.out.println("Hi");
    }

    public static void main(String[] args){
		
        ThreadBasic t = new ThreadBasic();
		t.run();
	
	   }
} */
public class ThreadBasic extends Thread{
	public void start()
    {
        System.out.println("Hi");
    }

    public static void main(String[] args){
		
        ThreadBasic t = new ThreadBasic();
		t.start();
	
	   }
}



	


	