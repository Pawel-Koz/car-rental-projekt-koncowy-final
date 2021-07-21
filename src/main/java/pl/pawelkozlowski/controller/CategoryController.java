package pl.pawelkozlowski.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.pawelkozlowski.entities.Car;
import pl.pawelkozlowski.entities.Category;
import pl.pawelkozlowski.entities.dto.CarDto;
import pl.pawelkozlowski.service.CategoryService;

import javax.validation.Valid;
import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping(value = "/admin/category")
public class CategoryController {
    private final CategoryService service;

    @GetMapping("/add")
    public String addCategory(Category category){
    return "/category/categoryAdd";
    }

    @PostMapping("/add")
    public String addPost(@Valid  Category category, BindingResult result){
        Category catToCheck = service.showCategory(category.getName());
        if(!result.hasErrors() && catToCheck==null){
            service.addCategory(category);
            return "/admin/adminPanel";
        } else{
            if(catToCheck!=null){
                result.rejectValue("name", "error.category", "Kategoria juz istnieje");
                return "category/categoryAdd";
            }
            return "category/categoryAdd";
        }
    }

    @GetMapping("/list")
    public String showList(Model model){
        model.addAttribute("categories", service.showAll());
        return "/category/categoryList";
    }

    @GetMapping("/edit/{id}")
    public String editCar(Model model, @PathVariable long id) {
        Category category = service.showBiId(id);
        model.addAttribute("category", category);
        return "category/categoryAdd";
    }
    @PostMapping("edit/{id}")
    public String updateCar(@Valid Category category, BindingResult result){
        if(!result.hasErrors()){
            service.update(category);
            return "/admin/adminPanel";
        } else{
            return "category/categoryAdd";
        }
    }
    @GetMapping("delete/{id}")
    public String removeCategory(@PathVariable long id){
        service.deleteById(id);
        return "redirect:/admin/category/list";
    }
}
