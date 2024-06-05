package cg.hntqfood_project.repository.impl;

import cg.hntqfood_project.config.ConnectionDB;
import cg.hntqfood_project.model.entity.Category;
import cg.hntqfood_project.querysql.CategorySQL;
import cg.hntqfood_project.repository.CategoryRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategoryRepositoryImpl implements CategoryRepository {
    private Connection conn;

    @Override
    public List<Category> findAll() {
        CallableStatement callSt = null;
        List<Category> listCategories = null;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall(CategorySQL.find_all_category);
            listCategories = new ArrayList<>();
            ResultSet rs = callSt.executeQuery();

            while (rs.next()) {
                Category categories = new Category();
                categories.setId(rs.getInt("id"));
                categories.setCategoryName(rs.getString("categoryName"));
                listCategories.add(categories);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return listCategories;
    }

    @Override
    public boolean save(Category category) {
        boolean result = false;
        CallableStatement callSt = null;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall(CategorySQL.save_category);
            callSt.setString(1, category.getCategoryName());
            callSt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return result;
    }

    @Override
    public boolean update(Category category) {
        boolean result = false;
        CallableStatement callSt = null;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall(CategorySQL.save_category);
            callSt.setInt(1, category.getId());
            callSt.setString(2, category.getCategoryName());
            callSt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return result;
    }

    @Override
    public boolean delete(int id) {
        boolean result = false;
        CallableStatement callSt = null;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall(CategorySQL.delete_category);
            callSt.setInt(1, id);
            callSt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return result;
    }

    @Override
    public Category findCategoryById(int id) {
        CallableStatement callSt = null;
        Category category = null;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall(CategorySQL.find_category_by_id);
            callSt.setInt(1, id);
            ResultSet rs = callSt.executeQuery();
            Category categories = new Category();
            if (rs.next()) {
                categories.setId(rs.getInt("id"));
                categories.setCategoryName(rs.getString("categoryName"));

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return category;
    }

    @Override
    public List<Category> findCategoryByName(String categoryName) {
        CallableStatement callSt = null;
        List<Category> listCategory = null;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall(CategorySQL.find_category_by_id);
            callSt.setString(1, categoryName);
            ResultSet rs = callSt.executeQuery();
            listCategory = new ArrayList<>();
            while (rs.next()) {
                Category categories = new Category();
                categories.setId(rs.getInt("id"));
                categories.setCategoryName(rs.getString("categoryName"));
                listCategory.add(categories);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return listCategory;
    }

}
