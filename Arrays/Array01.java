class Array01 {
    public static void main(String[] args) {
        // int numbers[] = { 1, 2, 3, 4, 5 };
        int[] numbers = new int[5];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 20;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at Index " + i + " : " + numbers[i]);
        }
    }
}