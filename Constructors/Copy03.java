public class Copy03 {
    String Name;
    int Age;

    Copy03(String Name, int Age) {
        this.Name = Name;
        this.Age = Age;
    }

    public static void main(String[] args) {
        Copy03 C1 = new Copy03("Arun", 23);
        System.out.println(C1.Name);
        System.out.println(C1.Age);
    }
}
