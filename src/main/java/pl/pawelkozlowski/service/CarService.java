package pl.pawelkozlowski.service;

import pl.pawelkozlowski.entities.Car;
import pl.pawelkozlowski.entities.Category;
import pl.pawelkozlowski.entities.dto.CarDto;

import java.util.List;
import java.util.Optional;

public interface CarService {

    void addCar(Car car);
    Car addCar(CarDto carDto);
    List <Car> showAllCars();
    Car showCar(Long id);
    Car showByVin(String vin);
    List<Car> showCarsByCategory(Category category);
    List<Car> showCarsByModel(String model);
    List<Car> showCarsByMake(String make);
    void update(Car car);
    Car updateCar(CarDto carDto);
    void deleteById(Long id);
}
