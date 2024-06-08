package cg.hntqfood_project.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface ShoppingCartService {
    boolean add(HttpServletRequest request, HttpServletResponse response);
    boolean checkProductInCart(HttpServletRequest request, HttpServletResponse response);
    int findTotalProduct(HttpServletRequest request, HttpServletResponse response);
    String findEmailOnline(HttpServletRequest request, HttpServletResponse response);
}
