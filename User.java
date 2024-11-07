import java.util.HashMap;

public abstract class User {
    final int userId;
    protected String username;
    protected String password;
    protected String mail;
    protected int phoneNumber;
    protected boolean access;

    public static HashMap<Integer, User> userDatabase = new HashMap<>();
    public static HashMap<Integer, User> itemDatabase = new HashMap<>();
    public static HashMap<Integer, User> orderDatabase = new HashMap<>();
    // Where should the Databases lie?

    public User(int userId, String username, String password, String mail, int phoneNumber) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.mail = mail;
        this.phoneNumber = phoneNumber;
    }

    public abstract void login(String password);

    public abstract void logout(String password);

    public abstract void updateDetails(String username, String password, String mail, int phoneNumber);

    public abstract void readItems();

    public abstract void readOrders(HashMap<Integer, Order> listOfOrders);

}
