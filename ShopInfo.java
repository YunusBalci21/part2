public class ShopInfo {
    private String shopName;
    private String address;
    private String managerName;
    private int managerPhone;
    private String managerMail;

    // Constructor
    public ShopInfo(String shopName, String address, String managerName, int managerPhone, String managerMail) {
        this.shopName = shopName;
        this.address = address;
        this.managerName = managerName;
        this.managerPhone = managerPhone;
        this.managerMail = managerMail;
    }

    public String readShopInfo() {
        return "Shop: " + shopName + ", Address: " + address +
            ", Manager: " + managerName + ", Contact phone: " + managerPhone + ", Contact mail: " + managerMail;
    }

    // Setter
    public void setShopInfo(String shopName, String address, String managerName, 
                        int managerPhone, String managerMail) {
        this.shopName = shopName;
        this.address = address;
        this.managerName = managerName;
        this.managerPhone = managerPhone;
        this.managerMail = managerMail;
    }

}