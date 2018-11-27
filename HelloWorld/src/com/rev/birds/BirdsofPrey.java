package com.rev.birds;

public abstract class BirdsofPrey implements Bird {

	public BirdsofPrey() {
		 
		Eat();
		Feathers();
		Eggs();
		Fly();
	}

	@Override
	public void Eat() {
		 
		System.out.println("Diet: Meats");
	}

	@Override
	public void Feathers() {
		 
		System.out.println("Feather: Basic feathers");
	}

	@Override
	public void Eggs() {
		 
		System.out.println("Egg Size: Large Eggs");
	}
	abstract void Fly();
}
