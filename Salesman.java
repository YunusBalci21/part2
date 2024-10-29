public class Salesman extends User {
    public Salesman(int userId, String username) {
        super(userId, username);
    }

    @Override
    public void login() {
        System.out.println("Salesman logged in.");
    }

    @Override
    public void logout() {
        System.out.println("Salesman logged out.");
    }

    public void createOrder(SaleOrder order) {
        System.out.println("Order created: " + order);
    }

    public void viewInventory(Inventory inventory) {
        inventory.displayInventory();
    }
}
