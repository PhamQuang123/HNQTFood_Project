package cg.hntqfood_project.service;

import cg.hntqfood_project.model.entity.ShoppingCart;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface ShoppingCartService {
    List<ShoppingCart> findAll(HttpServletRequest request, HttpServletResponse response);
    boolean delete(HttpServletRequest request, HttpServletResponse response);
    boolean buyProduct(HttpServletRequest request, HttpServletResponse response);
    boolean update(HttpServletRequest request, HttpServletResponse response);
    boolean add(HttpServletRequest request, HttpServletResponse response);
    boolean checkProductInCart(HttpServletRequest request, HttpServletResponse response);
    int findTotalProduct(HttpServletRequest request, HttpServletResponse response);
    String findEmailOnline(HttpServletRequest request, HttpServletResponse response);
}
