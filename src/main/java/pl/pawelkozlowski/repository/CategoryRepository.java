package pl.pawelkozlowski.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.pawelkozlowski.entities.Category;

import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category, Long> {



    Optional<Category> findByName(String name);
    Optional<Category> findById(Long id);


}
