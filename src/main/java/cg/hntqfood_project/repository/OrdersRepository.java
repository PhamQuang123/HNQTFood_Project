package cg.hntqfood_project.repository;

import cg.hntqfood_project.model.entity.Orders;
import cg.hntqfood_project.model.entity.Users;

import java.util.List;

public interface OrdersRepository {
    List<Orders> findAll();
    void save(Orders orders);
    void update(Orders orders);
    void delete(int id);
    Orders findOrdersById(int id);

}
