class A implements Runnable {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Hi Everyone");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

class B implements Runnable {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Good Morning");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

public class ThreadExample2 {
    public static void main(String[] args) throws InterruptedException {
        A obj1 = new A();
        B obj2 = new B();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();

    }
}