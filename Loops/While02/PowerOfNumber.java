import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int power = 1;

        System.out.print("Enter the Base : ");
        int base = sc.nextInt();

        System.out.print("Enter the exponent : ");
        int exp = sc.nextInt();

        while (i <= exp) {
            power = power * base;
            i++;
        }
        System.out.println("Answer : " + power);
    }
}
