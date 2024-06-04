package cg.hntqfood_project.service;

import cg.hntqfood_project.model.entity.OrderDetail;

import java.util.List;

public interface OrderDetailService {
    List<OrderDetail> findAll();
    void save(OrderDetail orderDetail);
    void update(OrderDetail orderDetail);
    void delete(int id);
}
