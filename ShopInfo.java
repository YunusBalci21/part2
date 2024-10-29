public class ShopInfo {
    private String shopName;
    private String address;
    private String managerName;
    private int managerPhone;
    private String managerMail;
    private boolean expiredShop;

    public ShopInfo(String shopName, String address, String managerName, int managerPhone, String managerMail, boolean expiredShop) {
        this.shopName = shopName;
        this.address = address;
        this.managerName = managerName;
        this.managerPhone = managerPhone;
        this.managerMail = managerMail;
        this.expiredShop = expiredShop;
    }

    public void readShopInfo() {
        System.out.println("Shop: " + shopName + ", Address: " + address + ", Manager: " + managerName + ", Contact: " + managerPhone);
    }
}
