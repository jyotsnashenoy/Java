public class Overloading04 {

    void Student(String name, int num) {
        System.out.println("Name is " + name + " and Roll No. is " + num);
    }

    void Student(String name, int num, String place) {
        System.out.println("Name is " + name + " , Roll No. is " + num + " and Place is " + place);
    }

    public static void main(String[] args) {
        Overloading04 obj = new Overloading04();
        obj.Student("Jyotsna", 184);
        obj.Student("Veena", 193, "Bangalore");
    }
}
