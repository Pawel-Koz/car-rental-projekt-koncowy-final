package pl.pawelkozlowski.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.pawelkozlowski.entities.Car;
import pl.pawelkozlowski.entities.Rental;
import pl.pawelkozlowski.entities.User;
import pl.pawelkozlowski.entities.dto.RentalDto;
import pl.pawelkozlowski.repository.CarRepository;
import pl.pawelkozlowski.repository.RentalRepository;
import pl.pawelkozlowski.repository.UserRepository;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

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
            rental.setFinishDate(rentalDto.getFinishDate());
            Optional<User> user = userRepository.findById(rentalDto.getUser());
            user.ifPresent(rental::setUser);
            Optional<Car> car = carRepository.findById(rentalDto.getCar());
            if(car.isPresent()){
                rental.setCar(car.get());
            }
            rentalRepository.save(rental);
        }
        return rental;
    }

    @Override
    public List<Rental> showAllRentals() {
        return rentalRepository.findAll();
    }

    @Override
    public Rental showRental(Long id) {
        return rentalRepository.findOne(id);
    }

    @Override
    public Rental showByUser(Long id) {
        return null;
    }

    @Override
    public Rental updateRental(RentalDto rentalDto) {
        Rental rental = rentalRepository.findOne(rentalDto.getId());
        if(rentalDto.getStartDate()!=null && rentalDto.getFinishDate()!=null
                && rentalDto.getCar()!=null && rentalDto.getUser()!=null){
            rental.setStartDate(rentalDto.getStartDate());
            rental.setFinishDate(rentalDto.getFinishDate());
            Optional<User> user = userRepository.findById(rentalDto.getUser());
            user.ifPresent(rental::setUser);
            Optional<Car> car = carRepository.findById(rentalDto.getCar());
            if(car.isPresent()){
                rental.setCar(car.get());
            }
            rentalRepository.save(rental);
        }
        return rental;
    }

}
