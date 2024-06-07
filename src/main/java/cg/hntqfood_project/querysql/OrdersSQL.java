package cg.hntqfood_project.querysql;

public class OrdersSQL {
    public static String ORDERS_FIND_ALL="call orders_find_all()";
    public static String ORDERS_SAVE="call orders_save(?,?,?,?,?)";
    public static String ORDERS_UPDATE="call orders_update(?,?,?,?,?,?)";
    public static String ORDERS_DELETE="call orders_delete(?)";
    public static String FIND_ORDERS_BY_ID="call find_orders_by_id(?)";

}
