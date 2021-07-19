package pl.pawelkozlowski.service;

import lombok.AllArgsConstructor;
import pl.pawelkozlowski.entities.Car;
import pl.pawelkozlowski.entities.Category;
import pl.pawelkozlowski.repository.CarRepository;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
public class CarServiceImpl implements CarService {
    private final CarRepository carRepository;


    @Override
    public void addCar(Car car) {
        carRepository.save(car);
    }

    @Override
    public List<Car> showAllCars() {
        return carRepository.findAll();
    }

    @Override
    public Car showCar(Long id) {
        return carRepository.findOne(id);
    }

    @Override
    public List<Car> showCarsByCategory(Category category) {
        return carRepository.findAllByCategory(category);
    }

    @Override
    public List<Car> showCarsByModel(String model) {
        return carRepository.findAllByModel(model);
    }

    @Override
    public List<Car> showCarsByMake(String make) {
        return carRepository.findAllByMake(make);
    }

    @Override
    public void update(Car car) {

    }

    @Override
    public void deleteById(Long id) {
        carRepository.delete(id);
    }
}
