import java.util.HashMap;
import java.util.Map;

public class Database {
    final Map<Integer, User> users = new HashMap<>();
    final Map<Integer, Order> orders = new HashMap<>();
    final Map<Integer, Item> items = new HashMap<>();
    private int restockThreshold = 5;

    public void addUser(User user) {
        users.put(user.getUserID(), user);
    }

    public void addOrder(Order order) {
        orders.put(order.getOrderID(), order);
    }

    public Order getOrder(int orderID) {
        return orders.get(orderID);
    }

    public void removeOrder(int orderID) {
        orders.remove(orderID);
    }

    // Imported from inventory:
    public void addItem(Item item) {
        items.put(item.getItemID(), item);
    }

    public Item getItem(int itemID) {
        return items.get(itemID);
    }

    public void removeItem(int itemID) {
        items.remove(itemID);
    }

    public void updateStock(int itemId, int newStock) {
        Item item = items.get(itemId);
        if (item != null) {
            item.updateStock(newStock);
            checkRestock(item);
        }
    }
    
    public void displayInventory() {
        for (Item item : items.values()) {
            item.getItemDetails();
            System.out.println("Item: " + item.getName() + " Antal: " + item.getStock());
        }
    }
    
    public void updateReStock(int restockThreshold) {
        this.restockThreshold = restockThreshold;
    }

    private void checkRestock(Item item) {
        if (item.getStock() < restockThreshold) {
            System.out.println("Restock triggered for item: " + item.getName());
            restockFromSupplier(item);
        }
    }

    private void restockFromSupplier(Item item) {
        System.out.println("Restocking item: " + item.getName() + " from Supplier A or B.");
        item.updateStock(10);  // Simulate restocking with a fixed amount
    }
    
}
