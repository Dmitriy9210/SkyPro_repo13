import java.util.Arrays;
import java.util.Objects;

public class Order {

    private String customer;
    private Product[] product;

    public Order(String customer, Product[] product) {
        this.customer = customer;
        this.product = product;
    }

    @Override
    public String toString() {
        return "Клиент " + this.customer + " продукт " + Arrays.toString(product);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(customer, order.customer) && this.product.equals(order.product);
    }
}
