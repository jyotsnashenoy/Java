import java.util.Scanner;

class While02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int i = 1;
        int count = 0;
        while (i <= num) {
            if (num % i == 0) {
                count++;
            }
            i++;
        }
        if (count == 2) {
            System.out.println(num + " is a Prime Number.");
        } else {
            System.out.println(num + " is Composite Number.");
        }
    }
}