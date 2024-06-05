package cg.hntqfood_project.validation.regex;

import java.util.regex.Pattern;

public class RegexUsers {
    private static final String regexEmail = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-](\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
    private static final String regexPass = "\\w{6,12}";
    private static final String regexPhone = "^(84|0[3|5|7|8|9])+([0-9]{8})$";

    public static boolean checkRegexEmail(String email) {
        if (Pattern.matches(regexEmail, email)) {
            return true;
        }
        return false;
    }

    public static boolean checkRegexPass(String pass) {
        if (Pattern.matches(regexPass, pass)) {
            return true;
        }
        return false;
    }

    public static boolean checkRegexPhone(String phone) {
        if (Pattern.matches(regexPhone, phone)) {
            return true;
        }
        return false;
    }
}
