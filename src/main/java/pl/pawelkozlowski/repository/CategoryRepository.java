package pl.pawelkozlowski.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.pawelkozlowski.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    Category save(Category category);

}
