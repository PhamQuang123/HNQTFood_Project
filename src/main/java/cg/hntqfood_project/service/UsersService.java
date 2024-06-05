package cg.hntqfood_project.service;

import cg.hntqfood_project.model.entity.Users;

import java.util.List;

public interface UsersService {
    List<Users> findAll();
    boolean save(Users users);
    boolean update(Users users);
    boolean delete(int id);
    Users findByEmailAndPass(String email, String pass);
    Users findUsersById(int id);
    List<Users> findUserNameByName(String userName);
}
