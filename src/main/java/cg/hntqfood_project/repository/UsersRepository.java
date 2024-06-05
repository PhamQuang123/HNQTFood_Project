package cg.hntqfood_project.repository;

import cg.hntqfood_project.model.entity.Users;

import java.util.List;

public interface UsersRepository {
    List<Users> findAll();
    boolean save(Users users);
    boolean update(Users users);
    boolean delete(int id);
    boolean adminUpdate(Users users);
    Users findUsersById(int id);
    Users findUserByEmail(String email);
    Users findUserByPhone(String phone);
    List<Users> findUserNameByName(String userName);
    Users findByEmailAndPass(String email, String pass);
}
