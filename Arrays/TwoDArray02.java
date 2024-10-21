public class TwoDArray02 {
    public static void main(String[] args) {
        String[][] str = {
                { "A", "B", "C" },
                { "D", "E", "F" },
                { "G", "H", "I" },
                { "J", "k", "L" }
        };

        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length; j++) {
                System.out.print(str[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println(str.length);
    }
}
