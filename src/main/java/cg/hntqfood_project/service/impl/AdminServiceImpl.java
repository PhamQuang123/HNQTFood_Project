package cg.hntqfood_project.service.impl;

import cg.hntqfood_project.model.entity.Product;
import cg.hntqfood_project.model.entity.Users;
import cg.hntqfood_project.repository.ProductRepository;
import cg.hntqfood_project.repository.UsersRepository;
import cg.hntqfood_project.repository.impl.ProductRepositoryImp;
import cg.hntqfood_project.repository.impl.UsersRepositoryImp;
import cg.hntqfood_project.service.AdminService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class AdminServiceImpl implements AdminService {
    private UsersRepository usersRepository;
    private ProductRepository productRepository;
    
    public AdminServiceImpl(){
        usersRepository = new UsersRepositoryImp();
        productRepository = new ProductRepositoryImp();
    }
    @Override
    public void renderAccountManagement(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        List<Users> listAccount = usersRepository.findAll();
        request.setAttribute("listAccount",listAccount);
        request.getRequestDispatcher("/views/admin.jsp").forward(request,response);
    }

    @Override
    public void renderProductManagement(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product> listProduct = productRepository.findAll();
        request.setAttribute("listProduct",listProduct);
        request.getRequestDispatcher("").forward(request,response);
    }

    @Override
    public void editAccount(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Users users = usersRepository.findUsersById(id);
        request.setAttribute("users",users);
        request.getRequestDispatcher("").forward(request,response);
    }

    @Override
    public void updateAccount(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    }
}
