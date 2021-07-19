package pl.pawelkozlowski.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.pawelkozlowski.entities.Rental;

import java.util.List;
import java.util.Optional;

public interface RentalRepository extends JpaRepository<Rental, Long> {

    Rental save(Rental rental);
    List<Rental> findAll();
    Optional<Rental> findById(Long id);
    Optional<Rental>deleteById(Long id);



}
