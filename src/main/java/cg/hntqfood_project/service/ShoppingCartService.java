package cg.hntqfood_project.service;

import cg.hntqfood_project.model.entity.ShoppingCart;

import java.util.List;

public interface ShoppingCartService {
    List<ShoppingCart> findAll();
    boolean save(ShoppingCart shoppingCart);
    boolean update(ShoppingCart shoppingCart);
    boolean delete(int id);
}
