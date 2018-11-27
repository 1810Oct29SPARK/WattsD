package com.rev.birds;

public abstract class Flightless implements Bird {

	public Flightless() {
		 
		Eat();
		Feathers();
		Eggs();
		Move();
	}
	@Override
	public void Eat() {
		 
		System.out.println("Diet: Fish");
	}

	@Override
	public void Feathers() {
		 
		System.out.println("Feathers: Basic feathers");
	}

	@Override
	public void Eggs() {
		 
		System.out.println("Egg Size: Small Eggs");
	}
	abstract void Move();
}
