package cg.hntqfood_project.controller;

import cg.hntqfood_project.service.AuthService;
import cg.hntqfood_project.service.impl.AuthServiceImp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "AuthServlet", value = "/HNQTFood/*")
public class AuthServlet extends HttpServlet {
    private AuthService authService;

    @Override
    public void init() throws ServletException {
        authService = new AuthServiceImp();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String url = request.getPathInfo();
        switch (url) {
            case "/sign_in":
                authService.renderSignIn(request, response);
                break;
            case "/sign_up":
                authService.renderSignUp(request, response);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String url = request.getPathInfo();
        switch (url) {
            case "/sign_up":
                authService.register(request, response);
                break;
            case "/sign_in":
                authService.login(request, response);
                break;
        }
    }
}
