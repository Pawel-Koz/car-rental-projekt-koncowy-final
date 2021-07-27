package pl.pawelkozlowski.controller;

import lombok.AllArgsConstructor;
import org.hibernate.Hibernate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.pawelkozlowski.entities.Car;
import pl.pawelkozlowski.entities.dto.CarDto;
import pl.pawelkozlowski.entities.Category;
import pl.pawelkozlowski.service.CarService;
import pl.pawelkozlowski.service.CategoryService;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.awt.print.Book;
import java.util.List;


@Controller

@AllArgsConstructor
//@RequestMapping(value = "/")
public class CarController {
    private final CarService service;
    private final CategoryService categoryService;

    @GetMapping("/admin/car/add")
    public String addCar(Model model){
        List<Category> categories = categoryService.showAll();
        model.addAttribute("categories",categories);
        model.addAttribute("carDto",new CarDto());
        return "/cars/carAdd";
    }
    @PostMapping("/admin/car/add")
    public String add(@Valid CarDto carDto, BindingResult result){
        Car carToCheck = service.showByVin(carDto.getVin());
        if(!result.hasErrors() && carToCheck==null){
            service.addCar(carDto);
            return "/admin/adminPanel";
        } else{
            if(carToCheck!=null){
                result.rejectValue("vin", "error.car", "Vin number saved already");
                return "cars/carAdd";
            }
            return "cars/carAdd";

        }
    }
    @GetMapping("/admin/car/list")
    public String showList(Model model){
        model.addAttribute("cars", service.showAllCars());
        return "/cars/carList";
    }
    @GetMapping("/customer/car/list")
    public String showListForUser(Model model){
        model.addAttribute("cars", service.showAllCars());
        return "/cars/userCarList";
    }

    @GetMapping("/admin/car/edit/{id}")
    public String editCar(Model model, @PathVariable long id) {
        Car car = service.showCar(id);
        List<Category> categories = categoryService.showAll();
        model.addAttribute("carDto", car);
        model.addAttribute("categories", categories);
        return "cars/carAdd";
    }

    @PostMapping("/admin/car/edit/{id}")
    public String updateCar(@Valid CarDto carDto, BindingResult result){
        if(!result.hasErrors()){
            service.updateCar(carDto);
            return "/admin/adminPanel";
        } else{
            return "cars/carAdd";
        }
    }

    @GetMapping("/admin/car/delete/{id}")
    public String removeCar(@PathVariable long id) {
        service.deleteById(id);
        return "redirect:/admin/car/list";
    }

}
