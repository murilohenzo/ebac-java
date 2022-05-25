package repositories;

import entities.User;

import java.util.ArrayList;

public class UsersRepositoryInMemory implements UsersRepository{
    @Override
    public ArrayList<User> findAll() {
        return UsersRepository.super.findAll();
    }

    @Override
    public User findById(Integer id) {
        return UsersRepository.super.findById(id);
    }

    @Override
    public User findByName(String name) {
        return UsersRepository.super.findByName(name);
    }

    @Override
    public void addUser(User user) {
        UsersRepository.super.addUser(user);
    }

    @Override
    public void remove(User user) {
        UsersRepository.super.remove(user);
    }
}
