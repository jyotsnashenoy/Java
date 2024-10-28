public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int arr[] = { 1, 2, 3, 4, 5 };
            System.out.println(arr[8]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception");
        }
        System.out.println("Program continues....");
    }
}
