
public class MultipleCatch {
    public static void main(String[] args) {
        try {
            int[] numbers = { 1, 2, 3 };
            System.out.println(numbers[5]);

            int result = 10 / 0;
            System.out.println(result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bound. " + e.getMessage());
        }

        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero. " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General Exception. " + e.getMessage());
        }
        System.out.println("Program continues after exception handling....");
    }
}
