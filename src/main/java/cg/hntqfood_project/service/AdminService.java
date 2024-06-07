package cg.hntqfood_project.service;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface AdminService {
    void renderAccountManagement(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException;
    void renderProductManagement(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
    void editAccount(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
    void updateAccount(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}
