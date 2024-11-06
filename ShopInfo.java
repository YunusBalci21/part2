import java.util.ArrayList;

public class ShopInfo  {
    private String shopName;
    private String address;
    private String managerName;
    private int managerPhone;
    private String managerMail;
    private boolean expiredShop;

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
            ", Manager: " + managerName + ", Contact: " + managerPhone;
    }

	 public void setAllFields(String shopName, String address, String managerName, int managerPhone, String managerMail){
        this.shopName = shopName;
        this.address = address;
        this.managerName = managerName;
        this.managerPhone = managerPhone;
    }

}