package pl.pawelkozlowski.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import pl.pawelkozlowski.entities.Rental;
import pl.pawelkozlowski.service.CarService;
import pl.pawelkozlowski.service.RentalService;

@Controller
@AllArgsConstructor
public class RentalController {
    private final RentalService rentalService;
    private final CarService carService;

}
