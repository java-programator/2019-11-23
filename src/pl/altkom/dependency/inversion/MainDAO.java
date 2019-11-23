package pl.altkom.dependency.inversion;

public class MainDAO {
    public static void main(String[] args) {
        MySqlDAO dao = new MySqlDAO();

        User u1 = new User();
        dao.updateUser(u1);

        User u2 = new User();
        dao.updateUser(u2);

        for (User u : dao.readAllUsers()) {
            // zrób coś z userm
            dao.updateUser(u);
        }

        for (User u : dao.readAllUsers()) {
            System.out.println(u);
        }
    }

}
