package cg.hntqfood_project.service.impl;

import cg.hntqfood_project.model.entity.*;
import cg.hntqfood_project.repository.OrderDetailRepository;
import cg.hntqfood_project.repository.OrdersRepository;
import cg.hntqfood_project.repository.ProductRepository;
import cg.hntqfood_project.repository.impl.OrderDetailRepositoryImp;
import cg.hntqfood_project.repository.impl.OrdersRepositoryImp;
import cg.hntqfood_project.repository.impl.ProductRepositoryImp;
import cg.hntqfood_project.service.ShoppingCartService;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCartServiceImp implements ShoppingCartService {
    private ProductRepository productRepository;
    private OrdersRepository ordersRepository;
    private OrderDetailRepository orderDetailRepository;

    public ShoppingCartServiceImp() {
        productRepository = new ProductRepositoryImp();
        ordersRepository = new OrdersRepositoryImp();
        orderDetailRepository = new OrderDetailRepositoryImp();
    }

    @Override
    public boolean add(HttpServletRequest request, HttpServletResponse response) {
        List<ShoppingCart> shoppingCartList = new ArrayList();
        String email = findEmailOnline(request, response);
        HttpSession session = request.getSession();
        if (email != null) {
            int idProduct = Integer.parseInt(request.getParameter("idProduct"));
            Product product = productRepository.findProductById(idProduct);
            if (!checkProductInCart(request, response)){
                double totalPrice = product.getPrice();
                ShoppingCart cart = new ShoppingCart();
                int quantityProduct = findTotalProduct(request, response);
                cart.setId(quantityProduct + 1);
                cart.setTotalPrice(totalPrice);
                cart.setQuantity(1);
                cart.setProduct(product);
                shoppingCartList.add(cart);
                session.setAttribute(email,shoppingCartList);
                session.setMaxInactiveInterval(60*60*24*30);
                return true;
            }else {
                shoppingCartList = (List<ShoppingCart>) session.getAttribute(email);
                for (ShoppingCart cart : shoppingCartList){
                    if (cart.getProduct().getProductName().equals(product.getProductName())){
                        cart.setQuantity(cart.getQuantity() + 1);
                        cart.setTotalPrice(cart.getTotalPrice() + product.getPrice());
                        session.setAttribute(email,shoppingCartList);
                        session.setMaxInactiveInterval(60*60*24*30);
                    }
                }
                return true;
            }
        } else {
            return false;
        }
    }


    @Override
    public boolean checkProductInCart(HttpServletRequest request, HttpServletResponse response) {
        int idProduct = Integer.parseInt(request.getParameter("idProduct"));
        String email = findEmailOnline(request, response);
        HttpSession session = request.getSession();
        List<ShoppingCart> shoppingCartList = (List<ShoppingCart>) session.getAttribute(email);
        if (email != null) {
            for (ShoppingCart shoppingCart : shoppingCartList) {
                if (shoppingCart.getProduct().getId() == idProduct) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    @Override
    public int findTotalProduct(HttpServletRequest request, HttpServletResponse response) {
        int idProduct = Integer.parseInt(request.getParameter("idProduct"));
        String email = findEmailOnline(request, response);
        HttpSession session = request.getSession();
        List<ShoppingCart> shoppingCartList = (List<ShoppingCart>) session.getAttribute(email);
        for (ShoppingCart shoppingCart : shoppingCartList) {
            if (shoppingCart.getProduct().getId() == idProduct) {
                return shoppingCart.getQuantity();
            }
        }
        return 0;
    }

    @Override
    public String findEmailOnline(HttpServletRequest request, HttpServletResponse response) {
        String email = null;
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("email")) {
                    email = cookie.getValue();
                }
            }
            return email;
        } else {
            return null;
        }
    }

    @Override
    public List<ShoppingCart> findAll(HttpServletRequest request, HttpServletResponse response) {
        String email = findEmailOnline(request, response);
        HttpSession session = request.getSession();
        List<ShoppingCart> shoppingCartList = (List<ShoppingCart>) session.getAttribute(email);
        return shoppingCartList;
    }

    @Override
    public boolean delete(HttpServletRequest request, HttpServletResponse response) {
        int idProduct = Integer.parseInt(request.getParameter("idProduct"));
        String email = findEmailOnline(request, response);
        HttpSession session = request.getSession();
        List<ShoppingCart> shoppingCartList = (List<ShoppingCart>) session.getAttribute(email);
        for (ShoppingCart shoppingCart : shoppingCartList) {
            if (shoppingCart.getProduct().getId() == idProduct) {
                shoppingCartList.remove(shoppingCart);
                session.setAttribute(email,shoppingCartList);
                session.setMaxInactiveInterval(60*60*24*30);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean buyProduct(HttpServletRequest request, HttpServletResponse response) {
        int idProduct = Integer.parseInt(request.getParameter("idProduct"));
        String email = findEmailOnline(request, response);
        HttpSession session = request.getSession();
        Users users = (Users) session.getAttribute("users");
        ShoppingCart shoppingCart = null;
        List<ShoppingCart> shoppingCartList = (List<ShoppingCart>) session.getAttribute(email);
        for (ShoppingCart cart : shoppingCartList) {
            if (cart.getProduct().getId() == idProduct){
                shoppingCart = cart;
            }
        }
        Product product = shoppingCart.getProduct();
        Orders orders = new Orders();
        orders.setTotalPrice(shoppingCart.getTotalPrice());
        orders.setQuantity(shoppingCart.getQuantity());
        orders.setUsers(users);
        ordersRepository.save(orders);
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setOrders(orders);
        orderDetail.setProduct(product);
        orderDetailRepository.save(orderDetail);
        delete(request, response);
        return true;
    }

    @Override
    public boolean update(HttpServletRequest request, HttpServletResponse response) {
        List<ShoppingCart> shoppingCartList ;
        String email = findEmailOnline(request, response);
        HttpSession session = request.getSession();
        if (email != null) {
            int quantity = Integer.parseInt(request.getParameter("quantity"));
            int idProduct = Integer.parseInt(request.getParameter("idProduct"));
            shoppingCartList = (List<ShoppingCart>) session.getAttribute(email);
            for (ShoppingCart shoppingCart : shoppingCartList) {
                if (shoppingCart.getId() == idProduct) {
                    shoppingCart.setQuantity(quantity);
                    shoppingCart.setTotalPrice(quantity * shoppingCart.getProduct().getPrice());
                    session.setAttribute(email,shoppingCartList);
                    session.setMaxInactiveInterval(60*60*24*30);
                }
            }
            return true;
        }
        return false;
    }
}
