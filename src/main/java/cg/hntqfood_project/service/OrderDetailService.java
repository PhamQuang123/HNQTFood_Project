package cg.hntqfood_project.service;

import cg.hntqfood_project.model.entity.OrderDetail;

import java.util.List;

public interface OrderDetailService {
    List<OrderDetail> findAll();
    boolean save(OrderDetail orderDetail);
    boolean update(OrderDetail orderDetail);
    boolean delete(int id);
}
