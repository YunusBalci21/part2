import java.util.ArrayList;
import java.util.HashMap;

public class Salesman extends User {
    public Salesman(int userId, String username, String password, String mail, int phoneNumber) {
        super(userId, username, password, mail, phoneNumber);
    }

    Salesman salesman = new Salesman(userId, null, null, null, userId);

    @Override
    public void login(String password) {
        if (password == this.password) {
            System.out.println("Salesman logged in.");
            this.access = true;
        } else {
            System.out.println("Salesman has not logged in.");
        }

    }

    @Override
    public void logout(String password) {
        if (password == this.password) {
            System.out.println("Salesman logged out.");
            this.access = false;
        } else {
            System.out.println("Salesman has not logged out.");
        }
    }

    public void makeOrder(int orderID, String orderDate, int salesmanID, long price,
            ArrayList<Item> itemList, HashMap<Integer, Order> listOfOrders) {

        // cheking access
        if (!access) {
            System.out.println("Warehouse Worker is not logged in.");
            return;
        }

        Order newOrder = new Order(orderID, orderDate, salesmanID, price, itemList);

        // simulates putting order in order database
        listOfOrders.put(orderID, newOrder);
        System.out.println("Order created successfully with ID: " + orderID);

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
    public void readItems() {
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
