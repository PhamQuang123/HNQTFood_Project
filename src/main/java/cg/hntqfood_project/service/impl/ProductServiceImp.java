package cg.hntqfood_project.service.impl;

import cg.hntqfood_project.model.entity.Product;
import cg.hntqfood_project.service.ProductService;

import java.util.List;

public class ProductServiceImp implements ProductService {
    @Override
    public List<Product> findAll() {
        return null;
    }

    @Override
    public boolean save(Product product) {
        return false;
    }

    @Override
    public boolean update(Product product) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public Product findProductById(int id) {
        return null;
    }

    @Override
    public int productTotal() {
        return 0;
    }

    @Override
    public List<Product> findProductByName(String productName) {
        return null;
    }
}
