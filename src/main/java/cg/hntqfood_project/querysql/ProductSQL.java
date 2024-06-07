package cg.hntqfood_project.querysql;

public class ProductSQL {
    public static String PRODUCT_FIND_ALL="call product_find_all()";
    public static String PRODUCT_FIND_ALL_LIMIT ="call product_find_all_limit(?)";
    public static String PRODUCT_TOTAL ="call product_total(?)";
    public static String PRODUCT_TOTAL_BY_CATEGORY_ID ="call product_total_by_category_id(?,?)";
    public static String PRODUCT_FIND_BY_CATEGORY_ID="call product_find_by_category_id(?)";
    public static String PRODUCT_FIND_BY_CATEGORY_ID_LIMIT="call product_find_by_category_id_limit(?)";
    public static String PRODUCT_FIND_PRICE_ASC="call product_find_price_asc()";
    public static String PRODUCT_FIND_PRICE_DESC="call product_find_price_desc()";
    public static String PRODUCT_FIND_BEST_SELLER="call product_find_best_seller()";
    public static String PRODUCT_SAVE = "call product_save(?,?,?,?,?,?)";
    public static String PRODUCT_UPDATE = "call product_update(?,?,?,?,?,?,?)";
    public static String PRODUCT_DELETE = "call product_delete(?)";
    public static String FIND_PRODUCT_BY_ID="call find_product_by_id(?)";
    public static String FIND_PRODUCT_BY_NAME="call find_product_by_name(?)";
    public static String SEARCH_PRODUCT_BY_NAME="call search_product_by_name(%?%)";
}
