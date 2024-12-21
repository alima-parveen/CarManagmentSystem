package com.example.carmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;
//
//import io.swagger.v3.oas.models.OpenAPI;
//import io.swagger.v3.oas.models.info.Info;

@SpringBootApplication(scanBasePackages = {"com.example.carmanagement", "com.example.carmanagement.swaggerconfig"})
public class CarmanagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarmanagementApplication.class, args);
	}


}
