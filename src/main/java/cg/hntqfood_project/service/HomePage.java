package cg.hntqfood_project.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface HomePage {
    void renderHomePage(HttpServletRequest request, HttpServletResponse response);
    void renderShoppingCart(HttpServletRequest request, HttpServletResponse response);
}
