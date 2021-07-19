package pl.pawelkozlowski.service;

import pl.pawelkozlowski.entities.Category;

import java.util.List;

public interface CategoryService {


    void addCategory(Category category);
    Category showCategory(String name);
    Category showCategoryBiId(Long id);
    List<Category> showAll();
    void update(Category category);
    void deleteByName(Long id);





}
