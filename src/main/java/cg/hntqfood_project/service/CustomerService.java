package cg.hntqfood_project.service;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface CustomerService {
    void editAccount(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
    void updateAccount(HttpServletRequest request, HttpServletResponse response) throws IOException;
}
