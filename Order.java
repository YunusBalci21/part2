 /**
  * This is the Order file
  * Here we get information, getters and setters
  * And also a few getters that gives all the details
  */

import java.util.ArrayList;

public class Order {
    final int orderID;
    private String orderDate;
    private int salesmanID;
    private double price;
    private String status;
    private ArrayList<Item> itemList;
    //private shop info arrow

    // Getters
    public int getOrderID() {
        return orderID;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public int getSalesmanID() {
        return salesmanID;
    }

    public double getPrice() {
        return price;
    }

    public String getStatus() {
        return status;
    }

    public ArrayList<Item> getItemList() {
        return itemList;
    }

    // Detailed getters
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
    protected void updateStatus(String status) {
        this.status = status;
    }

    // Big ugly setter to set all fields at once
    public void setAllFields(String orderDate, int salesmanID, double price, String status, ArrayList<Item> itemList) {
        this.orderDate = orderDate;
        this.salesmanID = salesmanID;
        this.price = price;
        this.status = status;
        this.itemList = itemList != null ? itemList : new ArrayList<>();
    }
}
