public class StringBuffer01 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Ethnus");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.append("Codemithra");
        System.out.println(sb);

        String str = sb.toString();
        System.out.println("str = " + str);

        System.out.println(sb.deleteCharAt(3)); // n
        // System.out.println(sb.insert(0, "Java"));
        System.out.println(sb.insert(5, "Java"));

    }
}
