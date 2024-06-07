package cg.hntqfood_project.model.entity;

public class TransactionHistory {
    private int id;
    private String email;
    private String fullName;
    private String productName;
    private double price;
    private int quantity;
    private double totalPrice;
    private String timeOrder;
    private String image;

    public TransactionHistory() {
    }

    public TransactionHistory(int id, String email, String fullName, String productName, double price,
                              int quantity, double totalPrice, String timeOrder, String image) {
        this.id = id;
        this.email = email;
        this.fullName = fullName;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        this.timeOrder = timeOrder;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getTimeOrder() {
        return timeOrder;
    }

    public void setTimeOrder(String timeOrder) {
        this.timeOrder = timeOrder;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
