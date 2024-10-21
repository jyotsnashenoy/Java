class Parent {
    void showMessage() {
        System.out.println("Message from Parent class.");
    }

}

class Child extends Parent {
    @Override
    void showMessage() {
        System.out.println("Message from Child class.");
    }

}

class Overriding01 {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.showMessage();
        Child c = new Child();
        c.showMessage();
    }
}