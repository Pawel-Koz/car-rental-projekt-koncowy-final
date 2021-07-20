package pl.pawelkozlowski.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.pawelkozlowski.entities.Category;
import pl.pawelkozlowski.service.CategoryService;

import javax.validation.Valid;

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
}
