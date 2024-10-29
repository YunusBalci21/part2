public class Support extends User {
    public Support(int userId, String username) {
        super(userId, username);
    }

    @Override
    public void login() {
        System.out.println("Support logged in.");
    }

    @Override
    public void logout() {
        System.out.println("Support logged out.");
    }

    public void modifyOrder(SaleOrder order, String newStatus) {
        order.setStatus(newStatus);
        System.out.println("Order status updated to " + newStatus);
    }

    public void updateStock(Inventory inventory, int itemId, int newStock) {
        inventory.updateStock(itemId, newStock);
    }
}
