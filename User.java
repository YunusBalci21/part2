public abstract class User {
    protected int userId;
    protected String username;
    protected String password;
    protected String mail;
    protected int phoneNumber;

    public User(int userId, String username, String password, String mail, int phoneNumber) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.mail = mail;
        this.phoneNumber = phoneNumber;
    }

    public abstract void login();

    public abstract void logout();

    public abstract void updateDetails();

    public abstract void readItems();

    public abstract void readOrders();

}
