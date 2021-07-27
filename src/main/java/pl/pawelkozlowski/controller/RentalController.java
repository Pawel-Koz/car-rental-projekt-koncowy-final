package pl.pawelkozlowski.controller;

import lombok.AllArgsConstructor;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.pawelkozlowski.entities.Car;
import pl.pawelkozlowski.entities.Category;
import pl.pawelkozlowski.entities.Rental;
import pl.pawelkozlowski.entities.dto.CarDto;
import pl.pawelkozlowski.entities.dto.RentalDto;
import pl.pawelkozlowski.service.CarService;
import pl.pawelkozlowski.service.RentalService;

import javax.naming.Binding;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.io.Serializable;
import java.util.List;

@Controller
@SessionAttributes("user")
@AllArgsConstructor
@RequestMapping(value = "/")
public class RentalController {
    private final RentalService rentalService;


    @GetMapping("/rental/car/add/{id}/{id1}")
    public String addRental(Model model, @PathVariable long id, @PathVariable long id1){
        RentalDto rentalDto = new RentalDto();
        rentalDto.setCar(id);
        rentalDto.setUser(id1);
        model.addAttribute("rentalDto",rentalDto);
        return "rental/rentalAdd";
    }

    @PostMapping("/rental/car/add/{id}/{id1}")
    public String addRentalPost(@Valid RentalDto rentalDto, BindingResult result){
        if(!result.hasErrors()){
            rentalService.addRental(rentalDto);
            return "customer/customerPanel";
        }
        return "cars/userCarList";
    }
    @GetMapping("/admin/rental/list")
    public String showList(Model model){
        model.addAttribute("rentals", rentalService.showAllRentals());
        return "/rental/rentalList";
    }

    @GetMapping("/admin/rental/edit/{id}")
    public String editRental(Model model, @PathVariable long id) {
        Rental rental = rentalService.showRental(id);
        model.addAttribute("rentalDto", rental);
        return "rental/rentalAdd";
    }

    @PostMapping("/admin/rental/edit/{id}")
    public String updateRental(@Valid RentalDto rentalDto, BindingResult result){
        if(!result.hasErrors()){
            rentalService.updateRental(rentalDto);
            return "/admin/adminPanel";
        } else{
            return "rental/rentalAdd";
        }
    }
    @GetMapping("/admin/rental/delete/{id}")
    public String removeCar(@PathVariable long id) {
        rentalService.deleteRental(id);
        return "redirect:/admin/rental/list";
    }

}
