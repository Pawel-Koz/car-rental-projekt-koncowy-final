package pl.pawelkozlowski.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.pawelkozlowski.entities.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    User save(User user);
    List<User> findAll();
    Optional<User> findById(Long id);
    User findUserByEmail(String email);



}
