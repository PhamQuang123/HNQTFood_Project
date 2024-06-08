package cg.hntqfood_project.service;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface AdminService {
    void renderAccountManagement(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException;

    void renderProductManagement(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;


    void editAccount(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;

    void adminUpdateAccount(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;

    void usersUpdateAccount(HttpServletRequest request, HttpServletResponse response) throws IOException;


    void renderFormCreateProduct(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException;

    void createProduct(HttpServletRequest request, HttpServletResponse response) throws IOException;

    void editProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;

    void updateProduct(HttpServletRequest request, HttpServletResponse response) throws IOException;

    void deleteProduct(HttpServletRequest request, HttpServletResponse response) throws IOException;
}
