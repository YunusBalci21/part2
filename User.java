public abstract class User {
    protected int userId;
    protected String username;

    public User(int userId, String username) {
        this.userId = userId;
        this.username = username;
    }

    public abstract void login();
    public abstract void logout();
}
