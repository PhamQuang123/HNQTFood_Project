package cg.hntqfood_project.service.impl;

import cg.hntqfood_project.exception.MessageError;
import cg.hntqfood_project.model.entity.Users;
import cg.hntqfood_project.service.AuthService;
import cg.hntqfood_project.service.UsersService;
import cg.hntqfood_project.validation.account.AccountValidate;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class AuthServiceImpl implements AuthService {
    private UsersService usersService;
    private AccountValidate accountValidate;

    public AuthServiceImpl() {
        usersService = new UsersServiceImp();
        accountValidate = new AccountValidate();
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
        String email = request.getParameter("username");
        String pass = request.getParameter("password");
        boolean rememberAccount = Boolean.parseBoolean(request.getParameter("rememberAccount"));

        Users users = checkEmailAndPAss(email, pass);
        Cookie emailCookie = new Cookie("email", users.getEmail());
        HttpSession session = request.getSession();
        emailCookie.setPath("/");
        Cookie[] cookies = request.getCookies();
        String emailCo = "";
        if (cookies.length != 0) {
            for (Cookie c : cookies
            ) {
                if (c.getName().equals("email")) {
                    emailCo = c.getValue();
                    break;
                }
            }
        }


        if (users != null || emailCo != null) {
            response.addCookie(emailCookie);

            session.setAttribute("users", users);

        } else {
            response.sendRedirect("/HNQTFood.com.vn/sign_in");
        }
        if (rememberAccount) {
            emailCookie.setMaxAge(24 * 60 * 60);
        }
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
        if (checkEmail && checkPass && checkPhone && checkBirthday) {
            Users users = new Users(fullName, gender, birthday, phone, email, pass);
            usersService.save(users);
        } else {

            request.setAttribute("first_name", firstName);
            request.setAttribute("last_name", lastName);
            request.setAttribute("gender", gender);

            if (checkEmail) {
                request.setAttribute("email", email);
            }else {
                request.setAttribute("email", MessageError.errEmailInv);
            }
            if (checkPass) {
                request.setAttribute("pass", pass);
            }{
                request.setAttribute("pass", MessageError.errPassInv);

            }
            if (checkPhone) {
                request.setAttribute("phone", phone);
            }else {
                request.setAttribute("phone", MessageError.errPhoneInv);

            }
            if (checkBirthday) {
                request.setAttribute("birthday", birthday);
            }else {
                request.setAttribute("birthday", MessageError.errBirthdayInv);

            }
            request.getRequestDispatcher("/views/access/signUp.jsp").forward(request,response);
        }

    }


    public Users checkEmailAndPAss(String email, String pass) {
        return usersService.findByEmailAndPass(email, pass);

    }
}
