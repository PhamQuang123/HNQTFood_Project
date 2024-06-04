package cg.hntqfood_project.service;

import cg.hntqfood_project.model.entity.Orders;

import java.util.List;

public interface OrdersService {
    List<Orders> findAll();
    void save(Orders orders);
    void update(Orders orders);
    void delete(int id);
    Orders findOrdersById(int id);
}
