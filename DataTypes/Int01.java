public class Int01 {
    static int x = 10;

    public static void main(String[] args) {
        Int01 obj = new Int01();
        Int01 obj1 = new Int01();
        obj.x = x + 1;
        System.out.println(x);
        System.out.println(obj1.x);
    }
}


