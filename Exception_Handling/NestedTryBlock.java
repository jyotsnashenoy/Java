public class NestedTryBlock {
    public static void main(String[] args) {
        try {
            try {
                System.out.println("Going to Divide.");
                int b = 80 / 0;
                System.out.println(b);
            } catch (ArithmeticException e) {
                System.out.println(e);
            }
            try {
                int a[] = new int[5];
                a[5] = 4;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }
            System.out.println("Other Statements.");
        } catch (Exception e) {
            System.out.println("Handled.");
        }
        System.out.println("Normal Flow.");
    }
}
