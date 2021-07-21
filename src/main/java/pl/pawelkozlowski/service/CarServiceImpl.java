package pl.pawelkozlowski.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.pawelkozlowski.entities.Car;
import pl.pawelkozlowski.entities.Category;
import pl.pawelkozlowski.entities.dto.CarDto;
import pl.pawelkozlowski.repository.CarRepository;
import pl.pawelkozlowski.repository.CategoryRepository;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class CarServiceImpl implements CarService {
    private final CarRepository carRepository;
    private final CategoryRepository categoryRepository;

    @Override
    public void addCar(Car car) {
        carRepository.save(car);
    }

    @Override
    public Car updateCar(CarDto carDto) {
        Car car = carRepository.findOne(carDto.getId());
        if(carDto.getMake()!=null && carDto.getModel()!=null && carDto.getPrzebieg()!=null && carDto.getCategory()!=null){
            car.setMake(carDto.getMake());
            car.setModel(carDto.getModel());
            car.setVin(carDto.getVin());
            car.setPrzebieg(carDto.getPrzebieg());
            car.setFuelType(carDto.getFuelType());
            Optional<Category> category = categoryRepository.findById(carDto.getCategory());
            category.ifPresent(car::setCategory);
            carRepository.save(car);

        }
        return car;
    }

    @Override
    public Car addCar(CarDto carDto) {
        Car car = new Car();
        if(carDto.getMake()!=null && carDto.getModel()!=null && carDto.getPrzebieg()!=null && carDto.getCategory()!=null){
            car.setMake(carDto.getMake());
            car.setModel(carDto.getModel());
            car.setVin(carDto.getVin());
            car.setPrzebieg(carDto.getPrzebieg());
            car.setFuelType(carDto.getFuelType());
            Optional<Category> category = categoryRepository.findById(carDto.getCategory());
            if(category.isPresent()){
                car.setCategory(category.get());
            }
            carRepository.save(car);

        }
        return car;
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
    public Car showByVin(String vin) {
        return carRepository.findByVin(vin).orElse(null);
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
