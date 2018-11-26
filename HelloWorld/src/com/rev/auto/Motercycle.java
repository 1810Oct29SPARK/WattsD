package com.rev.auto;

public class Motercycle extends Vehicle {

	public Color color;
	public Fuel fuel;

	public Motercycle(Color color, Fuel fuel) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int move() {
		// TODO Auto-generated method stub
		return Speed = 50;
	}

	@Override
	public void turnRight() {
		// TODO Auto-generated method stub
		System.out.println("Turn Right");
	}

	@Override
	public void turnLeft() {
		// TODO Auto-generated method stub
		System.out.println("Turn Left");
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Fuel getFuel() {
		return fuel;
	}

	public void setFuel(Fuel fuel) {
		this.fuel = fuel;
	}

	@Override
	public String toString() {
		return "Motercycle [color=" + color + ", fuel=" + fuel + "]";
	}

}
