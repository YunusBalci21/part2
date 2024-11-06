import java.util.ArrayList;

public class Order {
    private int orderID;
    private String orderDate;
    private int salesmanID;
    private double price;
    private String status;
    private ArrayList<Item> itemList;
    //private shop info arrow

    // Constructor to initialize all fields
    public Order(int orderID, String orderDate, int salesmanID, long price,
                 ArrayList<Item> itemList) {
        this.orderID = orderID; // Should be made automatic with incrementing numbers in the database
        this.orderDate = orderDate;
        this.salesmanID = salesmanID;
        this.price = price;
        this.status = "Order created";
        this.itemList = itemList != null ? itemList : new ArrayList<>(); // Initialize to empty if null
    }

    // Order details
    public String getOrderDetails() {
        String text = "This is your order details from order ID: " + orderID + 
        "\nOrderDate: " + orderDate +
        "\nPrice: " + price +
        "\nStatus: " + status +
        "\nList of items:\nitem name, amount\nitem name, amount\nitem name, amount\nitem name, amount";
        
        return text;
    }
    
    // Shop details
    public String getShopInfo() {
        return "WIP";
    }
    
    // Salesman details
    public String getSalesmanInfo() {
        return "Salesman ID: " + salesmanID;
    }

    // Methods for support
    protected void updateOrder(String status) {
        this.status = status;
    }
}
