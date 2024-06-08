package cg.hntqfood_project.model.entity;

public class OrderDetail {
    private int id;
    private Product product;
    private Orders orders;

    public OrderDetail() {
    }

    public OrderDetail(Product product, Orders orders) {
        this.product = product;
        this.orders = orders;
    }

    public OrderDetail(int id, Product product, Orders orders) {
        this.id = id;
        this.product = product;
        this.orders = orders;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }
}
