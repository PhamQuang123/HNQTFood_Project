package cg.hntqfood_project.service;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface AuthService {
    void renderSignIn(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;

    void renderSignUp(HttpServletRequest request, HttpServletResponse response) throws IOException;

    void login(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException;

    void register(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;

}
