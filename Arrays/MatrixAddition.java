public class MatrixAddition {
    public static void main(String[] args) {
        int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 5, 1, 2 } };
        int[][] b = { { 5, 4, 3 }, { 0, 6, 2 }, { 10, 8, 4 } };
        int[][] c = new int[3][3];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.print(c[i][j] + "  ");
            }
            System.out.println();
        }
    }

}
