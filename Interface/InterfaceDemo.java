interface Animal {
    void sound();

    void sleep();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("The Dog Barks.");
    }

    public void sleep() {
        System.out.println("The Dog is Sleeping.");
    }
}

class Cat implements Animal {
    public void sound() {
        System.out.println("The Cat Meows.");
    }

    public void sleep() {
        System.out.println("The Cat is Sleeping.");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.sound();
        myDog.sleep();

        Animal myCat = new Cat();
        myCat.sound();
        myCat.sleep();
    }
}