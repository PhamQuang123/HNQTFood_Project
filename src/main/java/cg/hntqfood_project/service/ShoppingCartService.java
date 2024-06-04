package cg.hntqfood_project.service;

import cg.hntqfood_project.model.entity.ShoppingCart;

import java.util.List;

public interface ShoppingCartService {
    List<ShoppingCart> findAll();
    void save(ShoppingCart shoppingCart);
    void update(ShoppingCart shoppingCart);
    void delete(int id);
}
