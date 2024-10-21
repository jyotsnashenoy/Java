import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int sum = 0;
        int i = 1;
        while (i <= num) {
            if (num % i == 0) {
                sum = sum + i;

            }
            i++;
        }
        System.out.println("Sum of Factors : " + sum);
        if (sum / 2 == num) {
            System.out.println(num + " is a Perfect Number.");
        } else {
            System.out.println(num + " is not a Perfect Number.");
        }
    }
}
