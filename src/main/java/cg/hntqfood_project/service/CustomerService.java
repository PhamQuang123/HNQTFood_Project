package cg.hntqfood_project.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface CustomerService {
    boolean editAccount(HttpServletRequest request, HttpServletResponse response);
}
