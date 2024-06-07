package cg.hntqfood_project.repository.impl;

import cg.hntqfood_project.config.ConnectionDB;
import cg.hntqfood_project.model.entity.Category;
import cg.hntqfood_project.model.entity.Product;
import cg.hntqfood_project.querysql.ProductSQL;
import cg.hntqfood_project.repository.CategoryRepository;
import cg.hntqfood_project.repository.ProductRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImp implements ProductRepository {
    private CategoryRepository categoryRepository = new CategoryRepositoryImp();
    private Connection conn;
    public ProductRepositoryImp(){
        conn = ConnectionDB.openConnection();
    }
    @Override
    public List<Product> findAll() {
        CallableStatement callSt = null;
        List<Product> listProduct = null;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall(ProductSQL.PRODUCT_FIND_ALL);
            listProduct = new ArrayList<>();
            ResultSet rs = callSt.executeQuery();

            while (rs.next()) {
                Product product = new Product();
                product.setId(rs.getInt("id"));
                product.setProductName(rs.getString("productName"));
                product.setPrice(rs.getDouble("price"));
                product.setProductStatus(rs.getInt("productStatus"));
                product.setDescriptions(rs.getString("descriptions"));
                product.setImage(rs.getString("image"));
                int categoryId = rs.getInt("category_id");
                Category category = categoryRepository.findCategoryById(categoryId);
                product.setCategory(category);
                listProduct.add(product);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return listProduct;
    }

    @Override
    public boolean save(Product product) {
        boolean result = false;
        CallableStatement callSt = null;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall(ProductSQL.PRODUCT_SAVE);
            callSt.setString(1, product.getProductName());
            callSt.setDouble(2, product.getPrice());
            callSt.setInt(3,product.getProductStatus());
            callSt.setString(4,product.getDescriptions());
            callSt.setString(5, product.getImage());
            callSt.setInt(6, product.getCategory().getId());
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
    public boolean update(Product product) {
        boolean result = false;
        CallableStatement callSt = null;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall(ProductSQL.PRODUCT_UPDATE);
            callSt.setInt(1, product.getId());
            callSt.setString(2, product.getProductName());
            callSt.setDouble(3, product.getPrice());
            callSt.setInt(4,product.getProductStatus());
            callSt.setString(5, product.getDescriptions());
            callSt.setString(6, product.getImage());
            callSt.setInt(7, product.getCategory().getId());
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
            callSt = conn.prepareCall(ProductSQL.PRODUCT_DELETE);
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
    public Product findProductById(int id) {
        CallableStatement callSt = null;
        Product product = null;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall(ProductSQL.FIND_PRODUCT_BY_ID);
            callSt.setInt(1, id);
            ResultSet rs = callSt.executeQuery();
            if (rs.next()) {
                product = new Product();
                product.setId(rs.getInt("id"));
                product.setProductName(rs.getString("productName"));
                product.setPrice(rs.getDouble("price"));
                product.setProductStatus(rs.getInt("productStatus"));
                product.setDescriptions(rs.getString("descriptions"));
                product.setImage(rs.getString("image"));
                int categoryId = rs.getInt("category_id");
                Category category = categoryRepository.findCategoryById(categoryId);
                product.setCategory(category);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return product;
    }

    @Override
    public Product findProductByName(String productName) {
        CallableStatement callSt = null;
        Product product = null;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall(ProductSQL.FIND_PRODUCT_BY_NAME);
            callSt.setString(1,productName);
            ResultSet rs = callSt.executeQuery();

            while (rs.next()) {
                product = new Product();
                product.setId(rs.getInt("id"));
                product.setProductName(rs.getString("productName"));
                product.setPrice(rs.getDouble("price"));
                product.setProductStatus(rs.getInt("productStatus"));
                product.setDescriptions(rs.getString("descriptions"));
                product.setImage(rs.getString("image"));
                int categoryId = rs.getInt("category_id");
                Category category = categoryRepository.findCategoryById(categoryId);
                product.setCategory(category);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return product;
    }

    @Override
    public int productTotal() {
        CallableStatement callSt = null;
        int sum = 0;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall(ProductSQL.PRODUCT_TOTAL);
            callSt.registerOutParameter(1, Types.INTEGER);
             callSt.execute();
             sum = callSt.getInt(1);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return sum;
    }

    @Override
    public List<Product> findBestSeller() {
        CallableStatement callSt = null;
        List<Product> listBestSeller = null;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall(ProductSQL.PRODUCT_FIND_BEST_SELLER);
            listBestSeller = new ArrayList<>();
            ResultSet rs = callSt.executeQuery();

            while (rs.next()) {
                Product product = new Product();
                product.setId(rs.getInt("id"));
                product.setProductName(rs.getString("productName"));
                product.setPrice(rs.getDouble("price"));
                product.setProductStatus(rs.getInt("productStatus"));
                product.setDescriptions(rs.getString("descriptions"));
                product.setImage(rs.getString("image"));
                int categoryId = rs.getInt("category_id");
                Category category = categoryRepository.findCategoryById(categoryId);
                product.setCategory(category);
                listBestSeller.add(product);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return listBestSeller;
    }

    @Override
    public List<Product> findPriceAsc() {
        CallableStatement callSt = null;
        List<Product> listBestSeller = null;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall(ProductSQL.PRODUCT_FIND_PRICE_ASC);
            listBestSeller = new ArrayList<>();
            ResultSet rs = callSt.executeQuery();

            while (rs.next()) {
                Product product = new Product();
                product.setId(rs.getInt("id"));
                product.setProductName(rs.getString("productName"));
                product.setPrice(rs.getDouble("price"));
                product.setProductStatus(rs.getInt("productStatus"));
                product.setDescriptions(rs.getString("descriptions"));
                product.setImage(rs.getString("image"));
                int categoryId = rs.getInt("category_id");
                Category category = categoryRepository.findCategoryById(categoryId);
                product.setCategory(category);
                listBestSeller.add(product);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return listBestSeller;
    }

    @Override
    public List<Product> findPriceDesc() {
        CallableStatement callSt = null;
        List<Product> listBestSeller = null;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall(ProductSQL.PRODUCT_FIND_PRICE_DESC);
            listBestSeller = new ArrayList<>();
            ResultSet rs = callSt.executeQuery();

            while (rs.next()) {
                Product product = new Product();
                product.setId(rs.getInt("id"));
                product.setProductName(rs.getString("productName"));
                product.setPrice(rs.getDouble("price"));
                product.setProductStatus(rs.getInt("productStatus"));
                product.setDescriptions(rs.getString("descriptions"));
                product.setImage(rs.getString("image"));
                int categoryId = rs.getInt("category_id");
                Category category = categoryRepository.findCategoryById(categoryId);
                product.setCategory(category);
                listBestSeller.add(product);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return listBestSeller;
    }

    @Override
    public List<Product> findAllLimit(int offset) {
        CallableStatement callSt = null;
        List<Product> listProduct = null;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall(ProductSQL.PRODUCT_FIND_ALL_LIMIT);
            callSt.setInt(1, offset);
            listProduct = new ArrayList<>();
            ResultSet rs = callSt.executeQuery();

            while (rs.next()) {
                Product product = new Product();
                product.setId(rs.getInt("id"));
                product.setProductName(rs.getString("productName"));
                product.setPrice(rs.getDouble("price"));
                product.setProductStatus(rs.getInt("productStatus"));
                product.setDescriptions(rs.getString("descriptions"));
                product.setImage(rs.getString("image"));
                int categoryId = rs.getInt("category_id");
                Category category = categoryRepository.findCategoryById(categoryId);
                product.setCategory(category);
                listProduct.add(product);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return listProduct;
    }

    @Override
    public List<Product> findByCategoryId(int categoryId) {
        CallableStatement callSt = null;
        List<Product> listProduct = null;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall(ProductSQL.PRODUCT_FIND_BY_CATEGORY_ID);
            callSt.setInt(1, categoryId);
            listProduct = new ArrayList<>();
            ResultSet rs = callSt.executeQuery();

            while (rs.next()) {
                Product product = new Product();
                product.setId(rs.getInt("id"));
                product.setProductName(rs.getString("productName"));
                product.setPrice(rs.getDouble("price"));
                product.setProductStatus(rs.getInt("productStatus"));
                product.setDescriptions(rs.getString("descriptions"));
                product.setImage(rs.getString("image"));
                Category category = categoryRepository.findCategoryById(categoryId);
                product.setCategory(category);
                listProduct.add(product);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return listProduct;
    }

    @Override
    public int totalByCategoryId(int categoryId) {
        CallableStatement callSt = null;
        int sum = 0;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall(ProductSQL.PRODUCT_TOTAL_BY_CATEGORY_ID);
            callSt.setInt(1,categoryId);
            callSt.registerOutParameter(2, Types.INTEGER);
            callSt.execute();
            sum = callSt.getInt(2);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return sum;
    }
}
