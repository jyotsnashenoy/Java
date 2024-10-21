import java.util.Scanner;

public class Conditions02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        if (num > 0) {
            if (num % 2 == 0) {
                System.out.println("Number is Even.");
            } else {
                System.out.println("Number is Odd.");
            }

        } else if (num < 0) {
            System.out.println("Number is Negative.");
        } else {
            System.out.println("Number is Zero.");
        }
    }
}
