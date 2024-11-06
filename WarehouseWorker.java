public class WarehouseWorker extends User {

    public WarehouseWorker(int userId, String username, String password, String mail, int phoneNumber) {
        super(userId, username, password, mail, phoneNumber);
    }

    @Override
    public void login(String password) {
		if (password == this.password) {
			System.out.println("Warehouse Worker logged in.");
			this.acsses = true;
		}
		else{
			System.out.println("Warehouse Worker is not logged in.");
		}
       
    }

    @Override
    public void logout(String password) {
		if (password == this.password) {
			System.out.println("Warehouse Worker logged out.");
			this.acsses = false;
		}
		else{
			System.out.println("Warehouse Worker has not logged out.");
		}

    }

    public void updateOrder(Order order, String status) {

		//cheking acsses
		if (acsses = false) {
			System.out.println("Warehouse Worker is not logged in.");
			return;
		}

		order.updateStatus("" + status);
        System.out.println("Order Updated");
    }

    @Override
    public void updateDetails(String username, String password, String mail, int phoneNumber) {
		//cheking acsses
		if (acsses = false) {
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
		//cheking acsses
		if (acsses = false) {
			System.out.println("Warehouse Worker is not logged in.");
			return;
		}
		//-----TODO database-----
        throw new UnsupportedOperationException("Unimplemented method 'readItems'");
    }

    @Override
    public void readOrders() {
		//cheking acsses
		if (acsses = false) {
			System.out.println("Warehouse Worker is not logged in.");
			return;
		}
		//-----TODO database-----
        throw new UnsupportedOperationException("Unimplemented method 'readOrders'");
    }
}
