package cg.hntqfood_project.repository;

import cg.hntqfood_project.model.entity.ShoppingCart;

import java.util.List;

public interface ShoppingCartRepository {
    List<ShoppingCart> findAll();
    void save(ShoppingCart shoppingCart);
    void update(ShoppingCart shoppingCart);
    void delete(int id);

}
