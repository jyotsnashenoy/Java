public class MaxElement {
    public static void main(String[] args) {
        int[] numbers = { 20, 89, 50, 27, 22 };
        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Maximum Element is " + max);
        System.out.println("Minimum Element is " + min);
    }
}
