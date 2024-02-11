package com.telusko.questionservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telusko.questionservice.model.Car;

public interface CarRepository  extends JpaRepository<Car, Integer> {
	
}
