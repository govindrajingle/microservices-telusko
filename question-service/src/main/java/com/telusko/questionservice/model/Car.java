package com.telusko.questionservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String carName;
	private Integer carSpeed;
	
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public Integer getCarSpeed() {
		return carSpeed;
	}
	public void setCarSpeed(Integer carSpeed) {
		this.carSpeed = carSpeed;
	}
	public Car(String carName, Integer carSpeed) {
		super();
		this.carName = carName;
		this.carSpeed = carSpeed;
	}
	public Car() {
		
	}
}
