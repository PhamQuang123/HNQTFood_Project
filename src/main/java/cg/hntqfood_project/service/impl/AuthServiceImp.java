package cg.hntqfood_project.service.impl;

import cg.hntqfood_project.exception.MessageError;
import cg.hntqfood_project.model.entity.Product;
import cg.hntqfood_project.model.entity.Users;
import cg.hntqfood_project.repository.ProductRepository;
import cg.hntqfood_project.repository.UsersRepository;
import cg.hntqfood_project.repository.impl.ProductRepositoryImp;
import cg.hntqfood_project.repository.impl.UsersRepositoryImp;
import cg.hntqfood_project.service.AuthService;
import cg.hntqfood_project.validation.account.AccountValidate;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

public class AuthServiceImp implements AuthService {
    private UsersRepository usersRepository;
    private AccountValidate accountValidate;
    private ProductRepository productRepository;

    public AuthServiceImp() {
        usersRepository = new UsersRepositoryImp();
        accountValidate = new AccountValidate();
        productRepository = new ProductRepositoryImp();
    }

    @Override
    public void renderSignIn(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("/views/access/signIn.jsp");
    }

    @Override
    public void renderSignUp(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect("/views/access/signUp.jsp");
    }

    @Override
    public void login(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String email = request.getParameter("email");
        String pass = request.getParameter("pass");
        boolean rememberAccount = Boolean.parseBoolean(request.getParameter("rememberAccount"));
        Users users = accountValidate.checkEmailAndPAss(email, pass);
        if (users != null && users.isUserStatus()) {
            users.setRememberAccount(rememberAccount);
            Cookie emailCookie = new Cookie("emailCo", users.getEmail());
            HttpSession session = request.getSession();
            emailCookie.setPath("/");
            session.setAttribute("users", users);
            if (rememberAccount) {
                emailCookie.setMaxAge(24 * 60 * 60);
                session.setMaxInactiveInterval(24*60*60);
            }
            response.addCookie(emailCookie);
        } else {
            request.setAttribute("err", MessageError.errEmailOrPass);
            request.getRequestDispatcher("/views/access/signIn.jsp").forward(request, response);
        }
        List<Product> listBestSeller = productRepository.findBestSeller();
        List<Product> listFood = productRepository.findByCategoryId(1);
        List<Product> listDrink = productRepository.findByCategoryId(2);
        request.setAttribute("listFood", listFood);
        request.setAttribute("listDrink", listDrink);
        request.setAttribute("listBestSeller",listBestSeller);

        request.getRequestDispatcher("/views/home.jsp").forward(request, response);
    }

    @Override
    public void register(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("first_name");
        String lastName = request.getParameter("last_name");
        String fullName = firstName + " " + lastName;
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String pass = request.getParameter("pass");
        String reconfirmPass = request.getParameter("reconfirm_pass");
        int gender = Integer.parseInt(request.getParameter("gender"));
        String birthday = request.getParameter("birthday");
        boolean checkEmail = accountValidate.checkEmail(email);
        boolean checkPass = accountValidate.checkPass(pass);
        boolean checkPhone = accountValidate.checkPhone(phone);
        boolean checkBirthday = accountValidate.checkBirthday(birthday);
        if (checkEmail && checkPass && checkPhone && checkBirthday && pass.equals(reconfirmPass)) {
            Users users = new Users(fullName, gender, birthday, phone, email, pass);
            usersRepository.save(users);
            response.sendRedirect("/HNQTFood/sign_in");

        } else {

            request.setAttribute("first_name", firstName);
            request.setAttribute("last_name", lastName);
            request.setAttribute("gender", gender);

            if (checkEmail) {
                request.setAttribute("email", email);
                request.setAttribute("errEmail", "");

            } else {
                request.setAttribute("email", "");
                request.setAttribute("errEmail", MessageError.errEmailInv);
            }
            if (checkPass) {
                request.setAttribute("pass", pass);
                request.setAttribute("errPass", "");

            } else {
                request.setAttribute("pass", "");
                request.setAttribute("errPass", MessageError.errPassInv);

            }
            if (checkPhone) {
                request.setAttribute("phone", phone);
                request.setAttribute("errPhone", "");

            } else {
                request.setAttribute("phone", "");
                request.setAttribute("errPhone", MessageError.errPhoneInv);

            }
            if (checkBirthday) {
                request.setAttribute("birthday", birthday);
                request.setAttribute("errBirthday", "");
            } else {
                request.setAttribute("birthday", "");
                request.setAttribute("errBirthday", MessageError.errBirthdayInv);
            }
            if (pass.equals(reconfirmPass)) {
                request.setAttribute("errReconfirmPass", "");
            } else {
                request.setAttribute("errReconfirmPass", MessageError.errReconfirmPass);
            }
            request.getRequestDispatcher("/views/access/signUp.jsp").forward(request, response);
        }

    }
}
