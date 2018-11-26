package com.rev.auto;

public class Boat extends Vehicle implements Steering{

	public Boat(Color color, double hullSize, Fuel fuel) {
		super();
		this.color = color;
		this.hullSize = hullSize;
		this.fuel = fuel;
	}
	
	protected Color color;
	protected double hullSize;
	protected Fuel fuel;
	public Fuel getFuel() {
		return fuel;
	}

	public void setFuel(Fuel fuel) {
		this.fuel = fuel;
	}

	public Boat() {
		super();
		System.out.println("Show me dah boat");
		// TODO Auto-generated constructor stub
	}

	@Override
	public int move() {
		// TODO Auto-generated method stub
		return Speed = 23;

	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public double getHullSize() {
		return hullSize;
	}

	public void setHullSize(double hullSize) {
		this.hullSize = hullSize;
	}

	@Override
	public String toString() {
		return "Boat [color=" + color + ", hullSize=" + hullSize + ", fuel=" + fuel + "]";
	}

	@Override
	public void turnRight() {
		// TODO Auto-generated method stub
		System.out.println("Paddle Right");
	}

	@Override
	public void turnLeft() {
		// TODO Auto-generated method stub
		System.out.println("Paddle Left");
	}

}
