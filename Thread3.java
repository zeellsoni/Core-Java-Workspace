public class Hi extends Thread {
    public static void Hi() {
        System.out.println("Hi");
    }
	
    public void run() {
        sayHi();
    }
}

public class Hello extends Thread {
    public static void sayHello() {
        System.out.println("Hello");
    }
	
    public void run() {
        sayHello();
    }
}

public class Thread3{
    public static void main(String[] args) {
        Hi.sayHi(); 

        Hello.sayHello(); 

        Hi h = new Hi();
        h.start();

        Hello t1 = new Hello();
        t1.start();
    }
}
