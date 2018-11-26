package com.rev.auto;

public class Car extends Vehicle {

	public Car(int yearMan, String model, String make, double milesSinceOilChange) {
		super();
		this.yearMan = yearMan;
		this.model = model;
		this.make = make;
		this.milesSinceOilChange = milesSinceOilChange;
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static int milesBetweenChanges = 5000;
	private int yearMan;
	private String model;
	public String make;
	private double milesSinceOilChange;

	@Override
	public void move() {
		System.out.println("Car is Moving");
	}

	public double getMilesSinceOilChange() {
		return milesSinceOilChange;
	}

	public void setMilesSinceOilChange(int milesSinceOilChange) {
		this.milesSinceOilChange = milesSinceOilChange;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getYearMan() {
		return yearMan;
	}

	public void setYearMan(int yearMan) {
		this.yearMan = yearMan;
	}

	@Override
	public String toString() {
		return "Car [yearMan=" + yearMan + ", model=" + model + ", make=" + make + ", milesSinceOilChange="
				+ milesSinceOilChange + "]";
	}
}
