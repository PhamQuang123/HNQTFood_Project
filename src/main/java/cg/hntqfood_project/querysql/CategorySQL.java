package cg.hntqfood_project.querysql;

public class CategorySQL {
    public static final String CATEGORY_FIND_ALL = "call category_find_all()";
    public static final String CATEGORY_SAVE = "call category_save(?)";
    public static final String CATEGORY_UPDATE = "call category_update(?,?)";
    public static final String CATEGORY_DELETE = "call category_delete(?)";
    public static final String FIND_CATEGORY_BY_ID = "{call find_category_by_id(?)}";
    public static final String FIND_CATEGORY_NAME_BY_NAME = "call find_category_name_by_name(?)";
}
