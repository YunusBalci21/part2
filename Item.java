public class Item {
    private int itemId;
    private String name;
    private int stock;
    private double price;

    public Item(int itemId, String name, int stock, double price) {
        this.itemId = itemId;
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

    public int getItemId() { return itemId; }
    public String getName() { return name; }
    public int getStock() { return stock; }

    public void updateStock(int quantity) {
        this.stock += quantity;
        System.out.println("Stock updated to " + stock);
    }

    public void readItemDetails() {
        System.out.println("Item ID: " + itemId + ", Name: " + name + ", Stock: " + stock + ", Price: $" + price);
    }
}
