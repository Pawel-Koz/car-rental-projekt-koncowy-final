package pl.pawelkozlowski.service;

import pl.pawelkozlowski.entities.Car;
import pl.pawelkozlowski.entities.Rental;
import pl.pawelkozlowski.entities.dto.CarDto;
import pl.pawelkozlowski.entities.dto.RentalDto;

import java.util.List;

public interface RentalService {

    Rental addRental(RentalDto rentalDto);
    List<Rental> showAllRentals();
    Rental showRental(Long id);
    Rental showByUser(Long id);
    Rental updateRental(RentalDto rentalDto);
    void deleteRental(Long id);

}
