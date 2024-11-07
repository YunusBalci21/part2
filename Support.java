import java.util.ArrayList;
import java.util.HashMap;

public class Support extends User {
    public Support(int userId, String username, String password, String mail, int phoneNumber) {
        super(userId, username, password, mail, phoneNumber);
    }


	// public enum Role {
	// 	SUPPORT,
	// 	SALESMAN,
	// 	WAREHOUSEWORKER;
	// }
	//todo inplement enum
    public void createUser(String role, int userId, String username, String password, String mail, int phoneNumber) {

		//cheking acsses
		if (!acsses) {
			System.out.println("Warehouse Worker is not logged in.");
			return;
		}
       
		if (role == "Support") {
			Support new_user = new Support(userId, username, password, mail, phoneNumber);
		} 
		if (role == "WarehouseWorker") {
			WarehouseWorker new_user = new WarehouseWorker(userId, username, password, mail, phoneNumber);
		}
		else {
			Salesman new_user = new Salesman(userId, username, password, mail, phoneNumber);
		}

		//todo add new_user to database.
    }

    public void updateUser(User user, String username, String password, String mail, int phoneNumber) {

		//cheking acsses
		if (!acsses) {
			System.out.println("Warehouse Worker is not logged in.");
			return;
		}

		user.updateDetails(username, password, mail, phoneNumber);
        
    }

    public void deleteUser() {
		//cheking acsses
		if (!acsses) {
			System.out.println("Warehouse Worker is not logged in.");
			return;
		}
		//todo remuve from database
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readOrders'");
    }

    public void updateOrder(Order order, String orderDate, int salesmanID, double price, String status, ArrayList<Item> itemList) {
		//cheking acsses
		if (!acsses) {
			System.out.println("Warehouse Worker is not logged in.");
			return;
		}
		
		order.setAllFields(orderDate, salesmanID, price, status, itemList);
    }

    public void createItem(int itemID, String name, int stock, double price, String description, String supplier) {

		//cheking acsses
		if (!acsses) {
			System.out.println("Warehouse Worker is not logged in.");
			return;
		}

		Item new_item = new Item(itemID, name, stock, price, description, supplier);
        //todo add new_item
    }

    public void updateItem(Item item, int stock, String name, double price, String description, 
	ArrayList<Order> itemOrderHistory, String supplier, boolean expitedItem) {

		//cheking acsses
		if (!acsses) {
			System.out.println("Warehouse Worker is not logged in.");
			return;
		}
        
			item.setAllFields(stock, name, price, description, itemOrderHistory, supplier, expitedItem);
    }

    public ShopInfo createShopInfo(String shopName, String address, String managerName, int managerPhone, String managerMail) {
		//cheking acsses
		if (!acsses) {
			System.out.println("Warehouse Worker is not logged in.");
			return null;
		}
        return new ShopInfo(shopName, address, managerName, managerPhone, managerMail);
    }

    public void updateShopInfo(ShopInfo shopInfo, String shopName, String address, String managerName, int managerPhone, String managerMail) {

		//cheking acsses
		if (!acsses) {
			System.out.println("Warehouse Worker is not logged in.");
			return;
		}
        
		shopInfo.setShopInfo(shopName, address, managerName, managerPhone, managerMail);
    }


	@Override
    public void login(String password) {
		if (password == this.password) {
			System.out.println("Support logged in.");
			this.acsses = true;
		}
		else{
			System.out.println("Support has not logged in.");
		}
    }


    @Override
    public void logout(String password) {
		if (password == this.password) {
			System.out.println("Support logged out.");
			this.acsses = false;
		}
		else{
			System.out.println("Support has not logged out.");
		}
    }



	@Override
    public void updateDetails(String username, String password, String mail, int phoneNumber) {
		//cheking acsses
		if (!acsses) {
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
		//cheking acsses
		if (!acsses) {
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
