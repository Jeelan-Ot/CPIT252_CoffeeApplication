
import java.util.Date;

public class Order {

    private Date orderDate;
    Database connect;

    public Order(Date orderDate, Database connect) {
        this.orderDate = orderDate;
        this.connect = connect;
    }

    public static void buildOrder(Coffee coffee, User user) {

    }

    public static void totalCost(Order order) {

    }

    public static void storeOrder(Order order) {

    }

}
