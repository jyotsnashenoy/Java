public class Copy {
    String name;
    int age;

    Copy(String Name, int Age) {
        name = Name;
        age = Age;
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }

    Copy(Copy C) {
        String Name = C.name;
        int Age = C.age;
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }

    public static void main(String[] args) {
        Copy C1 = new Copy("Arun", 20);
        Copy C2 = new Copy(C1);
    }
}
