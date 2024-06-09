package cg.hntqfood_project.service.impl;

import cg.hntqfood_project.model.entity.Product;
import cg.hntqfood_project.model.entity.Users;
import cg.hntqfood_project.repository.*;
import cg.hntqfood_project.repository.impl.*;
import cg.hntqfood_project.service.*;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

public class HomePageServiceImp implements HomePageService {

    private UsersRepository usersRepository;
    private CategoryRepository categoryRepository;
    private ProductRepository productRepository;
    private OrdersRepository ordersRepository;
    private TransactionHistoryRepository shoppingCartRepository;


    public HomePageServiceImp() {
        usersRepository = new UsersRepositoryImp();
        productRepository = new ProductRepositoryImp();
        categoryRepository = new CategoryRepositoryImp();
        ordersRepository = new OrdersRepositoryImp();
        shoppingCartRepository = new TransactionHistoryRepositoryImp();

    }

    @Override
    public void renderHomePage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product> listBestSeller = productRepository.findBestSeller();
        List<Product> listFood = productRepository.findByCategoryId(1);
        List<Product> listDrink = productRepository.findByCategoryId(2);
        request.setAttribute("listFood", listFood);
        request.setAttribute("listDrink", listDrink);
        request.setAttribute("listBestSeller",listBestSeller);
        HttpSession session = request.getSession();
        Cookie[] cookies = request.getCookies();
        String emailCo = null;
        if (cookies != null) {
            for (Cookie c : cookies
            ) {
                if (c.getName().equals("emailCo")) {
                    emailCo = c.getValue();
                    break;
                }
            }
            if (emailCo != null) {
                Users users = usersRepository.findUserByEmail(emailCo);
                session.setAttribute("users", users);
                Cookie c = new Cookie("emailCo", emailCo);
                c.setPath("/");
                response.addCookie(c);
                c.setMaxAge(24 * 60 * 60);
            }
        }


        request.getRequestDispatcher("/views/home.jsp").forward(request, response);
    }


    @Override
    public void renderFormSignUp(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect("/HNQTFood/sign_up");
    }

    @Override
    public void renderFormSignIn(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect("/HNQTFood/sign_in");
    }

    @Override
    public void logout(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Cookie emailCookie = new Cookie("email", "");
        response.addCookie(emailCookie);
        emailCookie.setMaxAge(0);
        response.sendRedirect("/HNQTFood/sign_in");

    }

    @Override
    public void search(HttpServletRequest request, HttpServletResponse response) {
        String productName = request.getParameter("productName");
        List<Product> listProduct = productRepository.searchProductByName(productName);
        if (listProduct.size() > 0){
            request.setAttribute("search", 1);
            request.setAttribute("listProduct",listProduct);
        }
    }

    @Override
    public void renderShoppingCart(HttpServletRequest request, HttpServletResponse response) {

    }
}
