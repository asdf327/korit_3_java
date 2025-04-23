package ch18_generic.products;

public class ProductsMain {
    public static void main(String[] args) {
        Products<String> products1 = new Products<>("Laptop", "Intel i7, 16GB RAM, 512GB SSD");
        Products<Double> products2 = new Products<>("Smartphone", 799.99);
        Products<Boolean> products3 = new Products<>("Available", true);

        System.out.println(products1);
        System.out.println(products2);
        System.out.println(products3);

    }
}
