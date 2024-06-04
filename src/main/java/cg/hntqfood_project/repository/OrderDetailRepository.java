package cg.hntqfood_project.repository;

import cg.hntqfood_project.model.entity.OrderDetail;

import java.util.List;

public interface OrderDetailRepository {
    List<OrderDetail> findAll();
    void save(OrderDetail orderDetail);
    void update(OrderDetail orderDetail);
    void delete(int id);

}
