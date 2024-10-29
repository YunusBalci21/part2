public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Item item1 = new Item(1, "Pan", 3, 25.0);
        Item item2 = new Item(2, "Pot", 2, 40.0);
        inventory.addItem(item1);
        inventory.addItem(item2);

        OrderManager orderManager = new OrderManager();
        Salesman salesman = new Salesman(1, "JohnDoe");
        WarehouseWorker worker = new WarehouseWorker(2, "JaneDoe");
        Support support = new Support(3, "SupportUser");

        SaleOrder order = new SaleOrder(101, "2024-10-30", 100.0, "Pending");

        // Salesman actions
        salesman.login();
        salesman.createOrder(order);
        orderManager.addOrder(order);
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

        // Display all orders
        orderManager.displayOrders();
    }
}
