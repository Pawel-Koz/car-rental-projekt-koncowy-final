package pl.pawelkozlowski.service;

import pl.pawelkozlowski.entities.User;

import java.util.List;

public interface UserService {

    void addUser(User user);
    User showUser(Long id);
    List<User> showAllUsers();
    User findByEmail(String email);
    void update(User user);
    void deleteById(Long id);

}
