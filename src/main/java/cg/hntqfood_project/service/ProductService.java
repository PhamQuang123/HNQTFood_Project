package cg.hntqfood_project.service;

import cg.hntqfood_project.model.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    void save(Product product);
    void update(Product product);
    void delete(int id);
    Product findProductById(int id);
    List<Product> findProductByName(String productName);
}
