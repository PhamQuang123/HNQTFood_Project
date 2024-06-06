package cg.hntqfood_project.repository.impl;

import cg.hntqfood_project.config.ConnectionDB;
import cg.hntqfood_project.model.entity.Users;
import cg.hntqfood_project.querysql.UsersSQL;
import cg.hntqfood_project.repository.UsersRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsersRepositoryImp implements UsersRepository {
    private Connection conn;

    @Override
    public List<Users> findAll() {
        CallableStatement callSt = null;
        List<Users> listUsers = null;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall(UsersSQL.users_find_all);
            listUsers = new ArrayList<>();
            ResultSet rs = callSt.executeQuery();

            while (rs.next()) {
                Users users = new Users();
                users.setId(rs.getInt("id"));
                users.setFullName(rs.getString("fullName"));
                users.setAvatar(rs.getString("avatar"));
                users.setAddress(rs.getString("address"));
                users.setGender(rs.getInt("gender"));
                users.setBirthday(rs.getDate("birthday").toString());
                users.setPhoneNumber(rs.getString("phoneNumber"));
                users.setEmail(rs.getString("email"));
                users.setPass(rs.getString("pass"));
                users.setRoleUser(rs.getInt("roleUser"));
                users.setUserStatus(rs.getBoolean("userStatus"));
                users.setRememberAccount(rs.getBoolean("rememberAccount"));
                listUsers.add(users);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return listUsers;
    }



    @Override
    public boolean save(Users users) {
        boolean result = false;
        CallableStatement callSt = null;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall(UsersSQL.users_save);
            callSt.setString(1, users.getFullName());
            callSt.setInt(2, users.isGender());
            callSt.setString(3, users.getBirthday());
            callSt.setString(4, users.getPhoneNumber());
            callSt.setString(5, users.getEmail());
            callSt.setString(6, users.getPass());
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
    public boolean update(Users users) {
        boolean result = false;
        CallableStatement callSt = null;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall(UsersSQL.users_update);
            callSt.setInt(1, users.getId());
            callSt.setString(2, users.getFullName());
            callSt.setString(3, users.getAvatar());
            callSt.setString(4, users.getAddress());
            callSt.setInt(5, users.isGender());
            callSt.setString(6, users.getBirthday());
            callSt.setString(7, users.getPhoneNumber());
            callSt.setString(8, users.getPass());
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
            callSt = conn.prepareCall(UsersSQL.users_delete);
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
    public boolean adminUpdate(Users users) {
        boolean result = false;
        CallableStatement callSt = null;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall(UsersSQL.admin_update_users);
            callSt.setInt(1, users.getId());
            callSt.setString(2, users.getFullName());
            callSt.setString(3, users.getAvatar());
            callSt.setString(4, users.getAddress());
            callSt.setInt(5, users.isGender());
            callSt.setString(6, users.getBirthday());
            callSt.setString(7, users.getPhoneNumber());
            callSt.setString(8, users.getPass());
            callSt.setInt(9, users.getRoleUser());
            callSt.setBoolean(10, users.isUserStatus());
            callSt.setBoolean(11, users.isRememberAccount());
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
    public Users findUsersById(int id) {
        CallableStatement callSt = null;
        Users users = null;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall(UsersSQL.find_users_by_id);
            callSt.setInt(1, id);
            ResultSet rs = callSt.executeQuery();
            if (rs.next()) {
                users = new Users();
                users.setId(rs.getInt("id"));
                users.setFullName(rs.getString("fullName"));
                users.setAvatar(rs.getString("avatar"));
                users.setAddress(rs.getString("address"));
                users.setGender(rs.getInt("gender"));
                users.setBirthday(rs.getDate("birthday").toString());
                users.setPhoneNumber(rs.getString("phoneNumber"));
                users.setEmail(rs.getString("email"));
                users.setPass(rs.getString("pass"));
                users.setRoleUser(rs.getInt("roleUser"));
                users.setUserStatus(rs.getBoolean("userStatus"));
                users.setRememberAccount(rs.getBoolean("rememberAccount"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return users;
    }

    @Override
    public Users findUserByEmail(String email) {
        CallableStatement callSt = null;
        Users users = null;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall(UsersSQL.find_users_by_email);
            callSt.setString(1, email);
            ResultSet rs = callSt.executeQuery();
            if (rs.next()) {
                users = new Users();
                users.setId(rs.getInt("id"));
                users.setFullName(rs.getString("fullName"));
                users.setAvatar(rs.getString("avatar"));
                users.setAddress(rs.getString("address"));
                users.setGender(rs.getInt("gender"));
                users.setBirthday(rs.getDate("birthday").toString());
                users.setPhoneNumber(rs.getString("phoneNumber"));
                users.setEmail(rs.getString("email"));
                users.setPass(rs.getString("pass"));
                users.setRoleUser(rs.getInt("roleUser"));
                users.setUserStatus(rs.getBoolean("userStatus"));
                users.setRememberAccount(rs.getBoolean("rememberAccount"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return users;
    }

    @Override
    public Users findUserByPhone(String phone) {
        CallableStatement callSt = null;
        Users users = null;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall(UsersSQL.find_users_by_phone);
            callSt.setString(1, phone);
            ResultSet rs = callSt.executeQuery();
            if (rs.next()) {
                users = new Users();
                users.setId(rs.getInt("id"));
                users.setFullName(rs.getString("fullName"));
                users.setAvatar(rs.getString("avatar"));
                users.setAddress(rs.getString("address"));
                users.setGender(rs.getInt("gender"));
                users.setBirthday(rs.getDate("birthday").toString());
                users.setPhoneNumber(rs.getString("phoneNumber"));
                users.setEmail(rs.getString("email"));
                users.setPass(rs.getString("pass"));
                users.setRoleUser(rs.getInt("roleUser"));
                users.setUserStatus(rs.getBoolean("userStatus"));
                users.setRememberAccount(rs.getBoolean("rememberAccount"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return users;
    }

    @Override
    public List<Users> findUserNameByName(String userName) {
        CallableStatement callSt = null;
        List<Users> listUsers = null;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall(UsersSQL.find_users_by_name);
            callSt.setString(1, userName);
            ResultSet rs = callSt.executeQuery();
            listUsers = new ArrayList<>();
            while (rs.next()) {
                Users users = new Users();
                users.setId(rs.getInt("id"));
                users.setFullName(rs.getString("fullName"));
                users.setAvatar(rs.getString("avatar"));
                users.setAddress(rs.getString("address"));
                users.setGender(rs.getInt("gender"));
                users.setBirthday(rs.getDate("birthday").toString());
                users.setPhoneNumber(rs.getString("phoneNumber"));
                users.setEmail(rs.getString("email"));
                users.setPass(rs.getString("pass"));
                users.setRoleUser(rs.getInt("roleUser"));
                users.setUserStatus(rs.getBoolean("userStatus"));
                users.setRememberAccount(rs.getBoolean("rememberAccount"));
                listUsers.add(users);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return listUsers;
    }

    @Override
    public Users findByEmailAndPass(String email, String pass) {
        CallableStatement callSt = null;
        Users users = null;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall(UsersSQL.find_by_email_and_pass);
            callSt.setString(1, email);
            callSt.setString(2, pass);
            ResultSet rs = callSt.executeQuery();
            if (rs.next()) {
                users = new Users();
                users.setId(rs.getInt("id"));
                users.setFullName(rs.getString("fullName"));
                users.setAvatar(rs.getString("avatar"));
                users.setAddress(rs.getString("address"));
                users.setGender(rs.getInt("gender"));
                users.setBirthday(rs.getDate("birthday").toString());
                users.setPhoneNumber(rs.getString("phoneNumber"));
                users.setEmail(rs.getString("email"));
                users.setPass(rs.getString("pass"));
                users.setRoleUser(rs.getInt("roleUser"));
                users.setUserStatus(rs.getBoolean("userStatus"));
                users.setRememberAccount(rs.getBoolean("rememberAccount"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return users;
    }
}
