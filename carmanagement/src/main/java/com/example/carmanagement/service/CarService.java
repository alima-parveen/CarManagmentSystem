package com.example.carmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.carmanagement.entity.Car;
import com.example.carmanagement.repository.CarRepository;

@Service
public class CarService {
	@Autowired
    private CarRepository carRepository;
	
	public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

//    public List<Car> getCars(String name, String model, Integer year) {
//        return carRepository.findByFilters(name, model, year, );
//    }

    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    public Car addCar(Car car) {
        return carRepository.save(car);
    }

    public Car updateCar(Long id, Car updatedCar) {
        return carRepository.findById(id)
            .map(car -> {
                car.setName(updatedCar.getName());
                car.setModel(updatedCar.getModel());
                car.setYear(updatedCar.getYear());
                car.setPrice(updatedCar.getPrice());
                car.setColor(updatedCar.getColor());
                car.setFuelType(updatedCar.getFuelType());
                return carRepository.save(car);
            }).orElseThrow(() -> new RuntimeException("Car not found"));
    }

    public void deleteCar(Long id) {
        carRepository.deleteById(id);
    }
    
    public Page<Car> getCars(String name, String model, Integer year, Pageable pageable) {
        return carRepository.findByFilters(name, model, year, pageable);
    }

}
