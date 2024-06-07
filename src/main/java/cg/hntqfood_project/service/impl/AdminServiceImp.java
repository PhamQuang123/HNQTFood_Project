package cg.hntqfood_project.service.impl;

import cg.hntqfood_project.model.entity.Product;
import cg.hntqfood_project.model.entity.Users;
import cg.hntqfood_project.repository.ProductRepository;
import cg.hntqfood_project.repository.UsersRepository;
import cg.hntqfood_project.repository.impl.ProductRepositoryImp;
import cg.hntqfood_project.repository.impl.UsersRepositoryImp;
import cg.hntqfood_project.service.AdminService;
import cg.hntqfood_project.validation.account.AccountValidate;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class AdminServiceImpl implements AdminService {
    private UsersRepository usersRepository;
    private ProductRepository productRepository;
    private AccountValidate accountValidate;

    public AdminServiceImpl() {
        usersRepository = new UsersRepositoryImp();
        productRepository = new ProductRepositoryImp();
        accountValidate = new AccountValidate();
    }

    @Override
    public void renderAccountManagement(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        List<Users> listAccount = usersRepository.findAll();
        request.setAttribute("listAccount", listAccount);
        request.getRequestDispatcher("/views/admin.jsp").forward(request, response);
    }

    @Override
    public void renderProductManagement(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product> listProduct = productRepository.findAll();
        request.setAttribute("listProduct", listProduct);
        request.getRequestDispatcher("").forward(request, response);
    }

    @Override
    public void editAccount(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Users users = usersRepository.findUsersById(id);
        request.setAttribute("users", users);
        request.getRequestDispatcher("").forward(request, response);
    }

    @Override
    public void adminUpdateAccount(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("fullName");
        String address = request.getParameter("address");
        int gender = Integer.parseInt("gender");
        String birthday = request.getParameter("birthday");
        String phone = request.getParameter("phoneNumber");
        String pass = request.getParameter("pass");
        boolean userStatus = Boolean.parseBoolean(request.getParameter("userStatus"));
        String avatar = request.getParameter("avatar");
        boolean checkUpdatePhone = accountValidate.checkPhone(phone);
        boolean checkUpdateBirthday = accountValidate.checkBirthday(birthday);
        boolean checkUpdatePass = accountValidate.checkPass(pass);
        if (checkUpdatePass && checkUpdateBirthday && checkUpdatePhone){
            Users users = new Users(id, name, avatar, address, gender, birthday, phone, pass, userStatus);
            usersRepository.update(users);
            response.sendRedirect("/HNQTFood/admin/account");
        }else {
            response.sendRedirect("/HNQTFood/admin/edit?id="+ id);
        }
    }

    @Override
    public void usersUpdateAccount(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("fullName");
        String address = request.getParameter("address");
        int gender = Integer.parseInt("gender");
        String birthday = request.getParameter("birthday");
        String phone = request.getParameter("phoneNumber");
        String pass = request.getParameter("pass");
        String avatar = request.getParameter("avatar");
        boolean checkUpdatePhone = accountValidate.checkPhone(phone);
        boolean checkUpdateBirthday = accountValidate.checkBirthday(birthday);
        boolean checkUpdatePass = accountValidate.checkPass(pass);
        if (checkUpdatePass && checkUpdateBirthday && checkUpdatePhone){
            Users users = new Users(id, name, avatar, address, gender, birthday, phone, pass);
            usersRepository.update(users);
            response.sendRedirect("/HNQTFood/admin/account");
        }else {
            response.sendRedirect("/HNQTFood/admin/edit?id="+ id);
        }
    }
}
