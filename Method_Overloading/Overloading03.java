public class Overloading03 {

    void display(int num) {
        System.out.println("Displaying Interger : " + num);
    }

    void display(double num) {
        System.out.println("Displaying Double : " + num);
    }

    void display(String str) {
        System.out.println("Displaying String : " + str);
    }

    void display(int num, String str) {
        System.out.println("Displaying Interger : " + num + " and Displaying String : " + str);
    }

    public static void main(String[] args) {
        Overloading03 obj = new Overloading03();
        obj.display(65);
        obj.display(76.965);
        obj.display("Banana");
        obj.display(65, "Apple");

    }
}
