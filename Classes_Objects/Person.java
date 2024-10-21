class Person {
    String name;
    String place;

    Person(String n, String p) {
        name = n;
        place = p;
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Place : " + place);
    }

    public static void main(String args[]) {
        Person p1 = new Person("Ramu", "Bangalore");
        p1.display();

        Person p2 = new Person("Raju", "Delhi");
        p2.display();
    }
}