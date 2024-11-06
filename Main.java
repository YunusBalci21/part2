
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Item item1 = new Item(1, "Pan", 4000, 42.00, "This is a good pan", new ArrayList<Order>(), "Supplier A");
        Item item2 = new Item(2, "Pot", 6000, 60.00, "This is some good pot", new ArrayList<Order>(), "Supplier B");
        inventory.addItem(item1);
        inventory.addItem(item2);

        Salesman salesman = new Salesman(1, "JohnDoe");
        WarehouseWorker worker = new WarehouseWorker(2, "JaneDoe");
        Support support = new Support(3, "SupportUser");

        // Salesman actions
        salesman.login();
        salesman.createOrder(order);
        salesman.viewInventory(inventory);
        salesman.logout();

        // Warehouse Worker actions
        worker.login();
        worker.processOrder(order);
        worker.logout();

        // Support actions
        support.login();
        support.modifyOrder(order, "Canceled");
        support.updateStock(inventory, 1, 4);
        support.logout();
    }
}
