package cg.hntqfood_project.repository;

import cg.hntqfood_project.model.entity.Users;

import java.util.List;

public interface UsersRepository {
    List<Users> findAll();
    void save(Users users);
    void update(Users users);
    void delete(int id);
    Users findUsersById(int id);
    List<Users> findUserNameByName(String userName);
}
