package cg.hntqfood_project.model.entity;

import java.util.Date;

public class Orders {
    private int id;
    private Date timeOrder;
    private double totalPrice;
    private String quantity;
    private Users users;
    private int orderStatus;

    public Orders() {
    }

    public Orders(int id, Date timeOrder, double totalPrice, String quantity, Users users, int orderStatus) {
        this.id = id;
        this.timeOrder = timeOrder;
        this.totalPrice = totalPrice;
        this.quantity = quantity;
        this.users = users;
        this.orderStatus = orderStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getTimeOrder() {
        return timeOrder;
    }

    public void setTimeOrder(Date timeOrder) {
        this.timeOrder = timeOrder;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }


}
