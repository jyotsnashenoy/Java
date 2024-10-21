class Discount {
    String Product_name;
    int Product_id;
    float price = 1000;

    void Discounttt() {
        double Final_price = price - (price * 0.1);
        System.out.println("Final Price = " + Final_price);
    }

    public static void main(String[] args) {
        Discount p = new Discount();
        System.out.println("Original price = " + p.price);
        p.Discounttt();
    }
}
