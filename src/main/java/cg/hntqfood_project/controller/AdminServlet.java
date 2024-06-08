package cg.hntqfood_project.controller;

import cg.hntqfood_project.service.AdminService;
import cg.hntqfood_project.service.impl.AdminServiceImp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "AdminServlet", value = "/HNQTFood/admin/*")
public class AdminServlet extends HttpServlet {
    private AdminService adminService;

    @Override
    public void init() throws ServletException {
        adminService = new AdminServiceImp();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String url = request.getPathInfo();
        switch (url) {
            case "/account":
                adminService.renderAccountManagement(request, response);
                break;
            case "/product":
                adminService.renderProductManagement(request, response);
                break;
            case "/category":
                break;
            case "/order":
                break;
            case "/edit_account":
                adminService.editAccount(request, response);
                break;
            case "/delete_account":
                break;
            case "/new_product":
                adminService.renderFormCreateProduct(request, response);
                break;

            case "/edit_product":
                adminService.editProduct(request, response);
                break;
            case "/delete_product":
                adminService.deleteProduct(request, response);
                break;

        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String url = request.getPathInfo();
        switch (url) {
            case "/update_account_admin":
                adminService.adminUpdateAccount(request, response);
                break;
            case "/search_account":
                break;
            case "/create_product":
                adminService.createProduct(request, response);
                break;
            case "/update_product":
                adminService.updateProduct(request, response);
                break;
            case "/search_product":

                break;
        }
    }
}
