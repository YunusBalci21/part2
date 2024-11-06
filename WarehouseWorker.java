public class WarehouseWorker extends User {

    public WarehouseWorker(int userId, String username, String password, String mail, int phoneNumber) {
        super(userId, username, password, mail, phoneNumber);
    }

    @Override
    public void login() {
        System.out.println("Warehouse Worker logged in.");
    }

    @Override
    public void logout() {
        System.out.println("Warehouse Worker logged out.");
    }

    public void updateOrder() {
        System.out.println("Order Updated");
    }

    @Override
    public void updateDetails() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateDetails'");
    }

    @Override
    public void readItems() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readItems'");
    }

    @Override
    public void readOrders() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readOrders'");
    }
}
