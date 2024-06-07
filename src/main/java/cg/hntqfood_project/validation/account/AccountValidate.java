package cg.hntqfood_project.validation.account;

import cg.hntqfood_project.model.entity.Users;
import cg.hntqfood_project.repository.UsersRepository;
import cg.hntqfood_project.repository.impl.UsersRepositoryImp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class AccountValidate {
    private UsersRepository usersRepository;
    private String REGEX_EMAIL = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
    private String REGEX_PASS = "^(?=.*[a-zA-Z])(?=.*\\d)(?=.*[@#$%^&+=])[a-zA-Z\\d@#$%^&+=]{6,32}$";
    private String REGEX_PHONE = "^(84|0[3|5|7|8|9])+([0-9]{8})$";

    public AccountValidate() {
        usersRepository = new UsersRepositoryImp();
    }

    public boolean checkEmail(String email) {
        boolean result = false;

        if (Pattern.matches(REGEX_EMAIL, email)) {
            Users user = usersRepository.findUserByEmail(email);
            if (user != null) {
                result = false;
            } else {
                result = true;
            }
        }
        return result;
    }

    public boolean checkPass(String pass) {
        if (Pattern.matches(REGEX_PASS, pass)) {
            return true;
        }
        return false;
    }

    public boolean checkPhone(String phone) {
        boolean result = false;

        if (Pattern.matches(REGEX_PHONE,phone)) {
            String b = "";
           if (phone.length() == 10){
               b+= phone.substring(1);
           }
            Users user = usersRepository.findUserByPhoneNumber(b);

            if (user != null) {
                result = false;
            } else {
                result = true;
            }
        }
        return result;
    }

    public boolean checkBirthday(String birthday) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        boolean result = false;
        String year = "";
        String preYear = "";
        try {
            if (!birthday.equals("")) {
                Date b = sdf.parse(birthday);
                Date presentYear = new Date();
                sdf.applyPattern("yyyy");
                year = sdf.format(b);
                preYear = sdf.format(presentYear);
                if (Integer.parseInt(year) <= (Integer.parseInt(preYear) - 16)) {
                    result = true;
                }
            }
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    public Users checkEmailAndPAss(String email, String pass) {
        Users users = new Users();
        if (email.equals("") || pass.equals("")) {
          return  null;
        } else {
            users = usersRepository.findByEmailAndPass(email, pass);
        }
        return users;
    }
}
