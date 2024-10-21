public class StringOperation01 {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "World";
        String c = a + " " + b;
        System.out.println(c);
        System.out.println(c.length());
        System.out.println(c.toUpperCase());
        System.out.println(c.toLowerCase());
        System.out.println(c.indexOf('W'));
        System.out.println(c.substring(6));
        System.out.println(c.substring(6, 11));
        System.out.println(c.replace("World", "Universe"));
        System.out.println(c.charAt(6));
        System.out.println(c.equals("Hello World"));
        System.out.println(c.equalsIgnoreCase("hello world"));
        System.out.println(c.compareTo("Hello World"));
        System.out.println(c.trim());
        System.out.println(c.concat(" Codemithra"));
        System.out.println(c.isEmpty());
        System.out.println(c.getBytes());
        System.out.println(c.repeat(4));
    }
}
