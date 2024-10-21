public class MathOperations {
    void add(int a, int b) {
        int sum = a + b;
        System.out.println("Sum = " + sum);
    }

    void sub(int a, int b) {
        int diff = a - b;
        System.out.println("Difference = " + diff);
    }

    void mul(int a, int b) {
        int product = a * b;
        System.out.println("Product = " + product);
    }

    void div(int a, int b) {
        // if(b==0){
        // System.out.println("Divide by zero error.");
        // }
        // else{
        float q = (float) a / b;
        System.out.println("Quotient = " + q);
        // }
    }

    public static void main(String[] args) {
        MathOperations m = new MathOperations();
        m.add(2, 8);
        m.sub(9, 4);
        m.mul(3, 7);
        m.div(19, 8);
        // m.div(19, 0);
    }

}
