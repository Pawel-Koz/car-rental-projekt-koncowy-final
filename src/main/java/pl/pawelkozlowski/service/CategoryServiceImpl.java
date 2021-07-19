package pl.pawelkozlowski.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.pawelkozlowski.entities.Category;
import pl.pawelkozlowski.repository.CategoryRepository;

import java.util.List;
@AllArgsConstructor
@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;



    @Override
    public void addCategory(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public Category showCategory(String name) {
        return categoryRepository.findByName(name).orElse(null);
    }

    @Override
    public Category showCategoryBiId(Long id) {
        return categoryRepository.findById(id).orElse(null);
    }

    @Override
    public List<Category> showAll() {
        return categoryRepository.findAll();
    }

    @Override
    public void update(Category category) {

    }

    @Override
    public void deleteByName(Long id) {
        categoryRepository.delete(id);
    }
}
