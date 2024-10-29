import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<Integer, Item> items = new HashMap<>();
    private int restockThreshold = 5;

    public void addItem(Item item) {
        items.put(item.getItemId(), item);
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
            item.readItemDetails();
        }
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
