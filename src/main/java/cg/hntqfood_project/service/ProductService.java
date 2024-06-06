package cg.hntqfood_project.service;

import cg.hntqfood_project.model.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    boolean save(Product product);
    boolean update(Product product);
    boolean delete(int id);
    Product findProductById(int id);
    int productTotal();
    List<Product> findProductByName(String productName);
}
