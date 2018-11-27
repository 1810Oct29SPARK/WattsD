package com.rev.birds;

public abstract class Flightless implements Bird {

	public Flightless() {
		// TODO Auto-generated constructor stub
		Eat();
		Feathers();
		Eggs();
		Move();
	}
	@Override
	public void Eat() {
		// TODO Auto-generated method stub
		System.out.println("Fiss");
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
	abstract void Move();
}
