package pl.altkom.dependency.inversion;

import java.util.List;

public interface DAO {

    User findUserById(int id);

    void updateUser(User u);

    List<User> readAllUsers();
}
