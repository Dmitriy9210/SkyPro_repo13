public class Main {

    public static void main(String[] args) {

        Product product = new Product(1, "Table", 300, "Dom");
        Product product2 = new Product(1, "Table", 301, "Dom");
        Product product3 = new Product(3, "Chair", 30, "Dom");
        Product product4 = new Product(4, "Glass", 30, "Kitten");

        System.out.println("product.equals(product2) = " + product.equals(product2));
        System.out.println("product2.equals(product3) = " + product2.equals(product3));
        System.out.println("product3.equals(product4) = " + product3.equals(product4));

        System.out.println(product);
        System.out.println(product2);
        System.out.println(product3);
        System.out.println(product4);
        System.out.println("_________________________");

        Product[] products = {product, product2, product3, product4};
        Product[] products2 = {product, product3, product4, product};
        Order order = new Order("Клиент1", products);
        Order order2 = new Order("Клиент1", products);
        Order order3 = new Order("Клиент1", products2);
        System.out.println(order.equals(order2));
        System.out.println(order.equals(order3));

        System.out.println(order);
        System.out.println(order2);
        System.out.println(order3);
    }
}
