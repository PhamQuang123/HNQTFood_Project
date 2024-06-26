package cg.hntqfood_project.repository;

import cg.hntqfood_project.model.entity.Product;


import java.util.List;

public interface ProductRepository {
    List<Product> findAll();
    List<Product> findAllProductHome();
    boolean save(Product product);
    boolean update(Product product);
    boolean delete(int id);
    Product findProductById(int id);

    Product findProductByName(String productName);
    int productTotal();
    List<Product> findBestSeller();
    List<Product> findPriceAsc();
    List<Product> findPriceDesc();
    List<Product> findAllLimit(int offset);
    List<Product> findByCategoryId(int categoryId);
    int totalByCategoryId(int categoryId);
    List<Product> findByCategoryIdLimit(int categoryId);
    List<Product> searchProductByName(String productName);
}
