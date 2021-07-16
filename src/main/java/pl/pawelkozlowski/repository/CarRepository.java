package pl.pawelkozlowski.repository;

import com.sun.xml.bind.v2.model.core.ID;
import org.springframework.data.jpa.repository.JpaRepository;
import pl.pawelkozlowski.entities.Car;
import pl.pawelkozlowski.entities.Category;

import java.util.List;
import java.util.Optional;

public interface CarRepository extends JpaRepository<Car, Long> {

    Car save(Car car);
    List<Car> findAll();
    void delete(Car car);

    List<Car> findAllByModel(String model);
    Optional<Car>findById(Long id);
    List<Car> findAllByCategory(Category category);


}
