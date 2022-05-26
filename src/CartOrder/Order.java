package CartOrder;

public class Order {

    private ShoppingCart cart = new ShoppingCart();
    private static Order order = new Order();

    private Order() {

    }

    public static Order getOrder() {
        return order;
    }

    public ShoppingCart getCart() {
        return cart;
    }

}




