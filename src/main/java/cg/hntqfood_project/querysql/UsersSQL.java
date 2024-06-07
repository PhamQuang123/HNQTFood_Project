package cg.hntqfood_project.querysql;

public class UsersSQL {
    public static final String USERS_FIND_ALL = "call users_find_all()";
    public static final String FIND_USERS_BY_EMAIL_AND_PASS = "call find_users_by_email_and_pass(?,?)";
    public static final String FIND_USERS_BY_FULL_NAME = "call find_users_by_full_name(%?%)";
    public static final String FIND_USERS_BY_EMAIL = "call find_users_by_email(?)";
    public static final String FIND_USERS_BY_PHONE_NUMBER = "call find_users_by_phone_number(?)";
    public static final String FIND_USERS_BY_ID = "call find_users_by_id(?)";
    public static final String USERS_SAVE = "call users_save(?,?,?,?,?,?)";
    public static final String USERS_UPDATE = "call users_update(?,?,?,?,?,?,?,?,?)";
    public static final String ADMIN_USERS_UPDATE = "call admin_users_update(?,?,?,?,?,?,?,?,?,?,?,?)";
    public static final String USERS_DELETE = "call users_delete(?,?)";
}
