public class Salesman extends User {
    public Salesman(int userId, String username, String password, String mail, int phoneNumber) {
        super(userId, username, password, mail, phoneNumber);
    }

    Salesman salesman = new Salesman(userId, null, null, null, userId);

    @Override
    public void login(Salesman salesman) {
        if (salesman.username && salesman.password != )
        System.out.println("Salesman logged in.");
    }

    @Override
    public void logout() {
        System.out.println("Salesman logged out.");
    }

    public void makeOrder() {
        System.out.println("Order created: ");
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
