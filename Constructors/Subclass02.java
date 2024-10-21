public class Subclass02 {
    Subclass02(String company, String name, int year) {
        System.out.println("Company : " + company);
        System.out.println("Name : " + name);
        System.out.println("Year : " + year);
    }

    public static void main(String[] args) {
        Subclass02 s1 = new Subclass02("Tata", "Nexon", 2023);

    }
}
