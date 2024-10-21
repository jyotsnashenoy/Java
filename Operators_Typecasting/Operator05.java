public class Operator05 {
    public static void main(String[] args) {
        int x = 6;
        int y = ~x;
        System.out.println(y);
        int z;
        z = x > y ? x : y;
        System.out.println(z);
    }
}
