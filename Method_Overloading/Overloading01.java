class Overloading01 {

    void add(int a, int b) {
        System.out.println("Sum of two integers : " + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("Sum of three integers : " + (a + b + c));
    }

    void add(double a, double b) {
        System.out.println("Sum of two doubles : " + (a + b));
    }

    public static void main(String[] args) {
        Overloading01 obj = new Overloading01();
        obj.add(10, 14);
        obj.add(10, 8, 7);
        obj.add(6.03, 3.5326);

    }
}
