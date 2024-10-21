import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        k = k % num;

        if (k == 0) {
            for (int i = 0; i < num; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            for (int i = num - k; i < num; i++) {
                System.out.print(arr[i] + " ");
            }
            for (int i = 0; i < num - k; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
