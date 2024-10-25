interface Vehicle {
    void start();
}

interface Electric {
    void charge();
}

class ElectricCar implements Vehicle, Electric {
    public void start() {
        System.out.println("The Electric Car is starting.");
    }

    public void charge() {
        System.out.println("The Electric Car is charging.");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        ElectricCar myCar = new ElectricCar();
        myCar.start();
        myCar.charge();
    }
}
