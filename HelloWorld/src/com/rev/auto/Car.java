package com.rev.auto;

import java.io.Serializable;

public class Car extends Vehicle implements Steering, Comparable<Car>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
	private transient double milesSinceOilChange;

	@Override
	public int move() {
		return Speed = 39;
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

	@Override
	public void turnRight() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnLeft() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int compareTo(Car o) {
		// TODO Auto-generated method stub
		return this.model.compareTo(o.getModel())+(this.yearMan-o.getYearMan());
	}

}
