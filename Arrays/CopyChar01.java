public class CopyChar01 {
    public static void main(String[] args) {
        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };
        char[] copyTo1 = new char[7];
        char[] copyTo2 = { 'a', 'p', 'p', 'l', 'e', 'p', 'i', 'e' };

        System.arraycopy(copyFrom, 2, copyTo1, 0, 7);
        System.out.println(String.valueOf(copyTo1));

        System.arraycopy(copyFrom, 2, copyTo2, 1, 7);
        System.out.println(String.valueOf(copyTo2));
    }
}
