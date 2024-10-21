public class Overload01 {
    Overload01(String name, int age) {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }

    Overload01(String name, int age, String Gender) {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Gender : " + Gender);
    }

    public static void main(String[] args) {
        Overload01 o1 = new Overload01("Arun", 20);
        Overload01 o2 = new Overload01("Aron", 21, "Male");
    }
}
