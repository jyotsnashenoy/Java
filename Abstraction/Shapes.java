abstract class Draw {
    abstract void draw();
}

class Rectangle extends Draw {
    void draw() {
        System.out.println("Drawing a Rectangle.");
    }
}

class Circle extends Draw {
    void draw() {
        System.out.println("Drawing a Circle.");
    }
}

class Triangle extends Draw {
    void draw() {
        System.out.println("Drawing a Triangle.");
    }
}

class Shapes {
    public static void main(String[] args) {
        Draw r = new Rectangle();
        r.draw();

        Draw c = new Circle();
        c.draw();

        Draw t = new Triangle();
        t.draw();

    }
}