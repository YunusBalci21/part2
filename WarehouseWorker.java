public class WarehouseWorker extends User {
    public WarehouseWorker(int userId, String username) {
        super(userId, username);
    }

    @Override
    public void login() {
        System.out.println("Warehouse Worker logged in.");
    }

    @Override
    public void logout() {
        System.out.println("Warehouse Worker logged out.");
    }

    public void processOrder(SaleOrder order) {
        order.setStatus("Shipped");
        System.out.println("Order processed and shipped: " + order);
    }
}
