package cg.hntqfood_project.repository;

import cg.hntqfood_project.model.entity.OrderDetail;

import java.util.List;

public interface OrderDetailRepository {
    List<OrderDetail> findAll();
    boolean save(OrderDetail orderDetail);
    boolean update(OrderDetail orderDetail);
    boolean delete(int id);

}
