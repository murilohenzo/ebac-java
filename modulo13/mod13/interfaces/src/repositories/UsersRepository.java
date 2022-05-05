package repositories;

import entities.User;

import java.util.ArrayList;
import java.util.Objects;

public interface UsersRepository {

    ArrayList<User> users = new ArrayList<>();

    default ArrayList<User> findAll() {
        return users;
    }

    default User findById(Integer id) {
        return users.get(id);
    }

    default User findByName(String name) {
        return users.stream().filter(u -> Objects.equals(u.getName(), name)).findFirst().orElse(null);
    };

    default void addUser(User user) {
        users.add(user);
    }

    default void remove(User user) {
        users.remove(user);
    }
}
