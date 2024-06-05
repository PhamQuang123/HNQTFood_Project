package cg.hntqfood_project.service.impl;

import cg.hntqfood_project.model.entity.Users;
import cg.hntqfood_project.service.AuthService;
import cg.hntqfood_project.service.UsersService;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.plaf.basic.BasicBorders;
import java.io.IOException;

public class AuthServiceImpl implements AuthService {
    private UsersService usersService;

    public AuthServiceImpl() {
        usersService = new UsersServiceImp();
    }

    @Override
    public void renderSignIn(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       response.sendRedirect("/views/access/sigIn.jsp");
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

        Users users = checkEmailAndPAss(email, pass);
        Cookie emailCookie = new Cookie("email", users.getEmail());
        HttpSession session = request.getSession();
        emailCookie.setPath("/");
        Cookie[] cookies = request.getCookies();
        String emailCo = "";
        if (cookies.length != 0){
            for (Cookie c: cookies
            ) {
                if (c.getName().equals("email")){
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
    public void logout(HttpServletRequest request, HttpServletResponse response) {

    }

    public Users checkEmailAndPAss(String email, String pass) {
        return usersService.findByEmailAndPass(email, pass);

    }
}
