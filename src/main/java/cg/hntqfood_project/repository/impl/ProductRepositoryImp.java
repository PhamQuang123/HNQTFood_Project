package cg.hntqfood_project.repository.impl;

import cg.hntqfood_project.model.entity.Product;
import cg.hntqfood_project.repository.ProductRepository;

import java.util.List;

public class ProductRepositoryImp implements ProductRepository {
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
}
