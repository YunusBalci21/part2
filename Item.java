import java.util.ArrayList;

public class Item {
    private int itemID;
    private int stock;
    private String name;
    private double price;
    private String description;
    private ArrayList<Order> itemOrderHistory;
    private String supplier;
    private boolean expitedItem;

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

}
