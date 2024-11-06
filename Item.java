import java.util.ArrayList;

public class Item {
    final int itemID;
    private int stock;
    private String name;
    private double price;
    private String description;
    private ArrayList<Order> itemOrderHistory;
    private String supplier;
    private boolean expitedItem;

    // Getters
    public int getItemID() {
        return itemID;
    }

    public int getStock() {
        return stock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public ArrayList<Order> getItemOrderHistory() {
        return itemOrderHistory;
    }

    public String getSupplier() {
        return supplier;
    }

    public boolean isExpitedItem() {
        return expitedItem;
    }

    // Detailed getters
    public Item(int itemID, String name, int stock, double price, String description, String supplier) {
        this.itemID = itemID; // Should be made automatic with incrementing numbers in the database
        this.stock = stock;
        this.name = name;
        this.price = price;
        this.description = description;
        this.itemOrderHistory = new ArrayList<>(); // Initialize to empty
        this.supplier = supplier;
        this.expitedItem = false;
    }

    public String getItemDetails() {
        String text = "This is your item details from itemID: " + itemID + 
            "\nStock: " + stock +
            "\nName: " + name +
            "\nPrice: " + price +
            "\nDescription: " + description +
            "\nSupplier: " + supplier +
            "\nIs item expired from production: " + expitedItem;
        return text;
    }

    public String getOrderHistory() {
        return "\nItem-Order-History:\nOrder\nOrder\nOrder\nOrder";
    }

    // Setters
    public void updateStock(int stock) {
        this.stock = stock;
    }

    // Big ugly setter to set all fields (except itemID) at once
    public void setAllFields(int stock, String name, double price, String description, 
                             ArrayList<Order> itemOrderHistory, String supplier, boolean expitedItem) {
        this.stock = stock;
        this.name = name;
        this.price = price;
        this.description = description;
        this.itemOrderHistory = itemOrderHistory != null ? itemOrderHistory : new ArrayList<>();
        this.supplier = supplier;
        this.expitedItem = expitedItem;
    }

}
