public class Method01 {
    static void myMethod1(String name, int age) {
        System.out.println("Static Method Executed.");
        System.out.println("Name : " + name + "\nAge : " + age);
    }

    void myMethod2(String address) {
        System.out.println("Method Executed.");
        System.out.println("Address : " + address);
    }

    public static void main(String[] args) {
        myMethod1("Jyotsna", 22);
        Method01 m1 = new Method01();
        m1.myMethod2("Jayanagar");
    }
}