class Operator01 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = 30;
        // System.out.println(x);
        x = (++x + y--) * z++;
        System.out.println(y);
        System.out.println(z);
        System.out.println(x);
    }
}
