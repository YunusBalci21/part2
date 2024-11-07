public class Supplier {
    private String name;
    private String address;
    private String contactname;
    private int contactphone;
    private String contactmail;

    // getters
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getContactName() {
        return contactname;
    }

    public int getContactPhone() {
        return contactphone;
    }

    public String getContactMail() {
        return contactmail;
    }

    public Supplier(String name, String address, String contactname, int contactphone, String contactmail) {
        this.name = name;
        this.address = address;
        this.contactname = contactname;
        this.contactphone = contactphone;
        this.contactmail = contactmail;
    }

    public String getSupplierInfo() {
        String text = "Supplier: " + name +
                "\nHas the following address: " + address +
                "\nName of Contact: " + contactname +
                "\nPhonenumber to Contact: " + contactphone +
                "\nMail to contact" + contactmail;
        return text;
    }

    public void orderItemStock() {
        // Make the API call
        // Done in Inventory
    }

}
