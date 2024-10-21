public class Overloading02 {

    int calcutate(int a) {
        return a * a;
    }

    double calcutate(double a) {
        return a * a;
    }

    int calcutate(int a, int b) {
        return a + b;
    }

    double calcutate(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Overloading02 obj = new Overloading02();

        System.out.println("Square of interger: " + obj.calcutate(100));
        System.out.println("Sum of interger: " + obj.calcutate(100, 9));
        System.out.println("Sum of double: " + obj.calcutate(100.9, 14.536));
        System.out.println("Square of double: " + obj.calcutate(100.964));

    }
}
