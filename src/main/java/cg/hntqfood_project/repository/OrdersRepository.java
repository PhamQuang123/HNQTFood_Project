package cg.hntqfood_project.repository;

import cg.hntqfood_project.model.entity.Orders;
import cg.hntqfood_project.model.entity.Users;

import java.util.List;

public interface OrdersRepository {
    List<Orders> findAll();
    boolean save(Orders orders);
    boolean update(Orders orders);
    boolean delete(int id);
    Orders findOrdersById(int id);

}
