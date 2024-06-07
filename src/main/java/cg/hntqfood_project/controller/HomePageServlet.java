package cg.hntqfood_project.controller;

import cg.hntqfood_project.service.HomePageService;
import cg.hntqfood_project.service.impl.HomePageServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "HomeFoodServlet", value = "/HNQTFood/v1/*")
public class HomePageServlet extends HttpServlet {
    private HomePageService homePageService;

    @Override
    public void init() throws ServletException {
        homePageService = new HomePageServiceImpl();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String url = request.getPathInfo();
        switch (url) {
            case "/home_page":
                homePageService.renderHomePage(request, response);
                break;
            case "/sign_up":
                homePageService.renderFormSignUp(request,response);
                break;
            case "/sign_in":
                homePageService.renderFormSignIn(request,response);
                break;
            case "/log_out":
                homePageService.logout(request,response);
                break;
            case "search":
                homePageService.search(request,response);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       request.setCharacterEncoding("UTF-8");
        String url = request.getPathInfo();
        switch (url) {
            case "/home_page":
                homePageService.renderHomePage(request, response);
                break;
            case "/sign_up":
                homePageService.renderFormSignUp(request,response);
                break;
            case "/sign_in":
                homePageService.renderFormSignIn(request,response);
                break;
            case "/log_out":
                homePageService.logout(request,response);
                break;
            case "search":
                homePageService.search(request,response);
                break;
        }
    }
}
