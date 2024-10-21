public class Copy02 {
    String name;
    int age;

    Copy02(String Name, int Age) {
        name = Name;
        age = Age;
    }

    public static void main(String[] args) {
        Copy02 C1 = new Copy02("Arun", 25);
        Copy02 C2 = new Copy02("Aron", 27);
        System.out.println(C1.name);
        System.out.println(C1.age);
        C2.name = C1.name;
        C2.age = C1.age;
        System.out.println(C2.name);
        System.out.println(C2.age);
    }
}
