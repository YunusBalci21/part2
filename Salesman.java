public class Salesman extends User {
    public Salesman(int userId, String username, String password, String mail, int phoneNumber) {
        super(userId, username, password, mail, phoneNumber);
    }

    Salesman salesman = new Salesman(userId, null, null, null, userId);

	@Override
    public void login(String password) {
		if (password == this.password) {
			System.out.println("Salesman logged in.");
			this.acsses = true;
		}
		else{
			System.out.println("Salesman has not logged in.");
		}
       
    }


    @Override
    public void logout(String password) {
		if (password == this.password) {
			System.out.println("Salesman logged out.");
			this.acsses = false;
		}
		else{
			System.out.println("Salesman has not logged out.");
		}
    }


    public void makeOrder() {
        System.out.println("Order created: ");
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readItems'");
    }

    @Override
    public void readOrders() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readOrders'");
    }

}
