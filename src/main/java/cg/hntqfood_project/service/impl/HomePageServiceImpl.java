package cg.hntqfood_project.service.impl;

import cg.hntqfood_project.model.entity.Product;
import cg.hntqfood_project.repository.*;
import cg.hntqfood_project.repository.impl.*;
import cg.hntqfood_project.service.*;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class HomePageServiceImpl implements HomePageService {

    private UsersRepository usersRepository;
    private CategoryRepository categoryRepository;
    private ProductRepository productRepository;
    private OrdersRepository ordersRepository;
    private ShoppingCartRepository shoppingCartRepository;



    public HomePageServiceImpl() {


        usersRepository =new UsersRepositoryImp();
        productRepository = new ProductRepositoryImp();
        categoryRepository = new CategoryRepositoryImpl();
        ordersRepository = new OrdersRepositoryImp();
        shoppingCartRepository = new ShoppingCartRepositoryImp();

    }

    @Override
    public void renderHomePage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product> listProduct = productRepository.findAll();
        request.setAttribute("listProduct", listProduct);
        request.getRequestDispatcher("/views/home.jsp").forward(request, response);
    }


    @Override
    public void renderFormSignUp(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect("/HNQTFood.com.vn/sign_up");
    }

    @Override
    public void renderFormSignIn(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect("/HNQTFood.com.vn/sign_in");
    }

    @Override
    public void logout(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Cookie emailCookie = new Cookie("email", "");
        response.addCookie(emailCookie);
        emailCookie.setMaxAge(0);
        response.sendRedirect("/HNQTFood.com.vn/sign_in");

    }

    @Override
    public void renderShoppingCart(HttpServletRequest request, HttpServletResponse response) {

    }
}
