package pl.pawelkozlowski.repository;

import com.sun.xml.bind.v2.model.core.ID;
import org.springframework.data.jpa.repository.JpaRepository;
import pl.pawelkozlowski.entities.Car;
import pl.pawelkozlowski.entities.Category;

import java.util.List;
import java.util.Optional;

public interface CarRepository extends JpaRepository<Car, Long> {

    List<Car> findAllByModel(String model);
    List<Car> findAllByCategory(Category category);
    List<Car> findAllByMake(String make);
    Optional<Car> findByVin(String vin);
    Optional<Car> findById(Long id);



}
