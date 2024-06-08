package cg.hntqfood_project.validation.product;

import cg.hntqfood_project.model.entity.Product;
import cg.hntqfood_project.repository.CategoryRepository;
import cg.hntqfood_project.repository.ProductRepository;
import cg.hntqfood_project.repository.impl.CategoryRepositoryImp;
import cg.hntqfood_project.repository.impl.ProductRepositoryImp;

public class ProductValidate {
    private ProductRepository productRepository;
    private CategoryRepository categoryRepository;

    public ProductValidate(){
        productRepository = new ProductRepositoryImp();
        categoryRepository = new CategoryRepositoryImp();
    }

    public boolean checkProductName(String productName){
        Product product = null;
        if (productName.trim().equals("")){
            return false;
        }else {
           product = productRepository.findProductByName(productName);
           if (product == null){
               return true;
           }else {
               return true;
           }
        }
    }
}
