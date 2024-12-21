package com.example.carmanagement.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

@Entity
@Table(name = "car")
public class Car {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	@Column(name = "car_name")
	@NotBlank(message = "Car name is required")
    private String name;

    @Column(name = "car_model")
    @NotBlank(message = "Model is required")
    private String model;

    @Column(name = "year")
    @Min(value = 1886, message = "Year must be valid (greater than 1886)")
    private int year;

    @Column(name = "price")
    @Positive(message = "Price must be greater than zero")
    private double price;

    @Column(name = "color")
    @NotBlank(message = "Color is required")
    private String color;

    @Column(name = "fuel_type")
    @NotBlank(message = "Fuel type is required")
    private String fuelType;
    

	 public Car(){
		 
	 }

	public Car(String name, String model, int year, double price, String color, String fuelType) {
		super();
		this.name = name;
		this.model = model;
		this.year = year;
		this.price = price;
		this.color = color;
		this.fuelType = fuelType;
	}

    
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", model=" + model + ", year=" + year + ", price=" + price
				+ ", color=" + color + ", fuelType=" + fuelType + "]";
	}
	
	

}
