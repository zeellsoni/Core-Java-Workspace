class Hi extends Thread {
   
    public void run() {
        
		System.out.println("hiiiiiiiiiiiiii");
		}
	public void run(int i){
        
		System.out.println(i + "hi");
		}
}

public class Thread2 {
    public static void main(String[] args){
        Hi h = new Hi();
        h.start(); 
		h.run(123456789);
		System.out.println("hi");
		}
} 
