package cg.hntqfood_project.model.entity;

public class ShoppingCart {
    private int id;
    private int quantity;
    private double totalPrice;
    private Product product;

    public ShoppingCart() {
    }

    public ShoppingCart(int id, int quantity, double totalPrice, Product product) {
        this.id = id;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        this.product = product;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return id + "," + quantity + "," + totalPrice + "," + product;
    }
}
