import java.util.HashMap;
import java.util.Map;

public class Salesman extends User {
    public Salesman(int userId, String username, String password, String mail, int phoneNumber) {
        super(userId, username, password, mail, phoneNumber);
    }

    // Salesman salesman = new Salesman(userId, null, null, null, userId);

    @Override
    public void login(String password) {
        if (password.equals(this.password)) {
            System.out.println("Salesman logged in.");
            this.access = true;
        } else {
            System.out.println("Salesman has not logged in.");
        }

    }

    @Override
    public void logout() {
        // if (password == this.password) {
            System.out.println("Salesman logged out.");
        //     this.access = false;
        // } else {
        //     System.out.println("Salesman has not logged out.");
        // }
    }

    public void makeOrder(int orderID, String orderDate, long price,
            Map<Item, Integer> itemList, Database database) {

        // cheking access
        if (!access) {
            System.out.println("Warehouse Worker is not logged in.");
            return;
        }

        Order newOrder = new Order(orderID, orderDate, this.userId, price, itemList);

        // simulates putting order in order database
        database.addOrder(newOrder);
        System.out.println("Order created successfully with ID: " + orderID);

        // Loop through each item in the itemList
        for (Map.Entry<Item, Integer> entry : itemList.entrySet()) {
            Item item = entry.getKey();      // Get the item
            int orderQuantity = entry.getValue(); // Get the quantity ordered

            // Get the current item from the inventory
            Item inventoryItem = database.getItem(item.getItemID());

            if (inventoryItem != null) {
                // Calculate the new stock
                int newStock = inventoryItem.getStock() - orderQuantity;
                if (newStock < 0) {
                    System.out.println("Not enough stock for item: " + item.getName());
                    continue; // Skip updating this item if stock is insufficient
                }
                // Update stock in the inventory
                database.updateStock(item.getItemID(), newStock);
            } else {
                System.out.println("Item with ID " + item.getItemID() + " not found in inventory.");
            }
        }
    }

    @Override
    public void updateDetails(String username, String password, String mail, int phoneNumber) {
        // cheking access
        if (!access) {
            System.out.println("Warehouse Worker is not logged in.");
            return;
        }

        this.username = username;
        this.password = password;
        this.mail = mail;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void readItems(Database database) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readItems'");
    }

    @Override
    public void readOrders(HashMap<Integer, Order> listOfOrders) {
        // cheking access
        if (!access) {
            System.out.println("Warehouse Worker is not logged in.");
            return;
        }

        // Check if the order list is empty
        if (listOfOrders.isEmpty()) {
            System.out.println("No orders available.");
            return;
        }

        // Print out each order in the list
        System.out.println("List of all orders:");
        for (Order order : listOfOrders.values()) {
            System.out.println(order);
        }
    }

}
