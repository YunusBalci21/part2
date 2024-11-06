/**
 * This is the main of our software engineering project
 * It's supposed to simulate the usage of the program by:
 * Creating items, adding them to the inventory
 * Creating user accounts and using them to processing orders and items.
 */

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Item item1 = new Item(1, "Pan", 4000, 42.00, "This is a good pan", "Supplier A");
        Item item2 = new Item(2, "Pot", 6000, 60.00, "This is some good pot", "Supplier B");
        inventory.addItem(item1);
        inventory.addItem(item2);
        inventory.updateReStock(5);

        Salesman salesman = new Salesman(1, "JohnDoe", "1234", "jane.doe@gmail.com", 42424242);
        WarehouseWorker worker = new WarehouseWorker(2, "JaneDoe", "1234", "jane.doe@gmail.com", 42424242);
        Support support = new Support(3, "SupportUser", "1234", "support@gmail.com", 42424242);
        
        // Salesman actions
        salesman.login();
        salesman.makeOrder(Order);
        salesman.viewInventory(inventory);
        salesman.logout();

        // Warehouse Worker actions
        worker.login();
        worker.processOrder(orderID);
        worker.logout();

        // Support actions
        support.login();
        support.modifyOrder(orderID, "Canceled");
        support.updateItem(Item); // Update stock
        support.logout();
        
    }
}
