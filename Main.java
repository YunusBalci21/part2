
import java.util.HashMap;
import java.util.Map;

/**
 * This is the main of our software engineering project
 * It's supposed to simulate the usage of the program by:
 * Creating items, adding them to the inventory
 * Creating user accounts and using them to processing orders and items.
 */

public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        Item item1 = new Item(1, "Pan", 4000, 42.00, "This is a good pan", "Supplier A");
        Item item2 = new Item(2, "Pot", 6000, 60.00, "This is some good pot", "Supplier B");
        database.addItem(item1);
        database.addItem(item2);
        database.updateReStock(5);

        Salesman salesman = new Salesman(1, "JohnDoe", "1234", "jane.doe@gmail.com", 42424242);
        WarehouseWorker worker = new WarehouseWorker(2, "JaneDoe", "1234", "jane.doe@gmail.com", 42424242);
        Support support = new Support(3, "SupportUser", "1234", "support@gmail.com", 42424242);
        database.addUser(salesman);
        database.addUser(worker);
        database.addUser(support);

        // Salesman actions
        salesman.login("1234");
        Map<Item, Integer> itemList = new HashMap<>();
        itemList.put(item1, 100);
        itemList.put(item2, 20);
        salesman.readInventory(database);
        salesman.makeOrder(1, "Right now", 1000, itemList, database);
        salesman.readInventory(database);
        salesman.logout();

        // Warehouse Worker actions
        worker.login("1234");
        worker.updateOrder(1, "Packed", database);
        worker.logout();

        // Support actions
        support.login("1234");
        Order order = database.getOrder(1);
        support.updateOrder(1, database, order.getOrderDate(), order.getSalesmanID(), 9999, order.getStatus(), order.getItemList());
        Item item = database.getItem(1);
        support.updateItem(1, database, 100000, item.getName(), item.getPrice(), item.getDescription(), item.getItemOrderHistory(), item.getSupplier(), item.isExpitedItem()); // Update stock
        support.logout();
    }
}
