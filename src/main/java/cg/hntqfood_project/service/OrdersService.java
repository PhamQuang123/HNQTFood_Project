package cg.hntqfood_project.service;

import cg.hntqfood_project.model.entity.Orders;

import java.util.List;

public interface OrdersService {
    List<Orders> findAll();
    boolean save(Orders orders);
    boolean update(Orders orders);
    boolean delete(int id);
    Orders findOrdersById(int id);
}
