import java.util.ArrayList;
import java.util.List;

public class OrderManager {
    private List<SaleOrder> orders = new ArrayList<>();

    public void addOrder(SaleOrder order) {
        orders.add(order);
        System.out.println("Order added to OrderManager: " + order);
    }

    public List<SaleOrder> getOrders() {
        return orders;
    }

    public void displayOrders() {
        for (SaleOrder order : orders) {
            System.out.println(order);
        }
    }
}
