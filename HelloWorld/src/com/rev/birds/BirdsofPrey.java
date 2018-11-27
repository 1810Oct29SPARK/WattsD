package com.rev.birds;

public abstract class BirdsofPrey implements Bird {

	public BirdsofPrey() {
		// TODO Auto-generated constructor stub
		Eat();
		Feathers();
		Eggs();
		Fly();
	}

	@Override
	public void Eat() {
		// TODO Auto-generated method stub
		System.out.println("Meats");
	}

	@Override
	public void Feathers() {
		// TODO Auto-generated method stub
		System.out.println("Basic feathers");
	}

	@Override
	public void Eggs() {
		// TODO Auto-generated method stub
		System.out.println("Your Eggs are lame and you should feel lame");
	}
	abstract void Fly();
}
