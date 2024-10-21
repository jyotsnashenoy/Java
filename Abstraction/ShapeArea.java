abstract class Area {
    abstract int area();

    int dim1, dim2;
}

class Rectangle extends Area {
    Rectangle(int l, int b) {
        dim1 = l;
        dim2 = b;
    }

    int area() {
        int a = dim1 * dim2;
        System.out.println("Rectangle area: " + a);
        return a;
    }
}

class Square extends Area {
    Square(int l) {
        dim1 = l;
    }

    int area() {
        int a = dim1 * dim1;
        System.out.println("Square area: " + a);
        return a;
    }
}

class Triangle extends Area {
    Triangle(int h, int b) {
        dim1 = h;
        dim2 = b;
    }

    int area() {
        int a = (int) (0.5 * dim1 * dim2);
        System.out.println("Triangle area: " + a);
        return a;
    }
}

public class ShapeArea {
    public static void main(String[] args) {
        Area r = new Rectangle(10, 20);
        r.area();

        Area s = new Square(15);
        s.area();

        Area t = new Triangle(10, 5);
        t.area();
    }
}
