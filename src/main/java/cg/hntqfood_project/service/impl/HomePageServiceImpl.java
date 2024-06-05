package cg.hntqfood_project.service.impl;

import cg.hntqfood_project.model.entity.Product;
import cg.hntqfood_project.service.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class HomePageServiceImpl implements HomePage {
    private UsersService usersService;
    private CategoryService categoryService;
    private ProductService productService;
    private OrdersService ordersService;
    private ShoppingCartService shoppingCartService;
    public HomePageServiceImpl(){
        usersService = new UsersServiceImp();
        productService = new ProductServiceImp();
        categoryService = new CategoryServiceImp();
        ordersService = new OrdersServiceImp();
        shoppingCartService = new ShoppingCartServiceImp();
    }

    @Override
    public void renderHomePage(HttpServletRequest request, HttpServletResponse response) {
        List<Product> listProduct = productService.findAll();
    }

    @Override
    public void renderShoppingCart(HttpServletRequest request, HttpServletResponse response) {

    }
}
