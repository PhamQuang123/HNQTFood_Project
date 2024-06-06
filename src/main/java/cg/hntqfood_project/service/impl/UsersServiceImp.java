package cg.hntqfood_project.service.impl;

import cg.hntqfood_project.model.entity.Users;
import cg.hntqfood_project.repository.UsersRepository;
import cg.hntqfood_project.repository.impl.UsersRepositoryImp;
import cg.hntqfood_project.service.UsersService;

import java.util.List;

public class UsersServiceImp implements UsersService {
    private UsersRepository usersRepository;
    public UsersServiceImp(){
        usersRepository = new UsersRepositoryImp();
    }


    @Override
    public Users findByEmailAndPass(String email, String pass) {
        return usersRepository.findByEmailAndPass(email,pass);
    }

    @Override
    public List<Users> findAll() {

        return null;
    }

    @Override
    public boolean save(Users users) {

        return usersRepository.save(users);
    }

    @Override
    public boolean update(Users users) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public Users findUsersById(int id) {
        return null;
    }

    @Override
    public List<Users> findUserNameByName(String userName) {
        return null;
    }
}
