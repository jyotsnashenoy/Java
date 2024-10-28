class InvalidAgeException extends Exception {
    public InvalidAgeException(String msg) {
        super(msg);
    }
}

public class SimpleCustomException {
    static void validAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age is less than 18.");
        } else {
            System.out.println("Valid Age : " + age);
        }
    }

    public static void main(String[] args) {
        try {
            validAge(19);
        } catch (InvalidAgeException e) {
            System.out.println("Exception caught : " + e.getMessage());
        }
        System.out.println("Program continues after exception handling.");

    }

}
