import java.util.Scanner;

public class SumOfFactors {
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
    }
}
