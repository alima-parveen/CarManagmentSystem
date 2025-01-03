package com.example.carmanagement.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.carmanagement.entity.Car;

public interface CarRepository extends JpaRepository<Car, Long>{
	
    @Query("SELECT c FROM Car c WHERE " +
            "(:name IS NULL OR c.name = :name) AND " +
            "(:model IS NULL OR c.model = :model) AND " +
            "(:year IS NULL OR c.year = :year)")
    Page<Car> findByFilters(@Param("name") String name,
            @Param("model") String model,
            @Param("year") Integer year,
            Pageable pageable);

}
