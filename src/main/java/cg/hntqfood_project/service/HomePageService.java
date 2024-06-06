package cg.hntqfood_project.service;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface HomePageService {
    void renderHomePage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
    void renderFormSignUp(HttpServletRequest request, HttpServletResponse response) throws IOException;
    void renderFormSignIn(HttpServletRequest request, HttpServletResponse response) throws IOException;
    void    logout(HttpServletRequest request, HttpServletResponse response) throws IOException;
    void renderShoppingCart(HttpServletRequest request, HttpServletResponse response);
}
