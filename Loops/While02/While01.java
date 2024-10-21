import java.util.Scanner;

class While01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int i = 1;
        int count = 0;
        System.out.println("Factors of 12 : ");
        while (i <= num) {
            if (num % i == 0) {
                System.out.println(i);
                count++;
            }
            i++;
        }
        System.out.println("Number of Factors : " + count);
    }
}