import accesspackage.Test1;

public class Test4 extends Test1 {
    public void print() {
        System.out.println(this.value);
    }
}

public class Main {
    public static void main(String[] args) {
        Test1 t = new Test1();
        System.out.println(t.value);

        // Test2 t2 = new Test2();
        // System.out.println(t2.value);
    }
}
