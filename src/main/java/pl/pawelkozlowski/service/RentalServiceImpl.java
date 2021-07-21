package pl.pawelkozlowski.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.pawelkozlowski.entities.Rental;
import pl.pawelkozlowski.entities.dto.RentalDto;
import pl.pawelkozlowski.repository.CarRepository;
import pl.pawelkozlowski.repository.RentalRepository;
import pl.pawelkozlowski.repository.UserRepository;

import java.util.List;
@AllArgsConstructor
@Service
public class RentalServiceImpl implements RentalService {
    private final RentalRepository rentalRepository;
    private final CarRepository carRepository;
    private final UserRepository userRepository;


    @Override
    public Rental addRental(RentalDto rentalDto) {
        Rental rental = new Rental();
        if(rentalDto.getStartDate()!=null && rentalDto.getFinishDate()!=null
                && rentalDto.getCar()!=null && rentalDto.getUser()!=null){
            rental.setStartDate(rentalDto.getStartDate());
        }
        return null;
    }

    @Override
    public List<Rental> showAllRentals() {
        return null;
    }

    @Override
    public Rental showRental(Long id) {
        return null;
    }

    @Override
    public Rental showByUser(Long id) {
        return null;
    }

    @Override
    public Rental updateRental(RentalDto rentalDto) {
        return null;
    }
}
