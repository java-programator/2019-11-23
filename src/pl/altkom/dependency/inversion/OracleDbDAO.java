package pl.altkom.dependency.inversion;

import java.util.List;

public class OracleDbDAO implements DAO {
    @Override
    public User findUserById(int id) {
        return null;
    }

    @Override
    public void updateUser(User u) {

    }

    @Override
    public List<User> readAllUsers() {
        return null;
    }
}
