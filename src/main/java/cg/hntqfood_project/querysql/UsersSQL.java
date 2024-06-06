package cg.hntqfood_project.querysql;

public class UsersSQL {
<<<<<<< HEAD
    public static final String users_find_all = "call users_find_all()";
    public static final String find_by_email_and_pass = "call find_users_by_email_and_pass(?,?)";
    public static final String find_users_by_name = "call find_users_by_full_name(%?%)";
    public static final String find_users_by_email = "call find_users_by_email(?)";
    public static final String find_users_by_phone = "call find_users_by_phone_number(?)";
    public static final String find_users_by_id = "call find_users_by_id";

    public static final String users_save = "call users_save(?,?,?,?,?,?)";
    public static final String users_update = "{call insert_user(?,?,?,?,?,?)}";
    public static final String admin_update_users = "";
    public static final String users_delete = "";

=======
    public static final String USERS_FIND_ALL = "call users_find_all()";
    public static final String FIND_BY_EMAIL_AND_PASS = "call find_by_email_and_pass(?,?)";
    public static final String FIND_USERS_BY_FULL_NAME = "call find_users_by_full_name(%?%)";
    public static final String FIND_USERS_BY_EMAIL = "call find_users_by_email(?)";
    public static final String FIND_USERS_BY_PHONE_NUMBER = "call find_users_by_phone_number(?)";
    public static final String FIND_USERS_BY_ID = "call find_users_by_id(?)";
    public static final String USERS_SAVE = "call users_save(?,?,?,?,?,?)";
    public static final String USERS_UPDATE = "call users_update(?,?,?,?,?,?,?,?,?)";
    public static final String ADMIN_USERS_UPDATE = "cal admin_users_update(?,?,?,?,?,?,?,?,?,?,?,?)";
    public static final String USERS_DELETE = "call users_delete(?,?)";
>>>>>>> 4cb299c465193894bb951619ba7cbee00cd44ce7
}
