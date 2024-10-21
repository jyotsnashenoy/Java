
class Vehicle {
    String company = "Tata";
    String name = "Punch";
    int year = 2023;
    String colour = "Red";
    String engine  = "Petrol";

    void vehicleDetails() {
        System.out.println(company);
        System.out.println(name);
        System.out.println(year);
        System.out.println(colour);
        System.out.println(engine);
    }

    public static void main(String args[]) {
        Vehicle v = new Vehicle();
        v.vehicleDetails();
    }
}
