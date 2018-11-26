package com.rev.auto;

public abstract class Vehicle implements Steering{

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public abstract int move();

	public int Speed;

	public enum Fuel {
		Gas, Food, Hopes_Dreams, Human_Suffering, none
	}

	public enum Color {
		Red, Blue, Green, none
	}
}
