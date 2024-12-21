package com.example.carmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.carmanagement.entity.Car;
import com.example.carmanagement.repository.CarRepository;
import com.example.carmanagement.service.CarService;

@RestController
@RequestMapping("/api/cars")
public class CarController {

	@Autowired
    private CarService carService;
	
	public CarController(CarService carService) {
        this.carService = carService;
    }

	//localhost:8080/api/cars/car
    @GetMapping("/car")
    public ResponseEntity<Page<Car>> getCars(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String model,
            @RequestParam(required = false) Integer year,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Car> cars = carService.getCars(name, model, year, pageable);
        return ResponseEntity.ok(cars);
    }
	
	//localhost:8080/api/cars/cars
	@GetMapping("/cars")
    public List<Car> getAllCars() {
        return carService.getAllCars();
    }
	
	//localhost:8080/api/cars
    @PostMapping
    public Car addCar(@RequestBody Car car) {
        return carService.addCar(car);
    }

    @PutMapping("/{id}")
    public Car updateCar(@PathVariable Long id, @RequestBody Car car) {
        return carService.updateCar(id, car);
    }

    @DeleteMapping("/{id}")
    public void deleteCar(@PathVariable Long id) {
        carService.deleteCar(id);
    }
}
