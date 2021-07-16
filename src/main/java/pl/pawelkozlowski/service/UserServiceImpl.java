package pl.pawelkozlowski.service;

import lombok.AllArgsConstructor;
import org.mindrot.jbcrypt.BCrypt;
import pl.pawelkozlowski.entities.User;
import pl.pawelkozlowski.repository.UserRepository;

import java.util.List;
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;



    @Override
    public void addUser(User user) {
        user.setPassword(BCrypt.hashpw(user.getPassword(), BCrypt.gensalt()));
        userRepository.save(user);
    }

    @Override
    public User showUser(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public List<User> showAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User findByEmail(String email) {
        return userRepository.findUserByEmail(email);
    }

    @Override
    public void update(User user) {


    }

    @Override
    public void deleteById(Long id) {
        userRepository.delete(id);

    }
}
