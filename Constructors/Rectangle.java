public class Rectangle {
    int length;
    int width;

    Rectangle(int l, int w) {
        length = l;
        width = w;
    }

    void Area() {
        int area = length * width;
        System.out.println("Area = " + area);
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(3, 7);
        r.Area();
    }
}
