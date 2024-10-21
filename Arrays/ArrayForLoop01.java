public class ArrayForLoop01 {
    public static void main(String[] args) {
        int[] scores = new int[10];
        scores = new int[3];
        scores = new int[] { 215, 234, 218, 189, 221, 290 };

        for (int x : scores) {
            System.out.print(x + " ");
        }
        System.out.println("\nLength of Array : " + scores.length);

    }
}
