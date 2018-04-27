package eu.rafaelaznar.rest;

public class UserDAO {

    public User get() {
        User user = new User();
        user.setFirstName("Rafael");
        user.setLastName("Aznar");
        return user;
    }
}
