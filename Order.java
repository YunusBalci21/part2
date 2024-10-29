public interface Order {
    int getOrderID();
    String getOrderDate();
    double getPrice();
    String getStatus();
    void setStatus(String status);
}
