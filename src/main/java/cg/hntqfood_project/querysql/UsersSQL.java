package cg.hntqfood_project.querysql;

public class UsersSQL {
    public static final String users_find_all = "call users_find_all()";
    public static final String find_by_email_and_pass = "find_by_email_and_pass(?,?)";
    public static final String find_users_by_name = "";
    public static final String find_users_by_email = "call find_users_by_email(?)";
    public static final String find_users_by_phone = "call find_users_by_phone(?)";
    public static final String find_users_by_id = "";

    public static final String users_save = "call users_save(?,?,?,?,?,?)";
    public static final String users_update = "{call insert_user(?,?,?,?,?,?)}";
    public static final String admin_update_users = "";
    public static final String users_delete = "";

}
