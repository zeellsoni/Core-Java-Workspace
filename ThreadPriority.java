class X extends Thread {
    int a = 1;

    public void run() {
        System.out.println("Thread X started");
        while (a <= 3) {
            System.out.println("Value: " + a + " in Thread X");
            a++;
        }
        System.out.println("Thread X completed");
    }
}

class Y extends Thread {
    int b = 1;

    public void run(){
        System.out.println("Thread Y started");
        while (b <= 3) {
            System.out.println("Value: " + b + " in Thread Y");
            b++;
        }
        System.out.println("Thread Y completed");
    }
}

class Z extends Thread {
    int c = 1;

    public void run() {
        System.out.println("Thread Z started");
        while (c <= 3) {
            System.out.println("Value: " + c + " in Thread Z");
            c++;
        }
        System.out.println("Thread Z completed");
    }
}

public class ThreadPriority {
    public static void main(String[] args) {
        System.out.println("Main thread");
        X x = new X();
        Y y = new Y();
        Z z = new Z();

        Thread t = Thread.currentThread();
		t.getPriority();
        System.out.println(t.getName());

        t.setPriority(Thread.MAX_PRIORITY);
        y.setPriority(Thread.MIN_PRIORITY);
        z.setPriority(Thread.NORM_PRIORITY);

        x.start();
        y.start();
        z.start();
    }
}