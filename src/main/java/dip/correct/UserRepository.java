package dip.correct;

public interface UserRepository {

    User getUser(int id);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(int id);

}
