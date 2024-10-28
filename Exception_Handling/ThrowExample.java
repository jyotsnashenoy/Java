public class ThrowExample {
    static void checkEligibility(int age) {
        if (age < 18) {
            throw new ArithmeticException("Person is not eligibly to vote.");
        } else {
            System.out.println("Person is eligibly to vote.");
        }
    }

    public static void main(String[] args) {
        try {
            checkEligibility(16);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught : " + e.getMessage());
        }
        System.out.println("Program continues after exception handling.");
    }
}
