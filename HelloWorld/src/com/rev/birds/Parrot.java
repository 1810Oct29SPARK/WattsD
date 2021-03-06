package com.rev.birds;

public class Parrot extends Domestic {

	public Parrot() {
		 
		super();
		String className = this.getClass().getSimpleName();
		System.out.println("Name: " + className);
	}

	public static void main(String[] args) {
		 
		new Parrot();
	}

	@Override
	public void Eat() {
		 
		super.Eat();
	}

	@Override
	public void Feathers() {
		 
		System.out.println("Feather: Rainbow feathers");
	}

	@Override
	public void Eggs() {
		 
		super.Eggs();
	}

	@Override
	void Fly() {
		 
		System.out.println("Move Type: I believe it can fly");
	}

}
