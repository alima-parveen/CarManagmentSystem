package com.example.carmanagement.swaggerconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info; // Annotation for OpenAPIDefinition
import io.swagger.v3.oas.models.OpenAPI; // OpenAPI Model
//import io.swagger.v3.oas.models.info.Info; // Info Model for OpenAPI

@Configuration
@OpenAPIDefinition(info = @Info(title = "Car Management API", version = "v1", description = "API Documentation for Car Management"))
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new io.swagger.v3.oas.models.info.Info() // Fully qualify Info here
                        .title("Car Management API")
                        .version("v1")
                        .description("API Documentation for Car Management"));
    }
}
