import java.util.Scanner;

class Scanner01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hi");

        System.out.print("Enter your Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Location : ");
        String location = sc.nextLine();

        System.out.print("Enter your Course : ");
        String course = sc.nextLine();

        System.out.print("Enter Course Fee : ");
        int fee = sc.nextInt();

        System.out.print("Enter marks of Subject1 : ");
        float m1 = sc.nextFloat();
        System.out.print("Enter marks of Subject2 : ");
        float m2 = sc.nextFloat();
        float total = m1 + m2;

        System.out.println("Your name is " + name);
        System.out.println("Location : " + location);
        System.out.println("Your are learning " + course);
        System.out.println("Your Course Fee is " + fee);
        System.out.println("Marks : " + total);

        sc.close();
    }
}