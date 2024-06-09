package cg.hntqfood_project.service.impl;

import cg.hntqfood_project.model.entity.Category;
import cg.hntqfood_project.model.entity.Product;
import cg.hntqfood_project.model.entity.Users;
import cg.hntqfood_project.repository.CategoryRepository;
import cg.hntqfood_project.repository.ProductRepository;
import cg.hntqfood_project.repository.UsersRepository;
import cg.hntqfood_project.repository.impl.CategoryRepositoryImp;
import cg.hntqfood_project.repository.impl.ProductRepositoryImp;
import cg.hntqfood_project.repository.impl.UsersRepositoryImp;
import cg.hntqfood_project.service.AdminService;
import cg.hntqfood_project.validation.account.AccountValidate;
import cg.hntqfood_project.validation.product.ProductValidate;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class AdminServiceImp implements AdminService {
    private UsersRepository usersRepository;
    private ProductRepository productRepository;
    private CategoryRepository categoryRepository;
    private AccountValidate accountValidate;
    private ProductValidate productValidate;

    public AdminServiceImp() {
        usersRepository = new UsersRepositoryImp();
        productRepository = new ProductRepositoryImp();
        accountValidate = new AccountValidate();
        categoryRepository = new CategoryRepositoryImp();
        productValidate = new ProductValidate();
    }

    @Override
    public void renderAccountManagement(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        List<Users> listAccount = usersRepository.findAll();
        request.setAttribute("listAccount", listAccount);
        request.getRequestDispatcher("/views/admin/userManagement.jsp").forward(request, response);
    }

    @Override
    public void renderProductManagement(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product> listProduct = productRepository.findAll();
        request.setAttribute("listProduct", listProduct);
        request.getRequestDispatcher("/views/admin/productManagement.jsp").forward(request, response);
    }

    @Override
    public void editAccount(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Users users = usersRepository.findUsersById(id);
        request.setAttribute("users", users);
        request.getRequestDispatcher("/views/user/profileUser.jsp").forward(request, response);
    }

    @Override
    public void blockAccount(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        boolean status = Boolean.parseBoolean(request.getParameter("status"));
        Users users = usersRepository.findUsersById(id);
        users.setUserStatus(!status);
        usersRepository.adminUpdate(users);
        response.sendRedirect("/HNQTFood/admin/account");
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
        if (checkUpdatePass && checkUpdateBirthday && checkUpdatePhone) {
            Users users = new Users(id, name, avatar, address, gender, birthday, phone, pass, userStatus);
            usersRepository.update(users);
            response.sendRedirect("/HNQTFood/admin/account");
        } else {
            response.sendRedirect("/HNQTFood/admin/edit?id=" + id);
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
        if (checkUpdatePass && checkUpdateBirthday && checkUpdatePhone) {
            Users users = new Users(id, name, avatar, address, gender, birthday, phone, pass);
            usersRepository.update(users);
            response.sendRedirect("/HNQTFood/admin/account");
        } else {
            response.sendRedirect("/HNQTFood/admin/edit?id=" + id);
        }
    }


//    Them moi Product


    @Override
    public void renderFormCreateProduct(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        List<Category> listCate = categoryRepository.findAll();
        request.setAttribute("listCate",listCate);
       request.getRequestDispatcher("/views/activity/createProd.jsp").forward(request,response);
    }

    @Override
    public void createProduct(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String productName = request.getParameter("productName");
        double price = Double.parseDouble(request.getParameter("price"));
        int productStatus = Integer.parseInt(request.getParameter("productStatus"));
        String descriptions = request.getParameter("descriptions");
        String image = request.getParameter("image");
        int categoryId = Integer.parseInt(request.getParameter("categoryId"));
        Category category = categoryRepository.findCategoryById(categoryId);
        boolean checkProductName = productValidate.checkProductName(productName);
        if (checkProductName && price > 0) {
            Product product = new Product( productName, price, productStatus, descriptions, image, category);
            productRepository.save(product);
            response.sendRedirect("/HNQTFood/admin/product");
        } else {
            response.sendRedirect("/HNQTFood/admin/new_product");
        }
    }

    @Override
    public void editProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = productRepository.findProductById(id);
       List<Category> listCate = categoryRepository.findAll();
        request.setAttribute("product", product);
        request.setAttribute("listCate",listCate);
        request.getRequestDispatcher("/views/activity/updateProd.jsp").forward(request, response);
    }

    @Override
    public void updateProduct(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String productName = request.getParameter("productName");
        double price = Double.parseDouble(request.getParameter("price"));
        int productStatus = Integer.parseInt(request.getParameter("productStatus"));
        String descriptions = request.getParameter("descriptions");
        String image = request.getParameter("image");
        int categoryId = Integer.parseInt(request.getParameter("categoryId"));
        Category category = categoryRepository.findCategoryById(categoryId);
        boolean checkProductName = productValidate.checkProductName(productName);
        if (checkProductName) {
            Product product = new Product(id, productName, price, productStatus, descriptions, image, category);
            productRepository.update(product);
            response.sendRedirect("/HNQTFood/admin/product");
        } else {
            response.sendRedirect("/HNQTFood/admin/edit_product?id=" + id);
        }
    }

    @Override
    public void deleteProduct(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        productRepository.delete(id);
        response.sendRedirect("/HNQTFood/admin/product");

    }
}
