package com.telusko.quizservice.model;

public class Car {
	//private Integer id;
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
