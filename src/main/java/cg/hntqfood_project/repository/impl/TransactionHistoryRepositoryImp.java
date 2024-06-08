package cg.hntqfood_project.repository.impl;

import cg.hntqfood_project.config.ConnectionDB;
import cg.hntqfood_project.model.entity.*;
import cg.hntqfood_project.querysql.TransactionHistorySQL;
import cg.hntqfood_project.repository.OrdersRepository;
import cg.hntqfood_project.repository.ProductRepository;
import cg.hntqfood_project.repository.TransactionHistoryRepository;
import cg.hntqfood_project.repository.UsersRepository;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TransactionHistoryRepositoryImp implements TransactionHistoryRepository {
    private UsersRepository usersRepository = new UsersRepositoryImp();
    private ProductRepository productRepository = new ProductRepositoryImp();
    private OrdersRepository ordersRepository = new OrdersRepositoryImp();
    private Connection conn;
    public TransactionHistoryRepositoryImp(){
        conn = ConnectionDB.openConnection();
    }
    @Override
    public List<TransactionHistory> findAll() {
        CallableStatement callSt = null;
        List<TransactionHistory> transactionHistoryList = null;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall(TransactionHistorySQL.TRANSACTION_HISTORY_FIND_ALL);
            transactionHistoryList = new ArrayList<>();
            ResultSet rs = callSt.executeQuery();

            while (rs.next()) {
                TransactionHistory transactionHistory = new TransactionHistory();
                transactionHistory.setId(rs.getInt("id"));
                transactionHistory.setEmail(rs.getString("email"));
                transactionHistory.setFullName(rs.getString("fullName"));
                transactionHistory.setProductName(rs.getString("productName"));
                transactionHistory.setPrice(rs.getInt("price"));
                transactionHistory.setQuantity( rs.getInt("quantity"));
                transactionHistory.setTotalPrice(rs.getDouble("totalPrice"));
                transactionHistory.setTimeOrder(rs.getString("timeOrder"));
                transactionHistory.setImage(rs.getString("image"));
                transactionHistoryList.add(transactionHistory);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return transactionHistoryList;
    }

    @Override
    public List<TransactionHistory> findByEmail(String email) {
        CallableStatement callSt = null;
        List<TransactionHistory> transactionHistoryList = null;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall(TransactionHistorySQL.TRANSACTION_HISTORY_FIND_BY_EMAIL);
            callSt.setString(1,email);
            transactionHistoryList = new ArrayList<>();
            ResultSet rs = callSt.executeQuery();

            while (rs.next()) {
                TransactionHistory transactionHistory = new TransactionHistory();
                transactionHistory.setId(rs.getInt("id"));
                transactionHistory.setEmail(rs.getString("email"));
                transactionHistory.setFullName(rs.getString("fullName"));
                transactionHistory.setProductName(rs.getString("productName"));
                transactionHistory.setPrice(rs.getInt("price"));
                transactionHistory.setQuantity( rs.getInt("quantity"));
                transactionHistory.setTotalPrice(rs.getDouble("totalPrice"));
                transactionHistory.setTimeOrder(rs.getString("timeOrder"));
                transactionHistory.setImage(rs.getString("image"));
                transactionHistoryList.add(transactionHistory);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return transactionHistoryList;
    }
}
