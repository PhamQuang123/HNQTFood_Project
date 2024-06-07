package cg.hntqfood_project.repository.impl;

import cg.hntqfood_project.config.ConnectionDB;
import cg.hntqfood_project.model.entity.Category;
import cg.hntqfood_project.model.entity.Orders;
import cg.hntqfood_project.model.entity.Product;
import cg.hntqfood_project.model.entity.Users;
import cg.hntqfood_project.querysql.OrdersSQL;
import cg.hntqfood_project.querysql.ProductSQL;
import cg.hntqfood_project.repository.OrderDetailRepository;
import cg.hntqfood_project.repository.OrdersRepository;
import cg.hntqfood_project.repository.UsersRepository;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OrdersRepositoryImp implements OrdersRepository {
    private UsersRepository usersRepository = new UsersRepositoryImp();
    private Connection conn;
    public OrdersRepositoryImp(){
        conn = ConnectionDB.openConnection();
    }
    @Override
    public List<Orders> findAll() {
        CallableStatement callSt = null;
        List<Orders> listOrders = null;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall(OrdersSQL.ORDERS_FIND_ALL);
            listOrders = new ArrayList<>();
            ResultSet rs = callSt.executeQuery();

            while (rs.next()) {
                Orders orders = new Orders();
                orders.setId(rs.getInt("id"));
                orders.setTimeOrder(rs.getString("timeOrder"));
                orders.setTotalPrice(rs.getDouble("totalPrice"));
                orders.setQuantity(rs.getInt("quantity"));
                int usersId = rs.getInt("users_id");
                Users users = usersRepository.findUsersById(usersId);
                orders.setUsers(users);
                orders.setOrderStatus(rs.getInt("orderStatus"));
                listOrders.add(orders);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return listOrders;
    }

    @Override
    public boolean save(Orders orders) {
        boolean result = false;
        CallableStatement callSt = null;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall(OrdersSQL.ORDERS_SAVE);
            callSt.setDouble(1, orders.getTotalPrice());
            callSt.setInt(2,orders.getQuantity());
            callSt.setInt(3,orders.getUsers().getId());
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
    public boolean update(Orders orders) {
        boolean result = false;
        CallableStatement callSt = null;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall(OrdersSQL.ORDERS_UPDATE);
            callSt.setInt(1,orders.getId());
            callSt.setDouble(2, orders.getTotalPrice());
            callSt.setInt(3,orders.getQuantity());
            callSt.setInt(4,orders.getUsers().getId());
            callSt.setInt(5, orders.getOrderStatus());
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
            callSt = conn.prepareCall(OrdersSQL.ORDERS_DELETE);
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

    @Override
    public Orders findOrdersById(int id) {
        CallableStatement callSt = null;
        Orders orders = null;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall(OrdersSQL.FIND_ORDERS_BY_ID);
            callSt.setInt(1, id);
            ResultSet rs = callSt.executeQuery();
            if (rs.next()) {
                orders = new Orders();
                orders.setId(rs.getInt("id"));
                orders.setTimeOrder(rs.getString("timeOrder"));
                orders.setTotalPrice(rs.getDouble("totalPrice"));
                orders.setQuantity(rs.getInt("quantity"));
                int usersId = rs.getInt("users_id");
                Users users = usersRepository.findUsersById(usersId);
                orders.setUsers(users);
                orders.setOrderStatus(rs.getInt("orderStatus"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return orders;
    }
}
