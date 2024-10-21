class Vehicle {
    void car(String company, String name) {
        System.out.println("Company : " + company + "\nName : " + name);

    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        v1.car("Tata", "Nexon");
    }

}