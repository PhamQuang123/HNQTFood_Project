package cg.hntqfood_project.repository.impl;

import cg.hntqfood_project.config.ConnectionDB;
import cg.hntqfood_project.model.entity.Product;
import cg.hntqfood_project.querysql.ProductSQL;
import cg.hntqfood_project.repository.ProductRepository;

import java.sql.*;
import java.util.List;

public class ProductRepositoryImp implements ProductRepository {
    private Connection conn;
    public ProductRepositoryImp(){
        conn = ConnectionDB.openConnection();
    }
    @Override
    public List<Product> findAll() {
        return null;
    }

    @Override
    public void save(Product product) {

    }

    @Override
    public void update(Product product) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Product findProductById(int id) {
        return null;
    }

    @Override
    public List<Product> findProductByName(String productName) {
        return null;
    }

    @Override
    public int sumProduct() {
        CallableStatement callSt = null;
        int sum = 0;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall(ProductSQL.sum_product);
            callSt.registerOutParameter(1, Types.INTEGER);
             callSt.execute();
             sum = callSt.getInt(1);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return sum;
    }
}
