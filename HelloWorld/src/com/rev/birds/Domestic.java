package com.rev.birds;

public abstract class Domestic implements Bird {

	public Domestic() {
		 
		Eat();
		Feathers();
		Eggs();
		Fly();
	}

	@Override
	public void Eat() {
		 
		System.out.println("Diet: Seeds");
	}

	@Override
	public void Feathers() {
		 
		System.out.println("Feathers: Basic feathers");
	}

	@Override
	public void Eggs() {
		 
		System.out.println("Egg Size: Medium Eggs");
	}
	abstract void Fly();
}
