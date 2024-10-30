class A extends Thread {
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

class B extends Thread {
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

public class ThreadExample1 {
    public static void main(String[] args) throws InterruptedException {
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();

        System.out.println(obj1.getPriority());
        obj1.setPriority(Thread.MAX_PRIORITY);

        obj2.start();

    }
}