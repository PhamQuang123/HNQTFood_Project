package cg.hntqfood_project.repository.impl;

import cg.hntqfood_project.config.ConnectionDB;
import cg.hntqfood_project.model.entity.OrderDetail;
import cg.hntqfood_project.model.entity.Orders;
import cg.hntqfood_project.model.entity.Product;
import cg.hntqfood_project.querysql.OrderDetailSQL;
import cg.hntqfood_project.repository.OrderDetailRepository;
import cg.hntqfood_project.repository.OrdersRepository;
import cg.hntqfood_project.repository.ProductRepository;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OrderDetailRepositoryImp implements OrderDetailRepository {
    private ProductRepository productRepository = new ProductRepositoryImp();
    private OrdersRepository ordersRepository = new OrdersRepositoryImp();
    private Connection conn;
    public OrderDetailRepositoryImp(){
        conn = ConnectionDB.openConnection();
    }
    @Override
    public List<OrderDetail> findAll() {
        CallableStatement callSt = null;
        List<OrderDetail> listOrderDetail = null;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall(OrderDetailSQL.ORDER_DETAIL_FIND_ALL);
            listOrderDetail = new ArrayList<>();
            ResultSet rs = callSt.executeQuery();

            while (rs.next()) {
                OrderDetail orderDetail = new OrderDetail();
                orderDetail.setId(rs.getInt("id"));
                int productId = rs.getInt("product_id");
                Product product = productRepository.findProductById(productId);
                orderDetail.setProduct(product);
                int ordersId = rs.getInt("orders_id");
                Orders orders = ordersRepository.findOrdersById(ordersId);
                orderDetail.setOrders(orders);
                listOrderDetail.add(orderDetail);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return listOrderDetail;
    }

    @Override
    public boolean save(OrderDetail orderDetail) {
        boolean result = false;
        CallableStatement callSt = null;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall(OrderDetailSQL.ORDER_DETAIL_SAVE);
            callSt.setInt(1, orderDetail.getProduct().getId());
            callSt.setInt(2, orderDetail.getOrders().getId());
            callSt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return result;
    }

    @Override
    public boolean update(OrderDetail orderDetail) {
        boolean result = false;
        CallableStatement callSt = null;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall(OrderDetailSQL.ORDER_DETAIL_UPDATE);
            callSt.setInt(1, orderDetail.getId());
            callSt.setInt(2, orderDetail.getProduct().getId());
            callSt.setInt(3, orderDetail.getOrders().getId());
            callSt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return result;
    }

    @Override
    public boolean delete(int id) {
        boolean result = false;
        CallableStatement callSt = null;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall(OrderDetailSQL.ORDER_DETAIL_DELETE);
            callSt.setInt(1, id);
            callSt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return result;
    }
}
