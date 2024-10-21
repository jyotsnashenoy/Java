
class Cricketer {
    String name = "Virat";
    int age = 35;
    String colour = "Brown";
    String role = "Batsman";
    String nationality = "Indian";

    void cricketDetails() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(colour);
        System.out.println(role);
        System.out.println(nationality);
    }

    public static void main(String args[]) {
        System.out.println("Main Method Started");
        Cricketer c = new Cricketer();
        c.cricketDetails();
        System.out.println("Main Method Ended");
    }
}
