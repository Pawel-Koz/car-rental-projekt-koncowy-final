package pl.pawelkozlowski.controller;

import lombok.AllArgsConstructor;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.pawelkozlowski.entities.Car;
import pl.pawelkozlowski.entities.Rental;
import pl.pawelkozlowski.entities.dto.RentalDto;
import pl.pawelkozlowski.service.CarService;
import pl.pawelkozlowski.service.RentalService;

import javax.servlet.http.HttpSession;
import java.io.Serializable;

@Controller
@SessionAttributes("user")
@AllArgsConstructor
@RequestMapping(value = "/rental/car")
public class RentalController {
    private final RentalService rentalService;
    private final CarService carService;

    @GetMapping("/add/{id}/{id1}")
    public String addRental(Model model, @PathVariable long id, @PathVariable long id1){
        RentalDto rentalDto = new RentalDto();
        rentalDto.setCar(id);
        rentalDto.setUser(id1);
        model.addAttribute("rentalDto",rentalDto);
        return "rental/rentalAdd";
    }

}
