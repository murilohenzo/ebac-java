package useCases;

import entities.User;
import repositories.UsersRepository;

import java.util.ArrayList;

public class FindAllUserUseCase {
    private UsersRepository usersRepository;

    public FindAllUserUseCase(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public ArrayList<User> execute() {
        return this.usersRepository.findAll();
    }
}
