package cg.hntqfood_project.repository.impl;

import cg.hntqfood_project.config.ConnectionDB;
import cg.hntqfood_project.model.entity.Category;
import cg.hntqfood_project.model.entity.Orders;
import cg.hntqfood_project.model.entity.Product;
import cg.hntqfood_project.model.entity.ShoppingCart;
import cg.hntqfood_project.querysql.ProductSQL;
import cg.hntqfood_project.querysql.ShoppingCartSQL;
import cg.hntqfood_project.repository.ShoppingCartRepository;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCartRepositoryImp implements ShoppingCartRepository {
    private Connection conn;
    public ShoppingCartRepositoryImp(){
        conn = ConnectionDB.openConnection();
    }
    @Override
    public List<ShoppingCart> findAll() {
        return null;
    }

    @Override
    public boolean save(ShoppingCart shoppingCart) {
        return false;
    }
}
