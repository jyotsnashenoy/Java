public class ReturnArray01 {

    int[] arrMethod(int[] arr) {
        return arr;
    }

    public static void main(String[] args) {
        int a[] = { 1, 22, 33, 44 };
        ReturnArray01 s1 = new ReturnArray01();
        int[] Return_arr = s1.arrMethod(a);

        for (int i = 0; i < Return_arr.length; i++) {
            System.out.print(Return_arr[i] + " ");
        }
    }
}
