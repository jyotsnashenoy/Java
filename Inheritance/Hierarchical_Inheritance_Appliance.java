class Appliance {
    public void appliance() {
        System.out.println("The appliance is running.");
    }
}

class WashingMachine extends Appliance {
    public void washer() {
        System.out.println("The washing machine is washing clothes.");
    }
}

class Refrigerator extends Appliance {
    public void refrigerator() {
        System.out.println("The refrigerator is cooling items.");
    }
}

public class Hierarchical_Inheritance_Appliance {
    public static void main(String[] args) {
        WashingMachine w = new WashingMachine();
        Refrigerator r = new Refrigerator();

        w.appliance();
        w.washer();

        r.appliance();
        r.refrigerator();
    }
}
