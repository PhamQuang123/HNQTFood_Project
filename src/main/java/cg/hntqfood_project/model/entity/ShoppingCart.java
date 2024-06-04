package cg.hntqfood_project.model.entity;

public class ShoppingCart {
    private int id;
    private Users users;
    private Orders orders;

    public ShoppingCart() {
    }

    public ShoppingCart(int id, Users users, Orders orders) {
        this.id = id;
        this.users = users;
        this.orders = orders;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }
}
