package pl.pawelkozlowski.service;

import pl.pawelkozlowski.entities.Car;
import pl.pawelkozlowski.entities.Category;

import java.util.List;

public interface CarService {

    void addCar(Car car);
    List<Car> showAllCars();
    Car showCar(Long id);
    List<Car> showCarsByCategory(Category category);
    List<Car> showCarsByModel(String model);
    List<Car> showCarsByMake(String make);
    void update(Car car);
    void deleteById(Long id);
}
