import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Support extends User {
	public Support(int userId, String username, String password, String mail, int phoneNumber) {
		super(userId, username, password, mail, phoneNumber);
	}

	@Override
    public void login(String password) {
        if (password.equals(this.password)) {
            System.out.println("Support logged in.");
            this.access = true;
        } else {
            System.out.println("Support has not logged in.");
        }
    }

    @Override
    public void logout() {
            System.out.println("Support logged out.");
    }

	// public enum Role {
	// SUPPORT,
	// SALESMAN,
	// WAREHOUSEWORKER;
	// }
	// todo inplement enum
	// Yannick: Should this be done?
	public void createUser(String role, int userId, String username, String password, String mail, int phoneNumber) {

		// cheking access
		// Yannick: What????
		if (!access) {
			System.out.println("Warehouse Worker is not logged in.");
			return;
		}

		User new_user = null;

		new_user = switch (role) {
			case "Support" -> new Support(userId, username, password, mail, phoneNumber);
			case "WareHouseWorker" -> new WarehouseWorker(userId, username, password, mail, phoneNumber);
			default -> new Salesman(userId, username, password, mail, phoneNumber);
		};

		if (new_user != null) {
			userDatabase.put(userId, new_user);
			System.out.println("Create a new user successfully with the role of: " + role);
		}

		// todo add new_user to database. Add User hashmap, switchcase
		// Yannick: Done?
	}

	public void updateUser(User user, String username, String password, String mail, int phoneNumber) {

		// cheking access
		if (!access) {
			System.out.println("Warehouse Worker is not logged in.");
			return;
		}

		User userToUpdate = userDatabase.get(userId);

		if (userToUpdate != null) {
			userToUpdate.updateDetails(username, password, mail, phoneNumber);
			System.out.println("Updated User ID: " + userId + " succesfully");
		} else {
			System.out.println("Something went wrong while updating User ");
		}

	}

	public void deleteUser() {
		// cheking access
		if (!access) {
			System.out.println("Warehouse Worker is not logged in.");
			return;
		}

		if (userDatabase.remove(userId) != null) {
			System.out.println("Removed User ID: " + userId + " succesfully");
		} else {
			System.out.println("Something went wrong while removing User ");
		}

		// todo remuve from database
		// TODO Auto-generated method stub

	}

	public void updateOrder(int orderID, Database database, String orderDate, int salesmanID, double price, String status,
			Map<Item, Integer> itemList) {
		// cheking access
		if (!access) {
			System.out.println("Warehouse Worker is not logged in.");
			return;
		}

		Order order = database.getOrder(orderID);
		order.setAllFields(orderDate, salesmanID, price, status, itemList);
		database.removeOrder(orderID);
		database.addOrder(order);
	}

	public void createItem(int itemID, String name, int stock, double price, String description, String supplier) {

		// cheking access
		if (!access) {
			System.out.println("Warehouse Worker is not logged in.");
			return;
		}

		Item new_item = new Item(itemID, name, stock, price, description, supplier);
		// todo add new_item
	}

	public void updateItem(int itemID, Database database, int stock, String name, double price, String description,
			ArrayList<Order> itemOrderHistory, String supplier, boolean expitedItem) {

		// cheking access
		if (!access) {
			System.out.println("Warehouse Worker is not logged in.");
			return;
		}
		
		Item item = database.getItem(itemID);
		item.setAllFields(stock, name, price, description, itemOrderHistory, supplier, expitedItem);
		database.removeItem(itemID);
		database.addItem(item);
	}

	public ShopInfo createShopInfo(String shopName, String address, String managerName, int managerPhone,
			String managerMail) {
		// cheking access
		if (!access) {
			System.out.println("Warehouse Worker is not logged in.");
			return null;
		}
		return new ShopInfo(shopName, address, managerName, managerPhone, managerMail);
	}

	public void updateShopInfo(ShopInfo shopInfo, String shopName, String address, String managerName, int managerPhone,
			String managerMail) {

		// cheking access
		if (!access) {
			System.out.println("Warehouse Worker is not logged in.");
			return;
		}

		shopInfo.setShopInfo(shopName, address, managerName, managerPhone, managerMail);
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
