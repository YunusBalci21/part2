import java.util.List;

public class SaleOrder implements Order {
    private int orderId;
    private String orderDate;
    private double price;
    private String status;

    public SaleOrder(int orderId, String orderDate, double price, String status) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.price = price;
        this.status = status;
    }

    @Override
    public int getOrderID() { return orderId; }

    @Override
    public String getOrderDate() { return orderDate; }

    @Override
    public double getPrice() { return price; }

    @Override
    public String getStatus() { return status; }

    @Override
    public void setStatus(String status) { this.status = status; }

    @Override
    public String toString() {
        return "Order[ID=" + orderId + ", Date=" + orderDate + ", Price=" + price + ", Status=" + status + "]";
    }
}
