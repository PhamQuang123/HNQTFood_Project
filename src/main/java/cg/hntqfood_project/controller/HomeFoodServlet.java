package cg.hntqfood_project.controller;

import cg.hntqfood_project.service.CategoryService;
import cg.hntqfood_project.service.ProductService;
import cg.hntqfood_project.service.UsersService;
import cg.hntqfood_project.service.impl.UsersServiceImp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "HomeFoodServlet", value = "/HNQTFood.com.vn")
public class HomeFoodServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String url = request.getPathInfo();
        switch (url){
            case "home_page":

                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
