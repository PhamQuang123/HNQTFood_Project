package cg.hntqfood_project.service;

import cg.hntqfood_project.model.entity.Users;

import java.util.List;

public interface UsersService {
    List<Users> findAll();
    void save(Users users);
    void update(Users users);
    void delete(int id);
    Users findUsersById(int id);
    List<Users> findUserNameByName(String userName);
}
